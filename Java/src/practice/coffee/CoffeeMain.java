package practice.coffee;

import java.util.Scanner;

public class CoffeeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("감사합니다. 메가커피입니다.");
		System.out.println("주문 도와드릴까요?");
		sc.nextLine();
		
		
		
		
		Menu drink = new Menu();
		System.out.println(drink.menu() + " 주세요.\n");
		
		System.out.println("결제 완료되셨습니다! 잠시만 기다려주세요!");
		
		System.out.println();
	}

}
