package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {
		
		// 48 ~ 150 사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		// (48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복하면 되겠죠?)

		int n = 48;
		
		while(n <= 150) {
			if (n%8 == 0) {
				System.out.print(n + " ");
			}
			n++;
		}
		
		System.out.println();
		
//		1 ~ 100까지의 정수 중 4의 배수이면서 8의 배수는 아닌 수를 가로로 출력해 보세요.
		
		int i = 1;
		
		while(i <= 100) {
			if (i%4 == 0 && i%8 != 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println("\n예제 풀이");
		
//		1 ~ 30,000까지의 정수 중 258의 배수의 개수를 출력.
		
		int t = 1;
		int count = 0;
		
		while(t <= 30000) {
			if (t%258 == 0) {
				count++;
			}
			t++;
		}
		System.out.println(count);
		
		
//		1000의 약수의 개수를 구하세요.
//		1부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요.
//		그랬을 때 나누어 떨어지는 애가 약수입니다.
		
		int divisor = 1;
		int count1 = 0;
		
		while(divisor <= 1000) {
			if (1000%divisor == 0) {
				count1++;
			}
			divisor++;
		}
		System.out.println(count1);
		
	}

}