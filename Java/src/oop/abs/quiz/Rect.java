package oop.abs.quiz;

public class Rect extends Shape {	

//	int length;
//	
//	public Rect(String name, int length) {
//		super(name);
//		this.length = length;
//	}
//
//	@Override
//	public double getArea() {
//		return length*length;
//	}
	
	///////////////////////////////////////////
	
	//선생님 답안

	
	public Rect(String name, int side) {
		super(name);
		this.side = side;
	}

	@Override
	public double getArea() {
		return side*side;
	}
	
	private int side;
}
