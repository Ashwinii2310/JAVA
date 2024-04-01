package edu.atria.oops.interfacee;

//Interface -1.inbuilt interfaces and functional interface 
//functional interface is what we create using the annotation
//that start with @...  is an annotation
//Predefined or inbuilt  functional interfaces are comparablecomparableTo() 2.Runnable - Run()  3.Callable - call()

//only one method should be there in functional interface

@FunctionalInterface
public interface Statement {
	//Statement is the interface name

	public abstract String  greet(); // only one method is created
	//public int calculate();
	
}
