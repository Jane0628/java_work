package basic.practice;

public class CoffeeQuiz {

	public static void main(String[] args) {


		int temp = (int) (Math.random()*2 + 1); //범위 : 1 ~ 2
		int menu = (int) (Math.random()*73 + 1); //범위 : 1 ~ 73
		
		if (temp == 1) {
			System.out.print("(hot)");
		} else {
			System.out.print("(ice)");
		}
		
		
		switch(menu) {
		
		case 1:
			System.out.print(" 아메리카노");
			break;
			
		case 2:
			System.out.print(" 꿀아메리카노");
			break;
			
		case 3:
			System.out.print(" 헤이즐넛아메리카노");
			break;
			
		case 4:
			System.out.print(" 바닐라아메리카노");
			break;
			
		case 5:
			System.out.print(" 메가리카노");
			break;
			
		case 6:
			System.out.print(" 카페라떼");
			break;
			
		case 7:
			System.out.print(" 카푸치노");
			break;
			
		case 8:
			System.out.print(" 캬라멜마끼아또");
			break;
			
		case 9:
			System.out.print(" 바닐라라떼");
			break;
			
		case 10:
			System.out.print(" 헤이즐넛라떼");
			break;
			
		case 11:
			if(temp == 1) {
				System.out.print(" 연유라떼");				
			} else {
				System.out.print(" 큐브라떼");
			}
			break;
			
		case 12:
			System.out.print(" 카페모카");
			break;
			
		case 13:
			System.out.print(" 민트카페모카");
			break;
			
		case 14:
			System.out.print(" 티라미수라떼");
			break;
			
		case 15:
			System.out.print(" 콜드브루 오리지널");
			break;
			
		case 16:
			System.out.print(" 콜드브루 라떼");
			break;
			
		case 17:
			System.out.print(" 녹차라떼");
			break;
			
		case 18:
			System.out.print(" 로얄밀크티");
			break;
			
		case 19:
			if (temp == 1) {
				System.out.print(" 핫초코");				
			} else {
				System.out.print(" 아이스초코");								
			}
			break;
			
		case 20:
			System.out.print(" 메가초코");
			break;
			
		case 21:
			System.out.print(" 민트크림초코");
			break;
			
		case 22:
			System.out.print(" 토피넛라떼");
			break;
			
		case 23:
			System.out.print(" 고구마라떼");
			break;
			
		case 24:
			System.out.print(" 곡물라떼");
			break;
			
		case 25:
			if (temp == 2) {
				System.out.print(" 딸기라떼");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 26:
			if (temp == 2) {
				System.out.print(" 오레오초코라떼");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 27:
			System.out.print(" 얼그레이");
			break;
						
		case 28:
			System.out.print(" 캐모마일");
			break;
			
		case 29:
			System.out.print(" 페퍼민트");
			break;
			
		case 30:
			System.out.print(" 녹차");
			break;
			
		case 31:
			System.out.print(" 유자차");
			break;
			
		case 32:
			System.out.print(" 레몬차");
			break;
			
		case 33:
			System.out.print(" 자몽차");
			break;
			
		case 34:
			System.out.print(" 허니자몽블랙티");
			break;
			
		case 35:
			System.out.print(" 사과유자차");
			break;
			
		case 36:
			if (temp == 2) {
				System.out.print(" 복숭아 아이스티");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 37:
			if (temp == 2) {
				System.out.print(" 체리콕");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 38:
			if (temp == 2) {
				System.out.print(" 레몬에이드");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 39:
			if (temp == 2) {
				System.out.print(" 블루레몬에이드");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 40:
			if (temp == 2) {
				System.out.print(" 자몽에이드");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 41:
			if (temp == 2) {
				System.out.print(" 청포도에이드");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 42:
			if (temp == 2) {
				System.out.print(" 메가에이드");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 43:
			if (temp == 2) {
				System.out.print(" 라임모히또");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 44:
			if (temp == 2) {
				System.out.print(" 자몽모히또");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 45:
			if (temp == 2) {
				System.out.print(" 청포도모히또");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 46:
			if (temp == 2) {
				System.out.print(" 매직에이드 (블루)");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 47:
			if (temp == 2) {
				System.out.print(" 매직에이드 (핑크)");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 48:
			if (temp == 2) {
				System.out.print(" 플레인요거트스무디");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 49:
			if (temp == 2) {
				System.out.print(" 망고요거트스무디");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 50:
			if (temp == 2) {
				System.out.print(" 딸기요거트스무디");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 51:
			if (temp == 2) {
				System.out.print(" 스트로베리치즈홀릭");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 52:
			if (temp == 2) {
				System.out.print(" 쿠키프라페");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 53:
			if (temp == 2) {
				System.out.print(" 민트프라페");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 54:
			if (temp == 2) {
				System.out.print(" 리얼초코프라페");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 55:
			if (temp == 2) {
				System.out.print(" 녹차프라페");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 56:
			if (temp == 2) {
				System.out.print(" 커피프라페");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 57:
			if (temp == 2) {
				System.out.print(" 딸기쿠키프라페");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 58:
			if (temp == 2) {
				System.out.print(" 유니콘프라페");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 59:
			if (temp == 2) {
				System.out.print(" 플레인퐁크러쉬");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 60:
			if (temp == 2) {
				System.out.print(" 바나나퐁크러쉬");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 61:
			if (temp == 2) {
				System.out.print(" 딸기퐁크러쉬");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 62:
			if (temp == 2) {
				System.out.print(" 플레인허니퐁크러쉬");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 63:
			if (temp == 2) {
				System.out.print(" 슈크림허니퐁크러쉬");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 64:
			if (temp == 2) {
				System.out.print(" 초코허니퐁크러쉬");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 65:
			if (temp == 2) {
				System.out.print(" 오곡바나나주스");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 66:
			if (temp == 2) {
				System.out.print(" 초코바나나주스");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 67:
			if (temp == 2) {
				System.out.print(" 딸기바나나주스");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 68:
			if (temp == 2) {
				System.out.print(" 딸기주스");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 69:
			if (temp == 2) {
				System.out.print(" 흑당버블라떼");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 70:
			if (temp == 2) {
				System.out.print(" 흑당버블밀크티라떼");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 71:
			if (temp == 2) {
				System.out.print(" 흑당버블그린티라떼");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		case 72:
			if (temp == 2) {
				System.out.print(" 흑당라떼");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
			
		default:
			if (temp == 2) {
				System.out.print(" 흑당밀크티라떼");				
			} else {
				menu = (int) (Math.random()*73 + 1);
			}
			break;
		}
		System.out.println(temp + menu);
		
	}

}
