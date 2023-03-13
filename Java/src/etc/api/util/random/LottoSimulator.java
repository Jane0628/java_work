package etc.api.util.random;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {

	static Random r = new Random();

	static int prize1 = 0; //1등 당첨 횟수를 세 줄 변수
	static int prize2 = 0; //2등 당첨 횟수를 세 줄 변수
	static int prize3 = 0; //3등 당첨 횟수를 세 줄 변수
	static int prize4 = 0; //4등 당첨 횟수를 세 줄 변수
	static int prize5 = 0; //5등 당첨 횟수를 세 줄 변수
	static int failCnt = 0; //꽝 당첨 횟수를 세 줄 변수

	public static Set<Integer> createLotto() {

		/*
		 - 1 ~ 45 범위의 난수 6개를 생성하셔서 컬렉션 자료형에 모아서 리턴해주세요.
		   무엇을 쓰든 상관 없으며, 중복이 발생하면 안됩니다.
		 */

		Set<Integer> lotto = new HashSet<>();
		while(lotto.size() < 6) {
			lotto.add(r.nextInt(45) + 1);
		}

		return lotto;

	}

	//보너스 번호를 생성하는 메서드
	public static int createBonusNum(Set<Integer> firstPlace) {

		/*
		 - 매개값으로 전달되는 당첨 번호 집합을 전달받으신 후에 당첨 번호들을 피해서 보너스 번호 하나만 뽑아주세요.
		   범위는 마찬가지로 1 ~ 45 사이의 난수입니다.
		 */		
		
		int bonusNum;
		
		while(true) {
			
			bonusNum = r.nextInt(45) + 1;
			
			for(int a : firstPlace) {
				if(a == bonusNum) {
					continue;
				}
			}
			
			break;	
		}
		
		return bonusNum;
	}

	//당첨 등수를 알려주는 메서드
	public static void checkLottoNumber(???, ???, ???) {

		/*
		 매개값으로 당첨 번호 집합, 구매한 로또 번호 집합, 보너스 번호를 받습니다.
		 내 로또 번호와 당첨 번호를 비교하여 일치하는 횟수를 세주신 후 등수를 판단하세요.
		 판단된 등수에 해당하는 static 변수의 값을 올려주시면 됩니다.
		 6개 일치 -> 1등
		 5개 일치 + 보너스 번호 일치 -> 2등
		 5개 일치 -> 3등
		 4개 일치 -> 4등
		 3개 일치 -> 5등
		 나머지 -> 꽝
		 */

	}

	public static void main(String[] args) {

		//로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정시키세요.
		Set<Integer> firstPlace = createLotto();
		

		//보너스 번호도 하나 고정시키세요.
		int bonusNum = createBonusNum(firstPlace);

		long money = 0L;
		while(true) {

			/*
			 - 1등이 당첨될 때까지 반복문을 돌립니다.
			 - 1등이 당첨된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고 반복문을 종료합니다.
			 - 로또를 구매하기 위한 금액도 출력하세요. (long)
			 */

			Set<Integer> myLotto = createLotto();
			money += 1000;
			
			
			
			
		}


	}
}
