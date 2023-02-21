package basic;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.next();
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		int birthYear = 2023 - age;
		
//		System.out.println("\n이름: " + name + "\n나이: " + age + "세" + "\n출생년도: " + (2023-age) + "년");
		System.out.printf("\n이름: %s \n나이: %d세 \n출생년도: %d년", name, age, birthYear);
		
		sc.close();
				
	}

}
