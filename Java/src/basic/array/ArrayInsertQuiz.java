package basic.array;

import java.util.Scanner;

public class ArrayInsertQuiz {

	public static void main(String[] args) {

		/*
        1. String 배열을 생성하세요. (foods)
        크기는 넉넉하게 50개로 지정하겠습니다.

        2. 사용자에게 음식 이름을 입력받아서 배열에
         삽입해 주세요.
         사용자가 음식 입력창에 '배불러' 라고 작성하면
         입력을 종료해 주세요.

        3. 입력이 종료되면 사용자가 입력한 음식을
        가로로 출력해 주세요. (null은 출력하지 마세요.)

		 *** 추가 문제 *** 
         - 입력을 받았는데 이미 배열에 존재하는 음식이라면
         '이미 존재하는 음식입니다.' 를 출력하고
         다시 새로운 음식을 입력받을 수 있도록 코드를 제어해 보세요.
		 */

		//		Scanner sc = new Scanner(System.in);
		//		String[] foods = new String[50];
		//
		//		System.out.println("먹고 싶은 음식을 입력해주세요.\n중간에 '배불러'라고 입력하신다면 중간에 종료할 수 있습니다.\n---------------------------");
		//
		//		outer : for(int a=0; a<=50; a++) {
		//			System.out.print("> ");
		//			String food = sc.nextLine();
		//
		//			if(food.equals("배불러")) {
		//				break;
		//			}
		//
		//			for(int b=0; b<foods.length; b++) {
		//				if (food.equals(foods[b])) {
		//					System.out.println("이미 존재하는 음식입니다.");
		//					i--;
		//					continue outer;
		//				} else if (b == foods.length-1) {
		//					foods[a] = food;					
		//				}
		//			}
		//		}
		//
		//		System.out.println("---------------------------");
		//		System.out.print("내가 먹고 싶은 음식들 : ");
		//
		//		for(String n : foods) {
		//			if (n == null) break;
		//			System.out.print(n + " ");
		//		}
		//
		//		sc.close();

		///////////////////////////////////////////////////////////

		Scanner sc = new Scanner(System.in);
		String[] foods = new String[50];

		System.out.println("먹고 싶은 음식을 입력해주세요.");
		System.out.println("'배불러'라고 입력하신다면 종료할 수 있습니다.");
		System.out.println("--------------------------------------");

		for(int i=0; i<foods.length; i++) {
			System.out.print("> ");
			String name = sc.nextLine();

			if(name.equals("배불러")) {
				System.out.println("입력을 종료합니다.");
				break;
			}

			for(int dup=0; dup<foods.length; dup++) {
				if (name.equals(foods[dup])) {
					System.out.println("이미 입력하신 음식입니다.");
					i--;
					break;
				} else if (dup == foods.length-1){
					foods[i] = name;		
				}
			}
		}

		System.out.println("--------------------------------------");
		System.out.print("내가 먹고 싶은 음식들 : ");

		for(String a : foods) {
			if(a == null) break;
			System.out.print(a + " ");
		}
		sc.close();

	}
}