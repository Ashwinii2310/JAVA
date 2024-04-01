package edu.atria.oops.firstpackage;

public class Exceutor {
	public static void main(String[]args) {
		//accessing same package class
		
		Base bOne = new Base();
		System.out.println(bOne.varDefault);
		System.out.println(bOne.varPublic);
		System.out.println(bOne.varProtected);
		/*System.out.println(bOne.varPrivate);varPrivate shows error  because private member is not accessible or visible  outside the class*/
		
		
	}

}
