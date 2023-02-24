package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {

		/*
		 1. 2가지의 정수를 1~100 사이의 난수를 발생시켜서 지속적으로 문제를 출제한 후 정답을 입력받으세요.
		 	사용자가 0을 입력하면 반복문을 탈출시키세요.

		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.

		 출력 예시)
		 *** 연산 퀴즈 ***
		 # 종료하시려면 0을 입력해 주세요.
		 (숫자) (연산자) (숫자) = ???
		 > (숫자)

		 --------------------------
		 정답 횟수 : X회
		 오답 횟수 : X회
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("*** 연산 퀴즈 ***\n# 종료하시려면 0을 입력해 주세요.\n(단, 정답이 0일 경우는 종료되지 않습니다.)\n---------------------------");

		int countTrue = 0, countFalse = 0;

		while(true) {
			
			int num1 = (int) (Math.random()*100+1);
			int num2 = (int) (Math.random()*100+1);
			int i = (int) (Math.random()*2+1);
			int temp;

			if (i == 1) {
				System.out.print(num1 + " + " + num2 + " = ???\n> ");
				int answer1 = sc.nextInt();
				if (answer1 == 0) break;
				if (answer1 == num1 + num2) {
					System.out.println("정답입니다!\n");
					countTrue++;
				} else {
					System.out.println("오답입니다.\n");
					countFalse++;
				}
				
			} else {
				
				if (num2 > num1) {
					temp = num1;
					num1 = num2;
					num2 = temp;
				}
				
				System.out.print(num1 + " - " + num2 + " = ???\n> ");
				int answer2 = sc.nextInt();
				
				if (answer2 == 0 && num1 == num2) {
					System.out.println("정답입니다!\n");
					countTrue++;					
				} else {
					break;
				}
				if (answer2 == num1 - num2) {
					System.out.println("정답입니다!\n");
					countTrue++;
				} else {
					System.out.println("오답입니다.\n");
					countFalse++;
				}
			}
		}
		System.out.printf("\n연산 퀴즈를 종료합니다.\n---------------------------\n정답 횟수 : %d회\n오답 횟수 : %d회", countTrue, countFalse);
		
		sc.close();
	}
}

