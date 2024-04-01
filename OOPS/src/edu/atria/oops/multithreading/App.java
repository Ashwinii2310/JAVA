package edu.atria.oops.multithreading;




public class App {
	public static void main(String[] args) {
		Hii obj = new Hii();
		Hello obj1=new Hello();
		obj.start();
		
	    try {
			Thread.sleep(100);
		}catch(Exception e) {
		
	}
	    obj1.start();
	
}
}





	

	
	
	



