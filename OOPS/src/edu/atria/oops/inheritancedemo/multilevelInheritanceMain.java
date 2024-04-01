package edu.atria.oops.inheritancedemo;

public class multilevelInheritanceMain {

	public static void main(String[] args) {
		
		Son sone = new Son(50,"direct",5,"10-02-1996",2,2002,'M');
        System.out.println(sone);
        
        Father fone = new Father(60,"gjh",6,"2-8-1996");
        System.out.println(fone);
	}

}
