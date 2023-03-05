package practice;

import java.util.Scanner;

public class NineNineDan {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println(++a); // 11
		
		System.out.println(++a + b++); // 12 + 20 = 32
		
		System.out.println((++a%3) + (a*++b)); // 13%3 + 13*22 = 1 + 286 = 287

		System.out.println("----------------------------------------");
		
		int x,y;
		x = y = 10;
		
		System.out.println(x);
		System.out.println(y);
		
		boolean z = ++x > y++ || x++ >= ++y; // 11 > 10 || 10 >= 11 -> true
				
		System.out.println(x+","+y); // 11,11
		System.out.println("변수 z의 값 :"+z); // 변수 z의 값 :true 
		
		System.out.println("----------------------------------------");
		
//		1000 아래의 3과 5의 배수의 합을 구하시오.
		
		int sum = 0;
		for (int i = 1; i < 1000; i++) {
			if (i%3 == 0 || i%5 == 0) {
				sum += i;
			}
		}
		
		System.out.println("3과 5의 배수 합 : " + sum);
		
		System.out.println("----------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오.\n: ");
		String name = sc.next();
		
		System.out.print("나이를 입력하시오.\n: ");
		int age = sc.nextInt();
		
		System.out.print("키를 기입하세요.\n: ");
		double height = sc.nextDouble();
		
		System.out.print("입문자입니까?");
		
		
	}

}
