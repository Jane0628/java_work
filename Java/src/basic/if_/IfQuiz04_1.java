package basic.if_;

import java.util.Scanner;

public class IfQuiz04_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수를 입력해주세요.\n: ");
		int first = sc.nextInt();

		System.out.print("두 번째 정수를 입력해주세요.\n: ");
		int second = sc.nextInt();

		System.out.print("세 번째 정수를 입력해주세요.\n: ");
		int third = sc.nextInt();

		int max, mid, min;

		System.out.println("\n----------------------------\n");

		if (first == second || first == third || second == third) {
			System.out.println("중복값이 있어서 정수의 대소 구분이 불가합니다.");
		} else {
			if (first > second && first > third){
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
		}
		sc.close();

	}

}
