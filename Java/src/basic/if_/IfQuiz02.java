package basic.if_;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {

		/*
		 정수를 2개 입력받아서, 두 정수 중 어느 수가 큰지 혹은 같은지를 판별하시면 됩니다.
		 ex)
		 입력받은 수 : 4, 7 -> 7이 큰 수입니다.
		 입력받은 수 : 10, 3 -> 10이 큰 수입니다.
		 입력받은 수 : 5, 5 -> 같은 수입니다.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("안녕하세요. 정수 비교기입니다.\n정수 두 개를 입력해주시면 두 수를 비교해드립니다.\n");
		
		System.out.print("첫 번째 정수를 입력해주세요.\n: ");
		int first = sc.nextInt();
		
		System.out.print("\n두 번째 정수를 입력해주세요.\n: ");
		int second = sc.nextInt();
		
		System.out.println("\n----------------------------\n");
		
		if (first > second) {
			System.out.printf("더 큰 수는 %d입니다.", first);
		} else if (first == second) {
			System.out.print("두 수는 같은 수입니다.");
		} else {
			System.out.printf("더 큰 수는 %d입니다.", second);
		}
		System.out.println("\n이용해주셔서 감사합니다. :)");
		
		sc.close();
		
	}

}
