package chap1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution04 {

	public static void main(String[] args) {

		//		********** 4번 **********
		//		문제:
		//			학생들 중 과제를 제출하지 않은 학생을 적발하는 문제 입니다.
		//			총 학생의 수는 10명 입니다. 각 학생들은 1번부터 10번까지 번호를 가지고 있습니다.
		//			학생들 중 2명의 학생이 과제를 제출하지 않았습니다. 그 학생이 몇 번 학생인지를 출력하면 됩니다.
		//
		//		입력: 
		//			Scanner를 활용하여 총 8개의 정수를 입력 받습니다.
		//			출석번호에 중복은 없습니다.
		//			입력되는 값을 제시합니다. 
		//			-> 3 1 4 5 7 9 6 10
		//			
		//		출력:
		//			ex) 
		//			숙제를 안 낸 학생의 번호:
		//			2
		//			8
		//			
		//			의 형태로 출력합니다. 

		Scanner sc = new Scanner(System.in);
		int[] students = new int[8];
		int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int count = 0;
		outer : while(true) {
			for(int i=0; i<students.length; i++) {
				System.out.print((i+1) + "번째 정수를 입력해주세요. (범위 : 1 ~ 10)\n> ");
				int num = sc.nextInt();

				for(int j=0; j<students.length; j++) {
					if(num == students[j]) {
						System.out.println("중복된 정수를 입력해주셨습니다.\n");
						count--;
						i--;
					}
				}

				if (num < 1 || num > 10) {
					System.out.println("유효하지 않은 정수입니다.\n");
					count--;
					i--;
				} else {
					students[i] = num;
					count++;
				}

				if(count == students.length) break outer;

			} // for end
		} // while(true) end

		int j = 0;
		while(true) {
			int i = 0;
			outer : for(i=0; i<students.length; i++) {
				for(j=0; j<number.length; j++) {
					if(students[i] == number[j]) break outer;
				}
			}
			
			for(int k=j; k<number.length-1; k++) {
				number[k] = number[k+1];
			}
			
			int[] temp = new int[number.length-1];
			
			for (int k=0; k<temp.length; k++) {
				temp[k] = number[k];
			}
			number = temp; temp = null;
//			System.out.println(Arrays.toString(number));
			
			if(number.length == 2) break;
		}
		
		System.out.println("\n숙제를 안 낸 학생의 번호\n--------------------------");
		System.out.println(number[0]);
		System.out.println(number[1]);

		sc.close();
	}

}
