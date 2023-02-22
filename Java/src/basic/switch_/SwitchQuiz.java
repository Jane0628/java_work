package basic.switch_;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {

		/*
		 - 정수를 하나 입력받고, 연산자를 하나 입력받으세요.
		 다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로 연산 결과를 출력해주시면 됩니다.
		 (switch문 사용)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수를 입력해주세요.\n: ");
		int first = sc.nextInt();

		System.out.print("\n연산자를 아래 넷 중에 하나로 적어주세요.\n[+, -, *, /]\n: ");
		String cal = sc.next();

		System.out.print("\n두 번째 정수를 입력해주세요.\n: ");
		int second = sc.nextInt();

		System.out.println("\n----------------------------------------------\n");
		
		int result = 0;
		boolean flag = false;
		
		switch(cal) {
		
		case "+":
			result = first + second;
			break;
			
		case "-":
			result = first - second;
			break;
			
		case "*":
			result = first * second;
			break;
			
		case "/":
			if(second == 0) {
				System.out.println("연산할 수 없는 입력값입니다.");
				flag = true;
				break; 
			}
			result = first / second;
			break;
			
		default :
			System.out.println("연산자를 잘못 입력하셨습니다.");
			flag = true;
			break;
		}
		
		if (!flag) {
			System.out.printf("%d %s %d = %d\n", first, cal, second, result);			
		}
		
//		switch(cal) {
//
//		case "+" :
//			System.out.println(first + " + " + second + " = " + (first + second));			
//			break;
//
//		case "-" :
//			System.out.println(first + " - " + second + " = " + (first - second));						
//			break;
//
//		case "*" :
//			System.out.println(first + " * " + second + " = " + (first * second));					
//			break;
//
//		case "/" :
//			if (second == 0) {
//				System.out.println("0으로는 수를 나눌 수 없습니다.");
//				break;
//			}
//			System.out.println(first + " / " + second + " = " + (first / second));				
//			break;
//
//		default :
//			System.out.println("연산자를 잘못 입력하셨습니다.");
//			break;
//		}
		
		
		
		
		sc.close();

	}

}
