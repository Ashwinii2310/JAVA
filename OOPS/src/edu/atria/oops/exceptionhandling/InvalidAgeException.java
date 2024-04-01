package edu.atria.oops.exceptionhandling;
//program to demostrate custom exception


//InvalidAgeException is the child class and exception is the parent class
public class InvalidAgeException  extends Exception {
	//create a constructor
	//public InvalidAgeException() {
		//super("Invalid age");
	//}
	
	//create a parameterized constructor
   public InvalidAgeException(String message) {
	   super(message);
   }
}
