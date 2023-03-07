package practice.coffee;

public class Menu {
	
	String order;

	String menu() {
		
		int temp = (int) (Math.random()*2); 	//범위 : 0 ~ 1 / 0.0 <= x < 2.0
		
		while(true) {		
			
			int menu = (int) (Math.random()*72); 	//범위 : 0 ~ 71 / 0.0 <= x < 72.0

			switch(menu) {

			case 0:
				if(temp == 0) {
					order = "(hot) 아메리카노";
					return "(hot) 아메리카노";
				}
				else return "(ice) 아메리카노";

			case 1:
				if(temp == 0) return "(hot) 꿀아메리카노";
				else return "(ice) 꿀아메리카노";
				
			case 2:
				if(temp == 0) return "(hot) 헤이즐넛아메리카노";
				else return "(ice) 헤이즐넛아메리카노";

			case 3:
				if(temp == 0) return "(hot) 바닐라아메리카노";
				else return "(ice) 바닐라아메리카노";

			case 4:
				if(temp == 0) break;
				else return "(ice) 메가리카노";

			case 5:
				if(temp == 0) return "(hot) 카페라떼";
				else return "(ice) 카페라떼";

			case 6:
				if(temp == 0) return "(hot) 카푸치노";
				else return "(ice) 카푸치노";

			case 7:
				if(temp == 0) return "(hot) 캬라멜마끼아또";
				else return "(ice) 캬라멜마끼아또";

			case 8:
				if(temp == 0) return "(hot) 바닐라라떼";
				else return "(ice) 바닐라라떼";

			case 9:
				if(temp == 0) return "(hot) 헤이즐넛라떼";
				else return "(ice) 헤이즐넛라떼";

			case 10:
				if(temp == 0) return "(hot) 연유라떼";
				else return "(ice) 큐브라떼";

			case 11:
				if(temp == 0) return "(hot) 카페모카";
				else return "(ice) 카페모카";

			case 12:
				if(temp == 0) return "(hot) 민트카페모카";
				else return "(ice) 민트카페모카";

			case 13:
				if(temp == 0) return "(hot) 티라미수라떼";
				else return "(ice) 티라미수라떼";

			case 14:
				if(temp == 0) return "(hot) 콜드브루 오리지널";
				else return "(ice) 콜드브루 오리지널";

			case 15:
				if(temp == 0) return "(hot) 콜드브루 라떼";
				else return "(ice) 콜드브루 라떼";

			case 16:
				if(temp == 0) return "(hot) 녹차라떼";
				else return "(ice) 녹차라떼";

			case 17:
				if(temp == 0) return "(hot) 로얄밀크티";
				else return "(ice) 로얄밀크티";

			case 18:
				if(temp == 0) return "(hot) 핫초코";
				else return "(ice) 아이스초코";

			case 19:
				if(temp == 0) return "(hot) 메가초코";
				else return "(ice) 메가초코";

			case 20:
				if(temp == 0) return "(hot) 민트크림초코";
				else return "(ice) 민트크림초코";

			case 21:
				if(temp == 0) return "(hot) 토피넛라떼";
				else return "(ice) 토피넛라떼";

			case 22:
				if(temp == 0) return "(hot) 고구마라떼";
				else return "(ice) 고구마라떼";

			case 23:
				if(temp == 0) return "(hot) 곡물라떼";
				else return "(ice) 곡물라떼";

			case 24:
				if(temp == 0) break;
				else return "(ice) 딸기라떼";

			case 25:
				if(temp == 0) break;
				else return "(ice) 오레오초코라떼";

			case 26:
				if(temp == 0) return "(hot) 얼그레이";
				else return "(ice) 얼그레이";

			case 27:
				if(temp == 0) return "(hot) 캐모마일";
				else return "(ice) 캐모마일";

			case 28:
				if(temp == 0) return "(hot) 페퍼민트";
				else return "(ice) 페퍼민트";

			case 29:
				if(temp == 0) return "(hot) 녹차";
				else return "(ice) 녹차";

			case 30:
				if(temp == 0) return "(hot) 유자차";
				else return "(ice) 유자차";

			case 31:
				if(temp == 0) return "(hot) 레몬차";
				else return "(ice) 레몬차";

			case 32:
				if(temp == 0) return "(hot) 자몽차";
				else return "(ice) 자몽차";

			case 33:
				if(temp == 0) return "(hot) 허니자몽블랙티";
				else return "(ice) 허니자몽블랙티";

			case 34:
				if(temp == 0) return "(hot) 사과유자차";
				else return "(ice) 사과유자차";

			case 35:
				if(temp == 0) break;
				else return "(ice) 복숭아 아이스티";

			case 36:
				if(temp == 0) break;
				else return "(ice) 체리콕";

			case 37:
				if(temp == 0) break;
				else return "(ice) 레몬에이드";

			case 38:
				if(temp == 0) break;
				else return "(ice) 블루레몬에이드";

			case 39:
				if(temp == 0) break;
				else return "(ice) 자몽에이드";

			case 40:
				if(temp == 0) break;
				else return "(ice) 청포도에이드";

			case 41:
				if(temp == 0) break;
				else return "(ice) 메가에이드";

			case 42:
				if(temp == 0) break;
				else return "(ice) 라임모히또";

			case 43:
				if(temp == 0) break;
				else return "(ice) 자몽모히또";

			case 44:
				if(temp == 0) break;
				else return "(ice) 청포도모히또";

			case 45:
				if(temp == 0) break;
				else return "(ice) 매직에이드 (블루)";

			case 46:
				if(temp == 0) break;
				else return "(ice) 매직에이드 (핑크)";

			case 47:
				if(temp == 0) break;
				else return "(ice) 플레인요거트스무디";
				
			case 48:
				if(temp == 0) break;
				else return "(ice) 망고요거트스무디";

			case 49:
				if(temp == 0) break;
				else return "(ice) 딸기요거트스무디";

			case 50:
				if(temp == 0) break;
				else return "(ice) 스트로베리치즈홀릭";

			case 51:
				if(temp == 0) break;
				else return "(ice) 쿠키프라페";

			case 52:
				if(temp == 0) break;
				else return "(ice) 민트프라페";

			case 53:
				if(temp == 0) break;
				else return "(ice) 리얼초코프라페";

			case 54:
				if(temp == 0) break;
				else return "(ice) 스모어블랙쿠키프라페";

			case 55:
				if(temp == 0) break;
				else return "(ice) 녹차프라페";

			case 56:
				if(temp == 0) break;
				else return "(ice) 커피프라페";

			case 57:
				if(temp == 0) break;
				else return "(ice) 딸기쿠키프라페";

			case 58:
				if(temp == 0) break;
				else return "(ice) 유니콘프라페";

			case 59:
				if(temp == 0) break;
				else return "(ice) 플레인퐁크러쉬";

			case 60:
				if(temp == 0) break;
				else return "(ice) 바나나퐁크러쉬";

			case 61:
				if(temp == 0) break;
				else return "(ice) 딸기퐁크러쉬";

			case 62:
				if(temp == 0) break;
				else return "(ice) 플레인허니퐁크러쉬";

			case 63:
				if(temp == 0) break;
				else return "(ice) 슈크림허니퐁크러쉬";

			case 64:
				if(temp == 0) break;
				else return "(ice) 초코허니퐁크러쉬";

			case 65:
				if(temp == 0) break;
				else return "(ice) 딸기바나나주스";

			case 66:
				if(temp == 0) break;
				else return "(ice) 딸기주스";

			case 67:
				if(temp == 0) break;
				else return "(ice) 흑당버블라떼";

			case 68:
				if(temp == 0) break;
				else return "(ice) 흑당버블밀크티라떼";

			case 69:
				if(temp == 0) break;
				else return "(ice) 흑당버블그린티라떼";

			case 70:
				if(temp == 0) break;
				else return "(ice) 흑당라떼";

			default:
				if(temp == 0) break;
				else return "(ice) 흑당밀크티라떼";
				
			}
		}
	}


	void recipe(int order) {

	}










}
