package oop.poly.player;

public class MainClass {

	public static void main(String[] args) {

		Warrior w1 = new Warrior("전사");
		Warrior w2 = new Warrior("전사짱짱맨");
		Mage m1 = new Mage("법사");
		Hunter h1 = new Hunter("냥꾼");
		

		w1.rush(h1);

		System.out.println("\n------------------------------------");

		w1.rush(m1);

		System.out.println("\n------------------------------------");

		w1.rush(w2);

		System.out.println("\n------------------------------------");

		w1.rush(w1);




	}

}
