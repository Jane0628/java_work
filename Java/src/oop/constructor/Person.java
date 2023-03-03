package oop.constructor;

public class Person {

	String name;
	int age;
	int height;
	
	Person() {}
	
	Person(String a, int b, int c) {
		name = a;
		age = b;
		height = c;
	}
	
	void info() {
		System.out.println("----------------------");
		System.out.printf("*** '%s'님의 정보 ***\n", name);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.printf("키 : %dcm", height);		
	}
	
	
	
}
