package chap2.quiz01;

public class Teacher extends Person {
	
	String subject;
	
	@Override
	String info() {
		name = "김철수";
		age = 50;
		subject = "수학";
		return super.info() + ", 과목 : " + subject;
	}

}
