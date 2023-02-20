package basic;

import java.util.Scanner;

public class YourQuestion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How are you feeling right now? \n: ");
		String feeling = sc.nextLine();
		String happy = "I'm happy!";
		
		System.out.println("\nHmm... Ok... We'll see.....");
				
		System.out.println(feeling == happy);
		
		sc.close();
		
	}

}
