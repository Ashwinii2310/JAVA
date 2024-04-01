package edu.atria.oops.exceptionhandling;

import java.util.Scanner;

public class AgeTestDemo {
	//INTERVIEW Q -what is the difference between throw and throws
	//throws is used in method ,throw used inside method body
	//throws used to indicate that this method might throw 
	static void validate(int age) throws InvalidAgeException {
	if(age<18) {
		throw new InvalidAgeException("Invalid age,You are not eligible to vote");
	}
	else {
		System.out.println("you are elgible to vote");
	}
	}
	
	public static void main(String[] args) {
	int age;
	Scanner sc=new Scanner(System.in);//takes  user input
	System.out.println("Enter your age");
	age = sc.nextInt();
	
	
	try {
	validate(age);//consider the user given age and validate...now goes to first line where throws exception if less that 18 or it wont
	
	}catch(InvalidAgeException i) {
		System.out.println("exception caught......."+i.getMessage());
	}


	sc.close();//close the scanner otherwise it will load your memory
	}
}                                  
