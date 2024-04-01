package edu.atria.oops.secondpackage;

import edu.atria.oops.firstpackage.Base;

public class Executor extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base bOne = new Base();//base class is in first package so import the first package
		
		//System.out.println(bOne.varPrivate); //still private member  is not visible in this package
		//System.out.println(bOne.varDefault); //the default member is also not accessible in this second package
		
        // System.out.println(bOne.getvarProtected()); //by this way u can access the protected member(but not a good method or logic)
       
		//another way is by creating object
	    // protected members are accessible outside the package by extending the base class
		
        Executor ex = new Executor();
        System.out.println(ex.varProtected);
		System.out.println(ex.varPublic);    //public is accessible everywhere
	}

}
