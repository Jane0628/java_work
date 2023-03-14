package etc.api.io.buffered;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BufferedQuiz {

	public static void main(String[] args) {

		/*
        1. LocalDate클래스를 이용해서 file폴더 내에 하위 경로로
         오늘 날짜 20230314file 이라는 이름으로 폴더를 생성하세요.
        2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
        3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
         파일을 작성합니다. 
         (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
          연결해 주시면 됩니다.)
        4. '그만'으로 파일이 작성되었다면, 아무방법으로나 
         파일을 읽어서 콘솔에 출력해 보세요.
		 */

		LocalDate today = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");

		File folder = new File("C:/Work/file/" + today.format(dtf) + "file");

		if(folder.exists()) {
			System.out.println("폴더가 이미 존재합니다.");
		} else {
			System.out.println("폴더가 생성되었습니다.");
		}

		///////////////////////////////////////////////////////////////////////

		Scanner sc = new Scanner(System.in);

		System.out.println("파일명을 입력해주세요.");
		System.out.print("> ");
		String fileName = sc.next();
		sc.nextLine();

		System.out.println("\n내용 입력을 시작하겠습니다.");
		System.out.println("'그만'을 입력하시면 입력이 중단됩니다.");
		System.out.println("---------------------------------------");

		BufferedWriter bw = null;
		String total = "";

		try {
			bw = new BufferedWriter(new FileWriter(folder));

			while(true) {
				String userInput = sc.nextLine();

				if(userInput.equals("그만")) {
					System.out.println("---------------------------------------");
					System.out.println("입력을 종료합니다.");
					break;
				}
				total += userInput;

			}

			bw.write(total);


		} catch (Exception e) {
			System.out.println("오류가 발생했습니다.");








		}

	}
}