package edu.atria.oops.polymorphism;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		System.out.println(MethodOverloading.add(2, 3));
		System.out.println(MethodOverloading.add(5.3f, 3.3f));
		System.out.println(MethodOverloading.add(2, 5.4f));
		System.out.println(MethodOverloading.add(7.8f, 3));
		System.out.println(MethodOverloading.add("2"," 10"));
		
//System.out.println("addition of 2 integer or float or string:" + MethodOverloading.add(2, 3));
// for example if u pass 3 nos or give float value 4.5f or a double 4.5 in place of int  -u will get error	that is the compile time error	
	}

}
