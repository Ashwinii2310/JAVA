package edu.atria.oops.statickeyword;

public class MyclassMain {

	public static void main(String[] args) {
	Myclass obj1=new Myclass();
	System.out.println(obj1);
	
	Myclass.display();
	
	Myclass obj2 = new Myclass();
	System.out.println(obj2);
	Myclass.display();
	

	}

}
//static block is loaded first before main class in output..........always the main block of main class is executed first......


//1.in eclipse u write a code to store some data in in the database
//2.in databse the data is stored but before that the access or credentials to enter into the databse server to store data is required
//3.therferore u use static block and give or pass the credentials inside that ,so that u will enter the db server and then u can code and give the data 