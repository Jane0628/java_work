package basic.if_;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {

		/*
		 # 국어, 영어, 수학 점수를 각각 입력받아서 평균을 구해보세요. (소수점 첫째 자리까지 출력)
		 평균이 90점을 넘는다면, 다시 한 번 조건을 검사해서
		 95 ~ 100 -> A+
		 94 ~ 90 -> A0
		 80점대는 B, 70점대는 C, 60점대는 D, 나머지는 모두 F 처리하시면 됩니다. (100점이 만점)

		 ex)
		 평균 점수 : 95.5
		 당신의 학점은 A+입니다.		 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("안녕하세요. 점수를 입력해주시면 당신의 예상 학점을 알려드리도록 하겠습니다.\n");

		//		System.out.print("국어 점수를 입력해주세요.\n: ");
		//		double korean = sc.nextDouble();
		//
		//		System.out.print("\n영어 점수를 입력해주세요.\n: ");
		//		double english = sc.nextDouble();
		//
		//		System.out.print("\n수학 점수를 입력해주세요.\n: ");
		//		double math = sc.nextDouble();
		//
		//		double average = (korean + english + math)/3;
		//
		//		String grade = "";
		//
		//		System.out.println("\n---------------------------------------------\n");
		//
		//		if (average > 100) {
		//			System.out.println("최대 점수를 초과했습니다.\n오타 여부를 확인해주시기 바랍니다.");
		//		} else {
		//			if (average >= 95) {
		//				grade = "A+";
		//			} else if (average >= 90) {
		//				grade = "A0";
		//			} else if (average >= 80) {
		//				grade = "B";
		//			} else if (average >= 70) {
		//				grade = "C";
		//			} else if (average >= 60) {
		//				grade = "D";
		//			} else {
		//				grade = "F";
		//			}
		//			System.out.printf("평균 점수 : %.1f\n당신의 예상 학점은 %s입니다.", average, grade);
		//		}
		//		sc.close();

		//////////////////////////////////////////////////////

		System.out.print("국어 점수를 입력해주세요.\n: ");
		int korean = sc.nextInt();
		if (korean > 100 || korean < 0) {
			System.out.println("\n잘못된 점수입니다.\n오타 여부를 확인해주세요.");
		} else {
			System.out.print("\n영어 점수를 입력해주세요.\n: ");
			int english = sc.nextInt();
			if (english > 100 || english < 0) {
				System.out.println("\n잘못된 점수입니다.\n오타 여부를 확인해주세요.");
			} else {
				System.out.print("\n수학 점수를 입력해주세요.\n: ");
				int math = sc.nextInt();
				if (math > 100 || math < 0) {
					System.out.println("\n잘못된 점수입니다.\n오타 여부를 확인해주세요.");
				} else {
					System.out.println("\n---------------------------------------\n");
					double average = (double) (korean + english + math)/3;
					String grade;

					if (average >= 95) {
						grade = "A+";
					} else if (average >= 90) {
						grade = "A0";
					} else if (average >= 80) {
						grade = "B";
					} else if (average >= 70) {
						grade = "C";
					} else if (average >= 60) {
						grade = "D";
					} else {
						grade = "F";
					}
					System.out.printf("평균 : %.1f점\n당신의 예상 학점은 %s입니다.", average, grade);
				}
			}
		}
		sc.close();
	}

}
