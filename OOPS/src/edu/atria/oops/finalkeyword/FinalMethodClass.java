package edu.atria.oops.finalkeyword;

//a class with a final method
public class FinalMethodClass {
        // create default constructor
	FinalMethodClass(){
		System.out.println("this is a default constructor");
		
	}
	//initialize a or else it will show error
	//final int a;
	
	final int a=50;
	
	//final method 
	final void show() {
		System.out.println("value of a:"+a);
	}
}
