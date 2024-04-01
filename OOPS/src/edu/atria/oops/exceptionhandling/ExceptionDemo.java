package edu.atria.oops.exceptionhandling;

public class ExceptionDemo {
	
	public void Demo() throws Exception{
	int a=5/0;
	System.out.println(a);
	
}
public void slave()
{
	try {
		Demo();
	}
	catch(Exception e)
	{
		System.out.println("exception"+e);
	}
}
public static void main(String[] args) {
	ExceptionDemo obj = new ExceptionDemo();
	obj.slave();
}
}