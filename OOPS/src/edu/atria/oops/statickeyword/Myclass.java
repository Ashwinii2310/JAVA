package edu.atria.oops.statickeyword;

public class Myclass {
	private int section;//non static or instance variable
	private static int srNo;//static or class variable
	
	//static block- using  static keyword ,the variable u want to make static can be passed
	static {
		System.out.println("............within static block............");
		srNo=1000;
	}
   //create a default constructor
	Myclass(){
		System.out.println("within default constructor");
		srNo++;
	}
	@Override
	public String toString() {
		return "Myclass [section=" + section + ", srNo="+srNo+"]";
	}
	//create a method and make this static method using static keyword
     static void display() {
		/*System.out.println(section) cannot access non static member (section) in a static method*/
    	 System.out.println(srNo);
	 }
}
