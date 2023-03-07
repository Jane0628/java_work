package practice.coffee;

import java.util.Arrays;
import java.util.Scanner;

public class CoffeeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("감사합니다. 메가커피입니다.");
		System.out.println("주문 도와드릴까요?");
		System.out.println("(엔터를 누르면 진행됩니다.)");
		sc.nextLine();

		Menu drink = new Menu();

		int temp = (int) (Math.random()*2); 	//범위 : 0 ~ 1 / 0.0 <= x < 2.0
		int menu;

		while(true) {
			menu = (int) (Math.random()*72); 	//범위 : 0 ~ 71 / 0.0 <= x < 72.0

			drink.takeOrder(temp, menu);

			if(drink.takeOrder(temp, menu) != null) break;
		}

		System.out.println(drink.takeOrder(temp, menu) + " 주세요.\n");

		System.out.println("결제 완료되셨습니다! 잠시만 기다려주세요!");
		System.out.println("------------------------------");
		System.out.println("*** 제조 과정 ***");
		System.out.println("('끝'이라고 입력하면 입력이 종료됩니다.)");

		int num = 0;
		String[] recipe = new String[50];
		

		String string = null;
		while (true) {
			System.out.print((num+1) + ". ");
			String answer = sc.nextLine();	

			string += answer + ";";
			
			
			if(answer.equals("끝")) {
				String[] tem = new String[num];
				
				for(int i=0; i<tem.length; i++) {
					tem[i] = recipe[i];
				}
				
				recipe = tem;
				tem = null;
				
				break;
			}

			recipe[num] = answer;

			if(num == recipe.length-1) {
				
				String[] tem = new String[recipe.length+1];
				
				for(int i=0; i<recipe.length; i++) {
					tem[i] = recipe[i];
				}
				
				recipe = tem;
				tem = null;
				
			}
			
			num++;
		}

		System.out.println(Arrays.toString(recipe));

		System.out.println("------------------------------");
		System.out.println("정답\t\t답안");
		
		



	}

}
