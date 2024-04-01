package edu.atria.oops.exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
	
		try {
			int a=5/1;
			System.out.println(a);
		  
      
			 try {
					int arr[]= {2}	;
					arr[10]=25;
				    throw new Exception();
				   }
			catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("oh--->"+e);
		}
			 
	}//u get an  arithmatic exception
		

		catch(Exception a) {
			System.out.println("Exception----->"+a);
		}
		
		
	}
}
