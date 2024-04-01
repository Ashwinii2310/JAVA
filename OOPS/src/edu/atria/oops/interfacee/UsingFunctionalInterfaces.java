package edu.atria.oops.interfacee;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Display{
	static void show(String s) {   // static method that accepts only string parameter
		System.out.println("*****"+s+"******");
	}
}
public class UsingFunctionalInterfaces {

	public static void main(String[] args) {
	//Consumer functional interface
		
	Consumer <String> consumer = Display::show ;
	consumer.accept("Amit");
	
	/*o/p till her is ******Amit*******
	//display::show is called method referencing            
    //display is a class and show is a method that is calling
	//consumer is a functional interface 
	//consume consumes a value by accept method(one method of functional interface)
	
	
	//Supplier FI
	Supplier<String> supplier = ()->"HELLO";
	consumer.accept(supplier.get());
	
	//Lambda func used to take value from us so that get method of supplier can return some value
	//import supplier by hovering
	//o/p is ****HELLO****
	//accept method from consumer is used to accept the parameter and  supplier will return the value using get mehtod
	// we have used a lambda function here

	//Predicate FI   true of false
	Predicate<Integer> predicate = num -> num>0;  //num is a variable ,predicate is a variable where result is stored
	System.out.println(predicate.test(24));  //test method of predicate evaluates the condition or val given 
	System.out.println(predicate.test(-20));
	
	
	//Bifunction FI
	BiFunction<Integer,Integer,Integer> maxFunction = (x,y)->x>y ? x:y ;
	System.out.println(maxFunction.apply(20, 13));
	
	// <integer,integer,integer> indicates the input 1 is integer and input 2 is integer and the output is also integer.
	// we use lambda function here and store result in maxFunction 
	// x,y type is defined therefore we directly mention ...x>y indicates if x is greater then y then(? ternary operator) print x  else(:) print y
	// we use apply method and passing val to x,y
	
	//example 2
	BiFunction <String,Integer,String> printFunction = (name,num)->name+num;
	System.out.println(printFunction.apply("Good Morning ", 1));
	
	//here one i/p is string and other is integer and o/p obtained is string*/
	}

}
