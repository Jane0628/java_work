package chap5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FoodManager {

	public static void main(String[] args) {
		
		Map<String, Integer> foods = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 음식점 메뉴판 관리 프로그램 ***");
		
		outer : while(true) {
			
			System.out.println("# 1. 메뉴 등록");
			System.out.println("# 2. 메뉴 전체보기");
			System.out.println("# 3. 프로그램 종료");
			System.out.print("> ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			System.out.println("--------------------------------");
			
			if(menu == 1) {
				/*
				 - 메뉴명과 가격을 입력받아서 Map에 삽입하시면 됩니다.
				  이미 존재하는 메뉴명이 들어왔다면 '이미 존재하는 메뉴입니다.'
				  를 출력하시고 메인 메뉴로 돌아와 주세요.
				 - 메뉴 등록 완료 후 'XXX 메뉴가 등록되었습니다.' 를 출력하세요.
				 */
				System.out.println("등록하실 메뉴 정보를 입력해주세요.");
				System.out.print("- 메뉴명 : ");
				String menuName = sc.nextLine();
				System.out.print("- 가격 : ");
				int price = sc.nextInt();
				
				System.out.println();
				if(foods.get(menuName) == null) {
					foods.put(menuName, price);
					System.out.println(menuName + " 메뉴가 등록되었습니다.");
				} else {
					System.out.println("이미 존재하는 메뉴입니다.");
				}
				System.out.println("--------------------------------");					
				
			} else if(menu == 2) {
				/*
				 - 만약 메뉴가 하나도 등록되어 있지 않다면
				  '메뉴부터 먼저 등록해 주세요!' 출력 후 메인 메뉴로 이동시켜
				  주세요. 
				 
				 - Map의 모든 요소를 반복문을 이용하여 출력해 주세요.
				 ex)
				    메뉴명 : 가격
				    메뉴명 : 가격
				    메뉴명 : 가격....
				  
				  메뉴를 모두 출력 후에 선택지를 제공하세요.
				  (1. 수정 | 2. 삭제 | 3. 취소)
				  - 수정: 수정할 메뉴명을 입력받아서 가격 수정을 진행하세요.
				   없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.
				   
				  - 삭제: 삭제할 메뉴명을 입력받아서 해당 메뉴를 삭제해 주세요.
				   없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.
				   
				  - 취소: 메인 메뉴로 이동
				 */
				
				if(foods.isEmpty()) {
					System.out.println("메뉴부터 먼저 등록해 주세요!");
					continue;
				}
				
				Set<String> keys = foods.keySet();
				Iterator<String> iter = keys.iterator();
				
				System.out.println("*** 메뉴 ***");
				while(iter.hasNext()) {
					String key = iter.next();
					System.out.println(key + " : " + foods.get(key) + "원");
				}
				
				System.out.println("\n어떤 것을 진행하시겠습니까?");
				System.out.println("(1. 수정 | 2. 삭제 | 3. 취소)");
				System.out.print("> ");
				int answer = sc.nextInt();
				sc.nextLine();
				
				System.out.println("--------------------------------");
				breakSwitch : switch (answer) {
				case 1: {
					System.out.println("가격을 수정할 메뉴의 이름을 입력해주세요.");
					System.out.print("> ");
					String a = sc.nextLine();
					
					if(foods.get(a) == null) {
						System.out.println("없는 메뉴입니다.");
						break breakSwitch;
					}
					
					System.out.println("가격을 얼마로 수정하시겠습니까?");
					System.out.print("> ");
					int b = sc.nextInt();
					
					foods.put(a, b);
					System.out.println("수정이 완료되었습니다.");
					break;					
				}
				
				case 2: {
					System.out.println("삭제할 메뉴의 이름을 입력해주세요.");
					System.out.print("> ");
					String a = sc.nextLine();
					
					if(foods.get(a) == null) {
						System.out.println("없는 메뉴입니다.");
						break breakSwitch;
					}
										
					foods.remove(a);
					System.out.println("삭제가 완료되었습니다.");
					break;		
				}
				
				case 3: {
					System.out.println("진행을 취소합니다.");					
					break;	
				}
				
				default:
					System.out.println("확인되지 않는 입력값입니다.\n메인 메뉴로 이동합니다.");
				}			
				
				System.out.println("--------------------------------");					
				
			} else if(menu == 3) {
				 /*
				  - Y / N를 입력받아서 Y가 입력되면 프로그램 종료.
				   그 이외의 값은 종료 취소를 진행해 주세요.
				 */
				System.out.println("프로그램을 정말 종료하시겠습니까? [Y / N]");
				System.out.print("> ");
				String answer = sc.next();
				
				switch (answer) {
				case "Y": case "y": case "ㅛ": case "ㅇ": {
					System.out.println("\n프로그램을 종료합니다.");
					break outer;
				}
				
				case "N": case "n": case "ㅜ": case "ㄴ": {
					System.out.println("\n프로그램 종료를 취소합니다.");
					break;
				}
				default:
					System.out.println("확인할 수 없는 입력값입니다.\n프로그램 종료를 취소합니다.");
				}				
				
				System.out.println("--------------------------------");					
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
			
			
			
		}
		
		

	}

}

















