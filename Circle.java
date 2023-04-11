package Ojects;

public class Circle extends GeometricObject {
	private double radius;
	//constructors:
	public Circle() {
		//this will first call super(); by default
		//it's optional to write super();
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle with radius is " + radius
				+ ", " + super.toString();
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
	public double getDiameter() {
		return 2*radius;
	}
	//overriding the existing built-in equals method:
	public boolean equals(Object o) {
		if(o instanceof Circle) {
			return radius == ((Circle)o).getRadius();
		}
		return false;
	}	
}
