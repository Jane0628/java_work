package practice;

public class CoffeeQuiz {

	public static void main(String[] args) {

		// 0.0 <= x < 1.0
		// range = a ~ b
		// Math.random()*(b + 1 - a) + a

		int temp = (int) (Math.random()*2); //범위 : 0 ~ 1 / 0.0 <= x < 2.0

		if (temp == 0) {
			System.out.print("(hot)");
		} else {
			System.out.print("(ice)");
		}

		outer : while(true) {
			
			int menu = (int) (Math.random()*71); //범위 : 0 ~ 70
			
			switch(menu) {
			
			case 0:
				System.out.print(" 아메리카노");
				break outer;
				
			case 1:
				System.out.print(" 꿀아메리카노");
				break outer;
				
			case 2:
				System.out.print(" 헤이즐넛아메리카노");
				break outer;
				
			case 3:
				System.out.print(" 바닐라아메리카노");
				break outer;
				
			case 4:
				System.out.print(" 메가리카노");
				break outer;
				
			case 5:
				System.out.print(" 카페라떼");
				break outer;
				
			case 6:
				System.out.print(" 카푸치노");
				break outer;
				
			case 7:
				System.out.print(" 캬라멜마끼아또");
				break outer;
				
			case 8:
				System.out.print(" 바닐라라떼");
				break outer;
				
			case 9:
				System.out.print(" 헤이즐넛라떼");
				break outer;
				
			case 10:
				if(temp == 1) {
					System.out.print(" 연유라떼");				
					break outer;
				} else {
					System.out.print(" 큐브라떼");
					break outer;
				}
				
			case 11:
				System.out.print(" 카페모카");
				break outer;
				
			case 12:
				System.out.print(" 민트카페모카");
				break outer;
				
			case 13:
				System.out.print(" 티라미수라떼");
				break outer;
				
			case 14:
				System.out.print(" 콜드브루 오리지널");
				break outer;
				
			case 15:
				System.out.print(" 콜드브루 라떼");
				break outer;
				
			case 16:
				System.out.print(" 녹차라떼");
				break outer;
				
			case 17:
				System.out.print(" 로얄밀크티");
				break outer;
				
			case 18:
				if (temp == 1) {
					System.out.print(" 핫초코");				
					break outer;
				} else {
					System.out.print(" 아이스초코");								
					break outer;
				}
				
			case 19:
				System.out.print(" 메가초코");
				break outer;
				
			case 20:
				System.out.print(" 민트크림초코");
				break outer;
				
			case 21:
				System.out.print(" 토피넛라떼");
				break outer;
				
			case 22:
				System.out.print(" 고구마라떼");
				break outer;
				
			case 23:
				System.out.print(" 곡물라떼");
				break outer;
				
			case 24:
				if (temp == 2) {
					System.out.print(" 딸기라떼");				
					break outer;
				} else break;
				
			case 25:
				if (temp == 2) {
					System.out.print(" 오레오초코라떼");				
					break outer;
				} else break;
				
			case 26:
				System.out.print(" 얼그레이");
				break outer;
				
			case 27:
				System.out.print(" 캐모마일");
				break outer;
				
			case 28:
				System.out.print(" 페퍼민트");
				break outer;
				
			case 29:
				System.out.print(" 녹차");
				break outer;
				
			case 30:
				System.out.print(" 유자차");
				break outer;
				
			case 31:
				System.out.print(" 레몬차");
				break outer;
				
			case 32:
				System.out.print(" 자몽차");
				break outer;
				
			case 33:
				System.out.print(" 허니자몽블랙티");
				break outer;
				
			case 34:
				System.out.print(" 사과유자차");
				break outer;
				
			case 35:
				if (temp == 2) {
					System.out.print(" 복숭아 아이스티");				
					break outer;
				} else break;
				
			case 36:
				if (temp == 2) {
					System.out.print(" 체리콕");
					break outer;
				} else break;
				
			case 37:
				if (temp == 2) {
					System.out.print(" 레몬에이드");				
					break outer;
				} else break;
				
			case 38:
				if (temp == 2) {
					System.out.print(" 블루레몬에이드");				
					break outer;
				} else break;
				
			case 39:
				if (temp == 2) {
					System.out.print(" 자몽에이드");				
					break outer;
				} else break;
				
			case 40:
				if (temp == 2) {
					System.out.print(" 청포도에이드");				
					break outer;
				} else break;
				
			case 41:
				if (temp == 2) {
					System.out.print(" 메가에이드");				
					break outer;
				} else break;
				
			case 42:
				if (temp == 2) {
					System.out.print(" 라임모히또");				
					break outer;
				} else break;
				
			case 43:
				if (temp == 2) {
					System.out.print(" 자몽모히또");				
					break outer;
				} else break;
				
			case 44:
				if (temp == 2) {
					System.out.print(" 청포도모히또");				
					break outer;
				} else break;
				
			case 45:
				if (temp == 2) {
					System.out.print(" 매직에이드 (블루)");				
					break outer;
				} else break;
				
			case 46:
				if (temp == 2) {
					System.out.print(" 매직에이드 (핑크)");				
					break outer;
				} else break;
				
			case 47:
				if (temp == 2) {
					System.out.print(" 플레인요거트스무디");				
					break outer;
				} else break;
				
			case 48:
				if (temp == 2) {
					System.out.print(" 망고요거트스무디");				
					break outer;
				} else break;
				
			case 49:
				if (temp == 2) {
					System.out.print(" 딸기요거트스무디");				
					break outer;
				} else break;
				
			case 50:
				if (temp == 2) {
					System.out.print(" 스트로베리치즈홀릭");				
					break outer;
				} else break;
				
			case 51:
				if (temp == 2) {
					System.out.print(" 쿠키프라페");				
					break outer;
				} else break;
				
			case 52:
				if (temp == 2) {
					System.out.print(" 민트프라페");				
					break outer;
				} else break;
				
			case 53:
				if (temp == 2) {
					System.out.print(" 리얼초코프라페");				
					break outer;
				} else break;
				
			case 54:
				if (temp == 2) {
					System.out.print(" 녹차프라페");				
					break outer;
				} else break;
				
			case 55:
				if (temp == 2) {
					System.out.print(" 커피프라페");				
					break outer;
				} else break;
				
			case 56:
				if (temp == 2) {
					System.out.print(" 딸기쿠키프라페");				
					break outer;
				} else break;
				
			case 57:
				if (temp == 2) {
					System.out.print(" 유니콘프라페");				
					break outer;
				} else break;
				
			case 58:
				if (temp == 2) {
					System.out.print(" 플레인퐁크러쉬");				
					break outer;
				} else break;
				
			case 59:
				if (temp == 2) {
					System.out.print(" 바나나퐁크러쉬");				
					break outer;
				} else break;
				
			case 60:
				if (temp == 2) {
					System.out.print(" 딸기퐁크러쉬");				
					break outer;
				} else break;
				
			case 61:
				if (temp == 2) {
					System.out.print(" 플레인허니퐁크러쉬");				
					break outer;
				} else break;
				
			case 62:
				if (temp == 2) {
					System.out.print(" 슈크림허니퐁크러쉬");				
					break outer;
				} else break;
				
			case 63:
				if (temp == 2) {
					System.out.print(" 초코허니퐁크러쉬");				
					break outer;
				} else break;
				
			case 64:
				if (temp == 2) {
					System.out.print(" 딸기바나나주스");				
					break outer;
				} else break;
				
			case 65:
				if (temp == 2) {
					System.out.print(" 딸기주스");				
					break outer;
				} else break;
				
			case 66:
				if (temp == 2) {
					System.out.print(" 흑당버블라떼");				
					break outer;
				} else break;
				
			case 67:
				if (temp == 2) {
					System.out.print(" 흑당버블밀크티라떼");				
					break outer;
				} else break;
				
			case 68:
				if (temp == 2) {
					System.out.print(" 흑당버블그린티라떼");				
					break outer;
				} else break;
				
			case 69:
				if (temp == 2) {
					System.out.print(" 흑당라떼");				
					break outer;
				} else break;
				
			default:
				if (temp == 2) {
					System.out.print(" 흑당밀크티라떼");				
					break outer;
				} else break;
			}
			
		}

	}

}
