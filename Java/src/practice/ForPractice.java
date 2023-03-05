package practice;

import java.util.Scanner;

public class ForPractice {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int N = keyboard.nextInt();
//        N = 50
        keyboard.close();

        System.out.print("\nPrime numbers from 1 to " + N + ": ");
        for (int i = 2; i <= N; i++) {
//			i = 3; i <= 50; i++
            boolean isPrime = true;
//            System.out.println("The value of i is: " + i);
            for (int j = 2; j <= i / 2; j++) {
//            	j = 2; j <= 2 / 2; j++
//            	but over here since j is bigger than 1, will this mean it's false here?
//                System.out.println("The value is j is: " + j);
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}