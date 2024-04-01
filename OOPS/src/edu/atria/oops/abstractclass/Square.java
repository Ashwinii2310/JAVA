package edu.atria.oops.abstractclass;

//4.the sub class square which extends the base class shape should implement the abstract methods

public class Square extends Shape {
 //hover on square and select first option i.e add unimplemeented methods
	
	float side;
	
	// only side bcs area is inherited from base class
	public Square( float side) {
		super();// no parent fields bcs we haven't created constructors in parent class 
		this.side = side;
	}
	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return  area= side*side;
	}
	

}
