package edu.atria.oops.abstractclass;

public class Rectangle extends Shape {
	
	float length,breadth;
	
	
	

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public float calculateArea() {
	
		return area= length*breadth;
	}
	

}
