package basic.method;

import java.util.Arrays;

public class MethodQuiz02 {

	static String[] foods = {"떡볶이", "치킨", "파스타"};
	
	//배열의 맨 마지막 위치에 데이터를 추가하는 함수
	//기존 배열보다 크기가 하나 큰 배열 선언해서 값 고대로 내리기
	//매개값으로 온 값을 마지막에 채우기.
	static void push(String newFood) {
		String[] a = new String[foods.length+1];
		
		int i;
		for(i=0; i<foods.length; i++) {
			a[i] = foods[i];
		}
		
		if (i == foods.length) {
			a[i] = newFood;
		}
		
		foods = a;
		a = null;
		
	}
	
	//배열 내부 데이터 단순 출력 함수
	static void printFood() {
		System.out.println(Arrays.toString(foods));
	}
	
	//배열 내의 특정 음식의 위치를 찾아주는 함수
	//반복문 이용해서 돌리면 됩니다.
	static int indexOf(String targetName) {
		int a = 0;
		boolean flag = false;
		for(int i=0; i<foods.length; i++) {
			if(targetName.equals(foods[i])) {
				flag = true;
				a = i;
			}
		}
		
		if(!flag) a = -1;
		
		return a;
	}
	
	//특정 음식의 배열 포함 여부 (참/거짓)
	//indexOf의 리턴값으로 판단하여 리턴.
	static boolean include(String targetName) {
		
		if (indexOf(targetName) == -1) {
			System.out.printf("'%s'은(는) 리스트에 존재하지 않는 음식입니다.\n", targetName);
			return false;
		} else {
			System.out.printf("'%s'은(는) 리스트에 등록되어있는 음식입니다.\n", targetName);
			return true;
		}
		
		//////////////////////////////////////////////
//		선생님 답안
		
//		return indexOf(targetName) != -1;
		
		
	}
	
	//특정 음식 제거 함수
	//앞에서 진행한 배열의 삭제 로직.
	static void remove(String targetName) {
		
		if (indexOf(targetName) == -1) {
			System.out.printf("'%s'은(는) 존재하지 않는 음식명입니다.\n", targetName);
			return;
		}
		
		for(int i=indexOf(targetName); i<foods.length-1; i++) {
			foods[i] = foods[i+1];
		}
		
		String[] temp = new String[foods.length-1];
		
		for (int i=0; i<temp.length; i++) {
			temp[i] = foods[i];
		}
		
		foods = temp; temp = null;
		
		System.out.printf("'%s'가 성공적으로 제거되었습니다.\n", targetName);
		
	}
	
	//특정 음식 수정 메서드
	static void modify(int targetIdx, String newFood) {
		
		foods[targetIdx] = newFood;
		System.out.printf("%d번째 음식이 '%s'(으)로 성공적으로 수정되었습니다.", targetIdx+1, newFood);
	}
	
	
	public static void main(String[] args) {
		
		printFood();
		push("라면");
		push("김치찌개");
		printFood();
		
		System.out.println();
		
		//파스타의 인덱스를 알아내세요.
		System.out.println("파스타의 인덱스는 '" + indexOf("파스타") + "'번입니다.");
		
		//김치찌개의 인덱스를 알아내세요.
		System.out.println("김치찌개의 인덱스는 '" + indexOf("김치찌개") + "'번입니다.");
		
		//짜장면의 인덱스를 알아내세요. -> -1을 리턴하시면 됩니다.
		System.out.println("짜장면의 인덱스는 '" + indexOf("짜장면") + "'번입니다.");
		
		System.out.println();
		
		remove("김치찌개");
		remove("망고"); //존재하지 않는 음식명입니다 출력.
		printFood();
		
		System.out.println();
		
		//라면의 존재 여부
		include("라면");
		//양념치킨의 존재 여부
		include("양념치킨");
		
		
		System.out.println();
		
		//2번 인덱스 데이터를 닭갈비로 수정.
		modify(2, "닭갈비");
		System.out.println();
		printFood();
		
		
	}

}
