package chap3;

public class MainClass {

	public static void main(String[] args) {
		
		MyCart shopping = new MyCart(2100);
		
		shopping.buy(new Tv());
		shopping.buy(new Computer());
		shopping.buy(new Radio());
		
		System.out.println("---------------------------------------\n");
		
		shopping.info();

		
		

	}

}
