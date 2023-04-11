package Ojects;

public class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		super(); //not necessary to write. we implemented super class explicitly
		this.side1 = 1.0;
		this.side2 = 2.0;
		this.side3 = 3.0;
	}
	
	public Triangle(double side1, double side2, double side3) {
		super(); //not necessary to write. we implemented super class explicitly
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		double s = ((side1 + side2 + side3))/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public String toString() {
		return "Side1: " + side1 + "\nSide2: " + side2 + "\nSide3: " + side3 + "\n" + super.toString();
	}
}
