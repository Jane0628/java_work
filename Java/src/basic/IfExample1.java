package basic;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요.\n: ");
		int point = sc.nextInt();
		System.out.printf("\n당신의 점수 : %d점\n", point);
		
		System.out.println("\n------------------------------\n");
		
		if(point >= 70) {
			System.out.println("축하합니다. 합격입니다! :)");
		}
		else {
			System.out.println("아쉽게도 불합격하셨습니다. 다음 기회에 도전해보세요. :(");
		}
		System.out.println("시험 치르느라 수고하셨습니다. (__)");
		
		sc.close();
		
	}

}
