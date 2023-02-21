package basic;

import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {

		/*
		 - 정수 3개를 입력받습니다.
		 - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해보세요.

		 # max, mid, min이라는 변수를 미리 선언하셔서 판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
		   마지막에 한 번에 출력하시면 되겠습니다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수를 입력해주세요.\n: ");
		int first = sc.nextInt();

		System.out.print("두 번째 정수를 입력해주세요.\n: ");
		int second = sc.nextInt();

		System.out.print("세 번째 정수를 입력해주세요.\n: ");
		int third = sc.nextInt();

		int max, mid, min;

		System.out.println("\n----------------------------\n");

		//		중복 없음.
				
				if (first > second) {
					if (first > third) {
						max = first;
						if (second > third) {
							mid = second; min = third;
						} else {
							mid = third; min = second;
						}
					} else {
						max = third; mid = first; min = second;			
					}
				} else if (first > third) {
					max = second; mid = first; min = third;
				} else {
					if (second > third) {
						max = second; mid = third; min = first;
					} else {
						max = third; mid = second; min = first;
					}
				}
				
		//		//////////////////////////////////////////////////
		//		
		//		중복 있음.

		if (first == second || first == third || second == third) {
			System.out.println("중복값이 있어서 정수의 대소 구분이 불가합니다.");
		} else if (first > second && first > third){
			max = first;
			if (second > third) {
				mid = second; min = third;
			} else {
				mid = third; min = second;
			}
		} else if (second > first && second > third){
			max = second;
			if (first > third) {
				mid = first; min = third;
			} else {
				mid = third; min = first;
			}
		} else {
			max = third;
			if (first > second) {
				mid = first; min = second;
			} else {
				mid = second; min = first;
			}
		}
		System.out.printf("최대값 : %d\n중간값 : %d\n최소값 : %d", max, mid, min);

		//////////////////////////////////////////////////		
		//		선생님 답안

		if (first > second && first > third) {
			max = first;
			if (second > third) {
				mid = second; min = third;
			} else {
				mid = third; min = second;
			}
		} else if (second > first && second > third) {
			max = second;
			if (first > third) {
				mid = first; min = third;
			} else {
				mid = third; min = first;
			}
		} else {
			max = third;
			if (first > second) {
				mid = first; min = second;
			} else {
				mid = second; min = first;
			}
		}

		System.out.printf("최대값 : %d\n중간값 : %d\n최소값 : %d", max, mid, min);

		sc.close();

	}

}
