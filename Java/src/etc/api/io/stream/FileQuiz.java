package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz {

	public static void main(String[] args) {

		/*
        1. 스캐너를 통해서 파일명을 정확히 입력받습니다.
        
        2. file폴더에 해당 파일이 존재한다면 해당 파일을 
        upload폴더로 복사하세요.
        파일이 존재하지 않는다면 "파일명이 없습니다." 예외구문을 출력하세요.
        
        3. 복사 도중에 에러가 발생하면 "파일 처리 중 예외 발생!" 구문을 출력.
        */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("파일명을 입력해주세요.\n> ");
		String fileName = sc.next();
		
		FileInputStream checkFile = null;
		FileOutputStream copyFile = null;
		
		try {
			
			if(fileName.equals("cutePic")) {
				checkFile = new FileInputStream("C:\\Work\\file\\" + fileName + ".png");
				copyFile = new FileOutputStream("C:\\Work\\upload\\copy.png");
			} else {
				checkFile = new FileInputStream("C:\\Work\\file\\" + fileName + ".txt");				
				copyFile = new FileOutputStream("C:\\Work\\upload\\copy.txt");				
			}			
			
			byte[] arr = new byte[100];
			
			//////////////////////////////////////////////////////
			
			int result;
			
			while((result = checkFile.read(arr)) != 1) {
				copyFile.write(arr, 0, result);
			}
			
			//////////////////////////////////////////////////////
			
//			while(true) {
//				int i = checkFile.read(arr);
//				if(i == -1) break;
//				
//				copyFile.write(arr, 0, i);
//			}	
			
			System.out.println("파일이 복사되었습니다.");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일명이 없습니다.");
		} catch (IOException e) {
			System.out.println("파일 처리 중 예외 발생!");
		} finally {
			try {
				checkFile.close();
				copyFile.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				System.out.println("파일이 존재하지 않으므로 프로그램을 종료합니다.");
			}
		}
		
	}

}
