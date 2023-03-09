package oop.inter.bad;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("진행하실 번호를 입력하세요.");
		System.out.println("------------------------");
		System.out.println("1. 가입\n2. 로그인\n3. 수정\n4. 삭제");
		System.out.println("------------------------");
		System.out.print("> ");
		int menu = sc.nextInt();
		System.out.println("------------------------");
		
		if (menu == 1) {
			Join j = new Join();
			j.join();
		} else if (menu == 2) {
			Login log = new Login();
			log.login();
		} else if (menu == 3) {
			Update update = new Update();
			update.update();
		} else if (menu == 4) {
			Delete del = new Delete();
			del.delete();
		}		
		
		sc.close();
		

	}

}
