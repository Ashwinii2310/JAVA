package edu.atria.oops.finalkeyword;

public class FinalVariable {
	
	//final int x; // final instance variable should be initialized
	final int x=40;
	
	//Declare a static blank final variable
	// although a static var u are given it as final so u have to initialize it or else error
	
	final static int y=20;
	
	//instance method creation 
	/*void change() {
		x=30;// final variable's value cannot be reassigned
		y=200;// final variable's cannot be reassigned/
	}*/
	
	
    @Override
    public String toString() {
    	return "FinalVariable [x="+x+",y="+y+"]";
    	
    }
    
    //Declare a static block to initialize the final and final static variable
    static {
    	//y=25; even inside the static block u cannot reassign -once initialized cannot be reassigned 
    //	x=100;//  even inside the static block u cannot reassign -once initialized cannot be reassigned 
    	System.out.println("value of y:"+y);
    	
    }
}
