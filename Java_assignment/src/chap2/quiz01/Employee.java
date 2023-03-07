package chap2.quiz01;

public class Employee extends Person {

	String departments;
	
	@Override
	String info() {
		name = "박영희";
		age = 25;
		departments = "영업부";
		return super.info() + ", 부서 : " + departments;
	}
	
}
