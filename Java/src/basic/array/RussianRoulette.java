package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulette {

	public static void main(String[] args) {

		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("*** Russian Roulette ***");
		System.out.println("안녕하세요. 게임에 참가할 인원 수를 적어주세요.");

		//게임 인원 입력
		int playerCount;
		while(true) {
			System.out.println("(참여 가능 인원 : 2 ~ 4명)");
			System.out.print("> ");
			playerCount = sc.nextInt();
			sc.nextLine();

			if(playerCount < 1 || playerCount > 4) {
				System.out.printf("\n%d명은 참여할 수 없습니다.\n", playerCount);
			} else break;			
		}

		//플레이어 이름 등록하고
		//배열을 하나 생성해서 플레이어들을 배치하시면 됩니다.
		//배열의 크기는 게임 참가자의 명수와 동일합니다.		
		String[] players = new String[playerCount];

		System.out.println("\n각 플레이어의 이름을 등록해주세요.\n----------------------------");
		for(int i=0; i<players.length; i++) {
			System.out.print((i+1) + "번째 플레이어 : ");
			String name = sc.next();
			
			for(int a=0; a<players.length; a++) {
				if(name.equals(players[a])) {
					System.out.println("중복된 이름은 사용이 불가합니다.");
					i--;
				} else {
					players[i] = name;
					break;
				}
			}
//			System.out.println(Arrays.toString(players));
		}
		
		System.out.println("----------------------------");
		System.out.printf("%d명의 플레이어, %s은(는) 게임장으로 향합니다...\n", playerCount, Arrays.toString(players));
		
		//실탄 개수 입력(1미만이면 안되고, 5초과도 안됩니다.)
		int ran = (int) (Math.random()*players.length);
		System.out.printf("\n가장 먼저 온 [%s]은(는) 실탄 개수를 정할 수 있는 특별 권한을 부여받습니다.", players[ran]);
		
		int bulletNum; 
		while(true) {
			System.out.print("\n총알을 몇 개 넣으시겠습니까?\n(유효한 총알 개수 = 1 ~ 5개)\n> ");
			bulletNum = sc.nextInt();
			sc.nextLine();
			
			if(bulletNum < 1 || bulletNum > 5) {
				System.out.println("\n유효하지 않은 총알 개수입니다.");
			} else break;			
		}
		
		System.out.printf("\n%d개의 총알이 장전되었습니다.\n", bulletNum);
		System.out.println("\n본격적으로 게임을 시작합니다.");
		System.out.println("----------------------------");
		
		//실탄을 탄창에 배치합니다.
		boolean[] bulletPos = new boolean[6];
		//난수를 생성하셔서 실탄을 탄창에 배치합니다.
		//false -> true로 바꾸는 것이 실탄 장전입니다.
		//난수는 중복으로 발생할 가능성이 있기 때문에 중복 방지 로직을 세워서
		//같은 위치에 두 개의 실탄이 장전되지 않도록 해주시면 됩니다.
		int bulletCount = 0;
		while(true) {
			ran = (int) (Math.random()*6); 
			
			if(!bulletPos[ran]) {
				bulletPos[ran] = true;
				bulletCount++;
			}
			
			if (bulletCount == bulletNum) {
				break;
			}
		}

//		System.out.println("\n" + Arrays.toString(bulletPos));
		
		//실행 순서 정하기
		//난수를 이용해서 실행 순서를 정합니다.
		//시작 인덱스를 난수로 정해서 돌아가게 하셔도 되고
		//아예 배치를 섞으셔도 상관없습니다.
		int a = (int) (Math.random()*players.length);
		System.out.printf("[%s]부터 시작합니다.\n", players[a]);
		
		for(int i=0; i<bulletPos.length; i++) {
			System.out.printf("\n[%s의 턴!]\t탄창을 장전합니다.", players[a]);
			System.out.println("\n# 엔터를 누르시면 격발합니다.");
			sc.nextLine();

			if(!bulletPos[i]) {
				System.out.printf("휴... [%s]은(는) 살아남았다!", players[a]);
			} else {
				System.out.printf("빵!!!\n[%s]은(는) 사망했다..", players[a]);
		
				for(int k=a; k<players.length-1; k++) {
					players[k] = players[k+1];
				}
				
				String[] temp = new String[players.length-1];
				
				for(int k=0; k<temp.length; k++) {
					temp[k] = players[k]; 
				}
				players = temp; temp = null;
				
				a--;
				bulletNum--;
				playerCount--;
				bulletPos[i] = false;
			}
			
			if(a == players.length-1) {
				a = 0;
			} else {
				a++;
			}
			
			System.out.println("\n생존 인원 : " + Arrays.toString(players));
			
			if(bulletNum == 0) {
				System.out.println("\n총알이 다 떨어졌습니다.");
				System.out.println("----------------------------");
				System.out.println("최종 생존자 : " + Arrays.toString(players));
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				System.out.printf("남은 총알 개수는 '%d'개입니다.\n", bulletNum);
				System.out.println("----------------------------");
			}
			
			if(playerCount == 1) {
				System.out.println("----------------------------");
				System.out.println("최종 생존자 : " + Arrays.toString(players));
				System.out.println("승리하셨습니다.");
				System.out.println("게임을 종료합니다.");
				break;
			}
		} // for end
		
		

		//일부러 입력 대기를 해서 흐름을 잠시 끊어줍니다.
		//이 입력값(enter)은 받아서 활용할 것이 아니기 때문에 따로 변수를 선언하지 않습니다.


		//최후의 1인이 남을 때까지 게임을 진행해 주세요.
		//또는 총알을 다 소비할 때까지 게임을 진행해 주세요.
		//총알을 소모하면 true값을 false로 변경해 주세요.
		//사람이 한 명 아웃되면 배열의 크기를 줄여 주세요.



	}

}
