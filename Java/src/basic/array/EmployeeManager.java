package basic.array;

import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//		사원의 정보 : 사번, 이름, 나이, 부서명
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];

		//		실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.
		int count = 0;

		while(true) {
			System.out.println("\n========== 사원 관리 프로그램 ==========");
			System.out.println("# 1. 사원 정보 신규 등록");
			System.out.println("# 2. 모든 사원 정보 보기");
			System.out.println("# 3. 사원 정보 검색");
			System.out.println("# 4. 사원 정보 수정");
			System.out.println("# 5. 사원 정보 삭제");
			System.out.println("# 6. 프로그램 종료");
			System.out.println("===================================");

			System.out.print("> ");
			int menu = sc.nextInt();

			if(menu == 1) {
				//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
				//사번은 중복되면 안됩니다.
				//(무한루프를 구현해서 사번 중복이 발생하면 다시 입력받기.)

				System.out.println("\n*** 사원 정보 신규 등록 ***");

				while (true) {
					System.out.print("사번을 입력해주세요.\n> ");
					String num = sc.next();

					boolean flag = false;
					for(int i=0; i<userNums.length; i++) {
						if(num.equals(userNums[i])) {
							System.out.println("중복되는 사번입니다.\n올바른 사번으로 다시 입력해주세요.\n");
							flag = true;
						}
					} // end for

					if(!flag) {
						userNums[count] = num;
						
						System.out.print("성함을 입력해주세요.\n> ");
						String name = sc.next();
						names[count] = name;

						System.out.print("나이를 입력해주세요.\n> ");
						int age = sc.nextInt();
						ages[count] = age;

						System.out.print("부서를 입력해주세요.\n> ");
						String part = sc.next();
						departments[count] = part;

						System.out.printf("\n%s님의 사원 등록이 완료되었습니다.\n사번 : %s\n나이 : %d\n부서 : %s\n", name, num, age, part);
						count++;
						break;
					}
				} // end while true(1)

			} else if (menu == 2) {
				//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
				//만약 사용자가 사원 등록을 한 명도 하지 않았다면
				//"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.

				System.out.println("\n*** 모든 사원 정보 보기 ***");

				if (count == 0) {
					System.out.println("등록된 사원 정보가 없습니다.");
				}

				for(int i=0; i<userNums.length; i++) {
					if (userNums[i] == null) break;
					else {
						System.out.printf("\n%d.\n사번 : %s\n이름 : %s\n나이 : %d\n부서 : %s",
								i+1, userNums[i], names[i], ages[i], departments[i]);						
					}
				}

			} else if (menu == 3) {
				//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
				//입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
				System.out.print("\n*** 사원 정보 검색 ***\n검색하고자 하는 사원의 사번을 입력해주세요.\n> ");
				String num = sc.next();

				System.out.println();

				boolean flag = false;
				for(int i=0; i<userNums.length; i++) {
					if(num.equals(userNums[i])) {
						System.out.printf("사번 : %s\n이름 : %s\n나이 : %d\n부서 : %s\n",
								userNums[i], names[i], ages[i], departments[i]);
						flag = true;
					}
				}
				if(!flag) {
					System.out.println("조회하신 사원의 정보가 없습니다.");
				}

			} else if (menu == 4) {
				//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
				//프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
				//사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
				//사번이 존재하지 않는다면 없다고 얘기해 주세요.

				System.out.print("\n*** 사원 정보 수정 ***");
				
				out : while(true) {
					System.out.print("\n어떤 정보를 수정하시겠습니까? 바꾸고자 하는 정보의 번호를 입력해주세요.\n1. 나이\n2. 부서\n3. 취소\n> ");
					int answer = sc.nextInt();
					
					System.out.println();
					
					if(answer == 1) {
						System.out.print("정보를 수정할 사원의 사번을 입력해주세요.\n> ");
						String num = sc.next();
						
						boolean flag = false;
						int i;
						for(i=0; i<userNums.length; i++) {
							if(num.equals(userNums[i])) {
								flag = true;
								System.out.printf("\n변경하고자 하는 나이를 입력해 주세요.\n기존에 입력된 나이 : %d\n> ", ages[i]);
								int age = sc.nextInt();
								ages[i] = age;
								System.out.println("\n변경이 완료되었습니다.");
								break out;
							}
						}
						if(!flag) {
							System.out.println("조회하신 사원의 정보가 없습니다.");
						}
						
					} else if (answer == 2) {
						System.out.print("정보를 수정할 사원의 사번을 입력해주세요.\n> ");
						String num = sc.next();
						
						boolean flag = false;
						int i;
						for(i=0; i<userNums.length; i++) {
							if(num.equals(userNums[i])) {
								flag = true;
								System.out.printf("\n변경하고자 하는 부서를 입력해 주세요.\n기존의 부서 : %s\n> ", departments[i]);
								String part = sc.next();
								departments[i] = part;
								System.out.println("\n변경이 완료되었습니다.");
								break out;
							}
						}
						if(!flag) {
							System.out.println("조회하신 사원의 정보가 없습니다.");
						}
						
					} else if (answer == 3) {
						System.out.println("수정을 취소합니다.");
						break out;
						
					} else {
						System.out.println("유효하지 않은 답변입니다.");
					}
					
				} // end while(true) 4

			} else if (menu == 5) {
				//해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
				//삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
				//y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
				//배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
				//앞으로 한 칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.

				System.out.println("\n*** 사원 정보 삭제 ***");

				out : while(true) {
					System.out.print("삭제하고 싶은 사원의 사번을 입력해주세요.\n> ");
					String num = sc.next();

					for (int i=0; i<userNums.length; i++) {
						if(num.equals(userNums[i])) {
							System.out.printf("\n'%s'님의 정보를 정말 삭제하시겠습니까? [Y/N]\n> ", names[i]);
						}
					}
					String answer = sc.next();							
					switch (answer) {

					case "Y": case "y":
						boolean flag = false;
						for(int i=0; i<userNums.length; i++) {
							if(num.equals(userNums[i])) {
								flag = true;
								for(int j=i; j<userNums.length-1; j++) {
									userNums[j] = userNums[j+1];
									names[j] = names[j+1];
									ages[j] = ages[j+1];
									departments[j] = departments[j+1];
								}
							}
						} 
						if (!flag) {
							System.out.println("\n유효하지 않은 사원 번호입니다.");
							break;
						}
						System.out.println("\n삭제가 완료되었습니다.");
						count--;
						break out;

					case "N": case "n":
						System.out.println("\n삭제를 취소합니다.");
						break out;

					default :
						System.out.println("\n유효하지 않은 답변입니다.");
						break;

					} //end switch(answer)
				} // end while(true) 5

			} else if (menu == 6) {
				System.out.println("\n프로그램을 종료합니다.");
				sc.close();
				break; // while true break
			} else {
				System.out.println("\n유효하지 않은 답변입니다.");
			}

		} // end while true

	} // end main
}