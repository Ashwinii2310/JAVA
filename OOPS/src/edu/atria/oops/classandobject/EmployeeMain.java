package edu.atria.oops.classandobject;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Employee Details..........");
        int id=sc.nextInt();          //now use scanner class methods to get the user input
        String name=sc.next();
        float salary = sc.nextFloat();
        String department=sc.next();
        
	//call default constructor by creating a new object
        Employee eOne = new Employee();
        eOne.setId(id);
        eOne.setName(name);
        eOne.setSalary(salary);
        eOne.setDepartment(department);
        System.out.println(eOne);
        
        //call parameter constructor by creating new obj eTwo  bcs eone is already allocated with memory and pass parameters
        Employee eTwo = new Employee(101,"bina",10000,"testing");
        System.out.println(eTwo);
   }
}