package basic.array;

public class Array2DQuiz {

	public static void main(String[] args) {

		int[][] score = {
				{79, 80, 99}, //A학생
				{95, 85, 89}, //B학생
				{90, 65, 56}, //C학생
				{69, 78, 77}  //D학생
				//과목 : 3과목
		};

		String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
		String[] subName = {"국어", "영어", "수학"};

		/*
		 1. 각 학생의 평균을 출력해 보세요.
		 2. 각 과목의 평균을 출력해 보세요.
		 3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생 수로 나누기)
		 단, 모든 평균은 소수점 첫째 자리까지 출력할 것.
		 */

		System.out.println("*** 각 학생들의 평균 점수 ***");
		int i = 0;
		double total = 0;
		for(int[] student : score) {
			int sum = 0;
			for(int stu : student) {
				sum += stu;
			}
			double avg = sum / subName.length;
			total += avg;
			System.out.printf("%s의 평균 점수는 %.1f점입니다.\n", stuName[i], avg);
			i++;
		}	
		
		System.out.println("-----------------------\n*** 각 과목의 평균 점수 ***");

		for(int j=0; j<subName.length; j++) {
			
		}

		///////////////////////////////////////////////////////////////////////////////////
		
//		선생님 답안
		
//		double totalAvg = 0.0; //학생들의 평균 점수의 총합.
//		int idx = 0; //stuName 배열에서 학생의 이름을 꺼내올 용도로 사용할 변수.
//		for(int[] stu : score) {
//			int total = 0;
//			for(int s : stu) {
//				total += s;
//			}
//			double avg = (double) total / subName.length;
//			totalAvg += avg;
//			System.out.printf("%s 평균 : %.1f점\n", stuName[idx], avg);
//			idx++;
//		}
//		
//		System.out.println("-----------------------");
//		
//		for(int i=0; i<subName.length; i++) {
//			int total = 0;
//			for(int j=0; j<stuName.length; j++) {
//				total += score[j][i];				
//			}
//			double avg = (double) total / stuName.length;
//			System.out.printf("%s 평균 : %.1f점\n", subName[i], avg);
//		}
//
//		System.out.println("-----------------------");
//		
//		double classAvg = totalAvg / stuName.length;
//		System.out.printf("우리반 평균 : %.1f점\n", classAvg);

	}
}
