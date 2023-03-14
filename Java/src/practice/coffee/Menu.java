package practice.coffee;

public class Menu {

	String takeOrder(int temp, int menu) {

		switch(menu) {

		case 0:
			if(temp == 0) return "(hot) 아메리카노";
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
		return null;
	}


	String[] recipe(int temp, int menu) {

		switch(menu) {

		case 0:
			if(temp == 0) { // (hot) 아메리카노
				String[] a = {"추출", "온수 투입", "샷 투입"};
				return a;
			} else { // (ice) 아메리카노
				String[] a = {"추출", "얼음 투입", "정수 투입", "샷 투입"};
				return a;
			}

		case 1:
			if(temp == 0) { // (hot) 꿀아메리카노
				String[] a = {"꿀(샷잔 1/4선)", "추출", "온수 투입", "샷 섞은 후 투입"};
				return a;
			} else { // (ice) 꿀아메리카노
				String[] a = {"꿀(샷잔 1/4선)", "추출", "얼음 투입", "정수 투입", "샷 섞은 후 투입"};
				return a;
			}

		case 2: case 3:
			if(temp == 0) { // (hot) 시럽 + 아메리카노
				String[] a = {"시럽(3p)", "추출", "온수 투입", "샷 투입"};
				return a;
			} else { // (ice) 시럽 + 아메리카노
				String[] a = {"시럽(4p)", "추출", "얼음 투입", "정수 투입", "샷 투입"};
				return a;
			}
			
		case 4:
			if(temp == 0) break;
			else { // (ice) 메가리카노
				String[] a = {"추출", "얼음 투입", "정수 투입", "샷 투입"};
				return a;
			}

		case 5:
			if(temp == 0) { // (hot) 카페라떼
				String[] a = {"스팀 우유", "추출", "샷 투입", "스팀 우유 투입"};
				return a;
			} else { // (ice) 카페라떼
				String[] a = {"추출", "얼음 투입", "우유 투입", "샷 투입"};
				return a;
			}

		case 6:
			if(temp == 0) { // (hot) 카푸치노
				String[] a = {"스팀 우유", "추출", "샷 투입", "스팀 우유 투입", "(선택) 시나몬 파우더"};
				return a;
			} else { // (ice) 카푸치노
				String[] a = {"추출", "얼음 투입", "우유 투입", "샷 투입", "우유폼", "우유폼 투입", "(선택) 시나몬 파우더"};
				return a;
			}

		case 7:
			if(temp == 0) { // (hot) 캬라멜마끼아또
				String[] a = {"스팀 우유", "시럽(3p)", "추출", "샷 투입", "스팀 우유 투입", "캬라멜 드리즐"};
				return a;
			} else { // (ice) 캬라멜마끼아또
				String[] a = {"시럽(4p)", "추출", "얼음 투입", "우유 투입", "우유폼", "샷 투입", "우유폼 투입", "캬라멜 드리즐"};
				return a;
			}

		case 8: case 9:
			if(temp == 0) { // (hot) 시럽 + 라떼
				String[] a = {"스팀 우유", "시럽(3p)", "추출", "샷 투입", "스팀 우유 투입"};
				return a;
			} else { // (ice) 시럽 + 라떼
				String[] a = {"시럽(4p)", "추출", "얼음 투입", "우유(A선) 투입", "샷 투입"};
				return a;
			}

		case 10:
			if(temp == 0) { // (hot) 연유라떼
				String[] a = {"스팀 우유", "연유(샷잔 1/4선) + 슈가 시럽(1p)", "추출", "샷 섞은 후 투입", "스팀 우유 투입"};
				return a;
			} else { // (ice) 큐브라떼
				String[] a = {"연유(샷잔 1/4선)", "추출", "얼음(컵선) 투입", "우유(A선) 투입", "샷 섞은 후 투입", "에스프레소 큐브(2개) 투입"};
				return a;
			}

		case 11:
			if(temp == 0) { // (hot) 카페모카
				String[] a = {"스팀 우유", "추출", "초코 파우더(2래들) 투입", "샷 투입 후 섞기", "스팀 우유 투입", "휘핑 크림", "초코 드리즐"};
				return a;
			} else { // (ice) 카페모카
				String[] a = {"추출", "초코 베이스(컵 밑선) 투입", "얼음(컵선) 투입", "우유(A선) 투입", "샷 투입 후 섞기", "휘핑 크림", "초코 드리즐"};
				return a;
			}

		case 12:
			if(temp == 0) { // (hot) 민트카페모카
				String[] a = {"스팀 우유", "추출", "초코 파우더(2래들) + 민트 시럽(3p) 투입", "샷 투입 후 섞기", "스팀 우유 투입", "민트 휘핑 크림", "딸기 크런치"};
				return a;
			} else { // (ice) 민트카페모카
				String[] a = {"추출", "초코 베이스(컵 밑선) + 민트 시럽(3p) 투입", "얼음(컵선) 투입", "우유(A선) 투입", "샷 투입 후 섞기", "민트 휘핑 크림", "딸기 크런치"};
				return a;
			}

		case 13:
			if(temp == 0) { // (hot) 티라미수라떼
				String[] a = {"스팀 우유", "소스(샷잔 1/4선) + 슈가 시럽(1p)", "추출", "샷 섞은 후 투입", "스팀 우유 투입", "티라미수 크림", "코코아 파우더"};
				return a;
			} else { // (ice) 티라미수라떼
				String[] a = {"소스(샷잔 1/4선) + 슈가 시럽(1p)", "추출", "얼음(컵선) 투입", "우유(B선) 투입", "샷 섞은 후 투입", "티라미수 크림", "코코아 파우더"};
				return a;
			}

		case 14:
			if(temp == 0) { // (hot) 콜드브루 오리지널
				String[] a = {"원액(100ml) 투입", "온수 투입"};
				return a;
			} else { // (ice) 콜드브루 오리지널
				String[] a = {"원액(컵 밑선) 투입", "얼음 투입", "정수 투입", "섞기"};
				return a;
			}

		case 15:
			if(temp == 0) { // (hot) 콜드브루 라떼
				String[] a = {"스팀 우유", "원액(100ml) 투입", "스팀 우유 투입"};
				return a;
			} else { // (ice) 콜드브루 라떼
				String[] a = {"원액(컵 밑선) 투입", "얼음 투입", "우유 투입", "섞기"};
				return a;
			}

		case 16:
			if(temp == 0) { // (hot) 녹차라떼
				String[] a = {"스팀 우유", "녹차 파우더(2래들) 투입", "온수(약간) 투입 후 섞기", "스팀 우유 투입", "녹차 파우더"};
				return a;
			} else { // (ice) 녹차라떼
				String[] a = {"녹차 베이스(컵 밑선) 투입", "얼음 투입", "우유 투입", "섞기"};
				return a;
			}

		case 17:
			if(temp == 0) { // (hot) 로얄밀크티
				String[] a = {"스팀 우유", "홍차 파우더(2래들) 투입", "온수(약간) 투입 후 섞기", "스팀 우유 투입"};
				return a;
			} else { // (ice) 로얄밀크티
				String[] a = {"우유(200ml) + 홍차 파우더(2래들) 믹서기 투입 후 3번", "얼음 투입", "음료 투입"};
				return a;
			}

		case 18:
			if(temp == 0) { // (hot) 핫초코
				String[] a = {"스팀 우유", "초코 파우더(4래들) 투입", "온수(약간) 투입 후 섞기", "스팀 우유 투입", "코코아 파우더"};
				return a;
			} else { // (ice) 아이스초코
				String[] a = {"초코 베이스(D선) 투입", "얼음 투입", "우유 투입", "섞기(벽 긁기)"};
				return a;
			}

		case 19:
			if(temp == 0) { // (hot) 메가초코
				String[] a = {"스팀 우유", "초코 파우더(4래들) 투입", "온수(약간) 투입 후 섞기", "스팀 우유 투입", "휘핑 크림", "초코 + 캬라멜 드리즐", "딸기 크런치"};
				return a;
			} else { // (ice) 메가초코
				String[] a = {"초코 베이스(D선) 투입", "얼음(컵선) 투입", "우유 투입", "섞기(벽 긁기)", "휘핑 크림", "초코 + 캬라멜 드리즐", "딸기 크런치"};
				return a;
			}

		case 20:
			if(temp == 0) { // (hot) 민트크림초코
				String[] a = {"스팀 우유", "초코 파우더(1.5래들) + 민트 시럽(3p) 투입", "온수(약간) 투입 후 섞기", "스팀 우유 투입", "민트 휘핑 크림", "딸기 크런치"};
				return a;
			} else { // (ice) 민트크림초코
				String[] a = {"초코 베이스(컵 밑선) + 민트 시럽(3p) 투입", "얼음(컵선) 투입", "우유 투입", "민트 휘핑 크림", "딸기 크런치"};
				return a;
			}

		case 21:
			if(temp == 0) { // (hot) 토피넛라떼
				String[] a = {"스팀 우유", "토피넛 파우더(4래들) 투입", "온수(약간) 투입 후 섞기", "스팀 우유 투입", "캬라멜 드리즐"};
				return a;
			} else { // (ice) 토피넛라떼
				String[] a = {"우유(250ml) + 토피넛 파우더(4래들) 믹서기 투입 후 3번", "얼음 투입", "스팀 우유 투입", "캬라멜 드리즐"};
				return a;
			}

		case 22:
			if(temp == 0) { // (hot) 고구마라떼
				String[] a = {"스팀 우유(80도)", "고구마 페이스트(1스쿱) + 슈가 시럽(1p) 투입", "스팀 우유(우유만) 투입", "섞기", "스팀 우유(폼) 투입", "아몬드 슬라이스"};
				return a;
			} else { // (ice) 고구마라떼
				String[] a = {"우유(200ml) + 고구마 페이스트(1스쿱) + 슈가 시럽(1p) 믹서기 투입 후 3번", "얼음 투입", "음료 투입"};
				return a;
			}

		case 23:
			if(temp == 0) { // (hot) 곡물라떼
				String[] a = {"스팀 우유", "오곡 파우더(4래들) + 슈가 시럽(1p) 투입", "스팀 우유(우유만) 투입", "스팀 우유(폼) 투입", "아몬드 슬라이스"};
				return a;
			} else { // (ice) 곡물라떼
				String[] a = {"우유(250ml) + 오곡 파우더(4래들) + 슈가 시럽(1p) 믹서기 투입 후 3번", "얼음 투입", "음료 투입"};
				return a;
			}

		case 24:
			if(temp == 0) break;
			else { // (ice) 딸기라떼
				String[] a = {"가당 딸기(200ml) + 슈가 시럽(3p) 투입", "얼음 투입", "우유 투입"};
				return a;
			}

		case 25:
			if(temp == 0) break;
			else { // (ice) 오레오초코라떼
				String[] a = {"우유(200ml) + 초코 베이스(50ml) + 오레오(3개) 믹서기 투입 후 5초간 3번", "얼음 투입", "음료 흔들어서 투입", "휘핑 크림", "오레오(1개)", "쿠키 분태"};
				return a;
			}

		case 26: case 27: case 28: case 29:
			if(temp == 0) { // (hot) 티
				String[] a = {"티백(1개)", "온수 투입"};
				return a;
			} else { // (ice) 티
				String[] a = {"티백(2개) 온수(150ml)에 3분간 우리기", "얼음(반컵) 투입", "우린 물 투입", "얼음 투입", "정수 투입", "티백 투입", "민트 잎"};
				return a;
			}

		case 30:
			if(temp == 0) { // (hot) 유자차
				String[] a = {"유자청(5래들) 투입", "온수 투입", "섞기"};
				return a;
			} else { // (ice) 유자차
				String[] a = {"유자청(6래들) 투입", "온수(약간) 투입", "섞기", "얼음 투입", "정수 투입", ""};
				return a;
			}

		case 31:
			if(temp == 0) { // (hot) 레몬차
				String[] a = {"레몬청(5래들) 투입", "온수 투입", "섞기", "레몬 슬라이스(1개)"};
				return a;
			} else { // (ice) 레몬차
				String[] a = {"레몬청(5래들) 투입", "온수 투입", "섞기"};
				return a;
			}

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
