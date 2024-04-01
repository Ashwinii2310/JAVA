package edu.atria.oops.finalkeyword;

 final class FinalClass{
	 void show() {
	System.out.println("final class cannot be created ");
	 }
}
// cannot create child class from final class,example String is a final class,wrapper class is a final class, System
 //ie inheritance is not possible
 //class FinalChildClass extends FinalClass{.............}
 
public class FinalClassDemo {

	public static void main(String[] args) {
		//create the object for final class
		FinalClass f1= new FinalClass();// call show() method using object reference
		f1.show();
		

	}

}
