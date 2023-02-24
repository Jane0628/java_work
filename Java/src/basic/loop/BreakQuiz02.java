package basic.loop;

import java.util.Scanner;

public class BreakQuiz02 {

	public static void main(String[] args) {

		/*
        # UP&DOWN 게임을 제작합니다.
        1. 기준이 되는 수는 난수 범위 1~100까지로 지정해 주세요.
        2. 사용자에게 정답을 입력받아서, 기준이 되는 수보다
        작은 수를 입력하면 UP, 큰 수를 입력하면 DOWN이라고 출력해서
        정답에 근접할 수 있도록 유도해 주세요.
        3. 승리 조건 횟수는 7회로 제한하겠습니다.
        7회가 넘어가도 정답은 계속 맞출 수 있도록 작성해 주세요.
        정답을 맞췄다면, 반복문 종료와 함께 승리/패배 여부를 알려 주세요.
		 */

		//		Scanner sc = new Scanner(System.in);
		//		
		//		System.out.println("*** Up & Down 게임 ***\n# 1부터 100까지의 정수 중 어느 숫자가 선택되었을까요? 기회는 '5번' 있습니다.\n------------------------------");
		//		
		//		int num = (int) (Math.random()*100+1);
		//		
		//		System.out.println(num);
		//		int countChance = 5;
		//		int countEnd = 0;
		//
		//		while(true) {
		//			System.out.print("> ");
		//			int answer = sc.nextInt();
		//	
		//			if (answer < num) {
		//				System.out.println("Up!");
		//				countChance--;
		//				countEnd++;
		//			} else if (answer > num) {
		//				System.out.println("Down!");
		//				countChance--;
		//				countEnd++;
		//			} else {
		//				System.out.println("정답입니다!");
		//				break;
		//			}
		//			
		//			if (countChance <= 0) {
		//				System.out.println("------------------------------\n아쉽게도 정답 기회를 모두 소진하셨습니다.");
		//				break;
		//			} else {
		//				System.out.printf("남은 정답 기회 : %d\n\n", countChance);
		//			}
		//		}
		//		
		//		System.out.printf("\n------------------------------\n%d번 만에 맞추셨습니다.", countEnd);
		//		
		//		if (countEnd > 0) {
		//			System.out.println("축하합니다, 승리하셨습니다!");
		//		} else {
		//			System.out.println("아쉽게도 패배하셨습니다.");			
		//		}

		Scanner sc = new Scanner(System.in);

		System.out.println("*** Up & Down 게임 ***\n# 1부터 100까지의 정수 중 어느 숫자가 선택되었을까요? 기회는 '7번' 있습니다.\n------------------------------");
		int secret = (int) (Math.random()*100+1);
		int count = 0;

		while(true) {
			System.out.print("> ");
			int answer = sc.nextInt();
			count++;
			
			if(answer > 100 || answer < 1) {
				System.out.println("잘못된 입력값입니다. 1부터 100까지의 정수를 다시 입력해주세요.");
				continue;
			}

			if(answer > secret) {
				System.out.println("Down!");
			} else if ( answer < secret) {
				System.out.println("Up!");				
			} else {
				System.out.println("정답입니다!");
				break;
			}

			if(count < 7) {
				System.out.println("정답 기회 " + (7-count) + "번 남음!");
			} else {
				System.out.println("정답 기회 모두 소진!");
				System.out.println("마저 정답을 맞춰주세요~");
			}

		}

		System.out.println(count + "번 만에 맞추셨네요~");
		if(count <= 7) {
			System.out.println("승리했습니다!");
		} else {
			System.out.println("패배했습니다. ㅠㅠ");
		}

	}

}
