package basic;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {

		/*
		 사용자에게 섭씨온도를 입력받아서 화씨온도로 변환하여 출력하는 로직을 작성하세요.
		 변환공식은 직접 찾아서 적용해주세요.
		 화씨 온도는 소수점 첫째 자리까지 표현해주세요. 
		 # ㄹ 한자 7 -> (℃), ㄹ 한자 다음장 4 -> (℉)		
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("안녕하세요. 온도 변환기입니다. \n온도를 적어주시면 해당 온도를 섭씨(℃)에서 화씨(℉)로 변환해드리겠습니다.");
		System.out.print("\n오늘의 기온은 섭씨 몇 도입니까?\n: ");
		double temperature = sc.nextDouble();
		
//		double fahr = ((temperature*9/5) + 32);
				
//		System.out.print("\n오늘의 기온을 화씨로 변환한다면 ");
//		System.out.printf("%.1f", fahr);
//		System.out.print("℉입니다.");
		
		System.out.printf("\n오늘의 기온을 화씨로 변환한다면 %.1f℉입니다.", (temperature*9/5)+32);
		System.out.print("\n이용해주셔서 감사합니다. :)");
				
		sc.close();
		
	}

}
