package basic;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {

		/*
		 # 스캐너를 사용하여 정수를 하나 입력받으세요.
		 
		 - 입력받은 값이 7의 배수라면 "7의 배수입니다."를 출력.
		 - 입력받은 값이 7의 배수가 아니라면 "7의 배수가 아닙니다."를 출력.
		 - 입력받은 값이 0이라면 "0입니다."를 출력하세요.
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("안녕하세요, 7의 배수 판독기입니다.\n정수를 입력해주시면 7의 배수인지 확인해드리도록 하겠습니다.\n");
		
		System.out.print("정수를 하나 입력해주세요.\n: ");
		int num = sc.nextInt();
		
		System.out.println("\n----------------------------------\n");
				
		if (num == 0) {
			System.out.println("0입니다.");
		} else if ((num % 7) == 0) {
			System.out.println("7의 배수입니다.");
		} else {
			System.out.println("7의 배수가 아닙니다.");
		}
		System.out.println("이용해주셔서 감사합니다. :)");
		
		sc.close();
		
	}

}
