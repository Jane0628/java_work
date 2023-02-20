package basic;

import java.util.Scanner;

public class YourQuestion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("지금 기분이 어때요? \n: ");
		String feeling = sc.nextLine();
		String happy = "행복해요.";
		
		System.out.println("\n진짜인지 확인해보도록 하겠습니다.");
		System.out.println(feeling == happy);
		
		sc.close();
		
	}

}
