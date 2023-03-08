package oop.abs.quiz;

public class Circle extends Shape {

	int radius;
	
	public Circle(String name, int r) {
		super(name);
		radius = r;
	}

	@Override
	public double getArea() {
		return radius*radius*Math.PI;
	}

}
