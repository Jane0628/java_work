package basic.practice;

import java.util.Scanner;

public class YourQuestion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How are you feeling right now? \n: ");
		String feeling = sc.nextLine();
		String happy = "I'm happy!";
		
		System.out.println("\nLet me check if you're lying to me.");
		
		if(feeling.equals(happy)) {
			System.out.println("Ok, you are telling me the truth. :)");
		}
		else {
			System.out.println("You don't have to lie to me. Please tell me the truth. :(");
		}
				
		sc.close();
		
	}

}
