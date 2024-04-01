package edu.atria.oops.abstractclass;

public class AbstractionClassMain {

	public static void main(String[] args) {
	/*Shape s= new Shape(2.0f);//cannot create an object for parent class shape which is an abstract class*/
	
	//dynamic binding  (-parent class name child class new object = new ...)
	Shape sOne = new Square(2.5f);
	sOne.calculateArea();// call the calculateArea method i.e void display method which returns the area
	sOne.display();
	
	Shape sTwo = new Rectangle(5,6.6f);
	sTwo.calculateArea();
	sTwo.display();
	}

}
