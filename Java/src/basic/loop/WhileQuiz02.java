package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {
		
//		입력받은 수의 약수의 총합을 구하세요.
//		입력받은 값 : 12 -> 1 2 3 4 6 12 -> 28

		Scanner sc = new Scanner(System.in);
		
		System.out.println("안녕하세요. 정수를 한 개 입력해주시면 그 수의 약수의 총합을 알려드리겠습니다. :)");
		
		System.out.print("정수를 입력해주세요.\n: ");
		int num = sc.nextInt();
		
		System.out.println("\n---------------------------------------\n");
		
		int begin = 1;
		int sum = 0;
		
		while (begin <= num) {
			if (num%begin == 0) {
				sum += begin;
			}
			begin++;
		}
		System.out.printf("%d의 약수의 합은 %d입니다.", num, sum);
		
		sc.close();
	}

}
