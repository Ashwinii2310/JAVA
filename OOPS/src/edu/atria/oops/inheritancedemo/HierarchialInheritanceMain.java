package edu.atria.oops.inheritancedemo;

public class HierarchialInheritanceMain {

	public static void main(String[] args) {
	Mp Mpone = new Mp(576697909L,"Indian","Bangalore","7-08-2002",'F',6996,"gagan","banglore","bjp");
	System.out.println(Mpone);
	
	Student sOne=new Student(576697909L,"Indian","Bangalore","7-08-2002",'F',101,"neha","cse");
	System.out.println(sOne);
	     
// u get the same answer even if u put citizen Mpone or Citizen sOne
	}

}
