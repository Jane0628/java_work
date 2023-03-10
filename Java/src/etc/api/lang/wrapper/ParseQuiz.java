package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String id;
		char c;
		
		while(true) {
			
			System.out.println("주민등록번호를 입력해주세요.");
			System.out.print("> ");
			id = sc.next();
			
			if(id.charAt(6) != '-') {
				System.out.println("하이픈을 포함하여 입력해주세요.");
				continue;
			}
			
			c = id.charAt(7);
			if(c != '1' || c != '2' || c != '3' || c != '4') {
				System.out.println("뒷자리 첫 번째 숫자는 [1, 2, 3, 4] 중 하나여야 합니다.");
				continue;
			}
			
			if(id.length() != 14) {
				System.out.println("잘못 입력되었습니다. 정확히 입력해주세요.");
				continue;
			}
			break;			
		}
		
		
		
		int a = Integer.parseInt(id.substring(0,7));
		
		if(a == 1 || a == 2) {
			
		}
		
		
		
	}

}
