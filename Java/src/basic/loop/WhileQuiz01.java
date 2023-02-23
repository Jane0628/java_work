package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {

		/*
		 # 사용자에게 구구단 단수를 입력받아서 해당 단수의 구구단을 출력해 보세요.

		 ex)
		 구구단을 입력하세요 : 4
		 *** 구구단 4단 ***
		 4 X 1 = 4
		 4 X 2 = 8
		 4 X 3 = 12
		 .
		 .
		 .
		 4 X 9 = 36 
		 */

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("안녕하세요. 원하는 정수를 말씀해주시면 해당 숫자의 구구단을 알려드리겠습니다.");
//
//		System.out.print("\n정수를 하나 입력해주세요.\n: ");
//		int num = sc.nextInt();
//
//		System.out.println("\n----------------------------------\n");
//
//		System.out.print("*** 구구단 " + num + " 단 ***");
//
//		int begin = 1;
//		
//		while (begin <= 9) {
//			System.out.printf("\n%d X %d = %d", num, begin, num*begin);
//			begin++;
//		}
//		sc.close();
		
		/////////////////////////////////////////////////////////
		
		System.out.println("구구단을 외워봅시다. :)\n");
		
		int num = 2;
		int num1 = 1;
		
		while (num1 <= 9) {
			num = 2;
			while (num <= 9) {
				System.out.printf("%d * %d = %d\t", num, num1, num*num1);
				num++;
			}
			System.out.println();
			num1++;
		}
		
		
		
	}

}
