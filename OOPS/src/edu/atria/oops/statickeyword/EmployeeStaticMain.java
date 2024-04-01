package edu.atria.oops.statickeyword;

public class EmployeeStaticMain {

	public static void main(String[] args) {
	System.out.println(EmployeeStatic.getCompanyName());
	
	EmployeeStatic eone = new EmployeeStatic("Rahul",101);//only employee name and id is passed bcs company name is static
    System.out.println(eone);
	
    
	EmployeeStatic etwo = new EmployeeStatic("kishore",7576);
	 System.out.println(etwo);
	}
	
}
