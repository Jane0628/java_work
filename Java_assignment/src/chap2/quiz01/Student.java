package chap2.quiz01;

public class Student extends Person {
	
	String studentId;
	
	@Override
	String info() {
		name = "홍길동";
		age = 30;
		studentId = "a001";
		return super.info() + ", 학번 : " + studentId;
	}

}
