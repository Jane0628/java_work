package oop.constructor;

public class Bread {
	
	int price;
	String name;
	String ingredient;
	
	Bread() {}
	
	Bread(String a) {
		
		if (a.equals("피자빵")) {
			name = a;
			price = 500;
			ingredient = "밀가루";
		} else {
			name = a;
			price = 1500;
			ingredient = "초콜릿";
		}
		
	}
	
	void showMenu() {
		System.out.println("-----------------");
		System.out.println("빵 이름 : " + name);
		System.out.println("빵 가격 : " + price + "원");
		System.out.println("주 재료 : " + ingredient);
	}
	
	

}
