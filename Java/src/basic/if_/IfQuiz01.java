package basic.if_;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {

		/*
		 키와 나이를 입력받아서 사용자가 놀이기구에 탑승할 수 있는지의 여부를 판단하시면 됩니다.
		 키 140cm 이상, 나이가 8세 이상인 사용자만 탑승이 가능하다고 가정하고, 판단할 수 있는 로직을 작성해 보세요.
		 하나의 조건이라도 만족하지 못한다면 탑승이 불가능합니다.
		 
		 놀이기구 탑승 여부와 관계없이 "오늘 하루 즐거운 시간 되세요!"를 출력하세요.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("안녕하세요. 신비한 꿈의 나라, 에버월드입니다.\n현재 방문객이 많은 관계로 고객님의 시간 손실을 막기 위해 사전에 탑승 가능 여부를 확인해드리고 있습니다.");
		
		System.out.print("\n고객님의 키를 입력해주세요.\n: ");
		double height = sc.nextDouble();
		
		System.out.print("\n고객님의 나이를 입력해주세요.\n: ");
		int age = sc.nextInt();
		
		System.out.println("\n------------------------------------------\n");
		
		if (height >= 140 && age >= 8) {
			System.out.println("탑승이 가능하십니다. :)");
		}
		else {
			System.out.println("아쉽게도 탑승이 불가하시지만, 저희 에버랜드에는 다른 재밌는 놀이기구도 많으니 많은 이용 부탁드립니다. :)");
		}
		System.out.println("오늘 하루 즐거운 시간 되세요!");
		
		sc.close();
		
	}

}
