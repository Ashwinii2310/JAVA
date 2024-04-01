package edu.atria.oops.polymorphism;

public class OverridingMain {

	public static void main(String[] args) {
		Rbi bankone= new Sbi();
		System.out.println(bankone.getRi());
	
		Rbi banktwo = new Icici();
		System.out.println(banktwo.getRi());
		

		Rbi bankthree = new Rbi();
		System.out.println(bankthree.getRi());

	}

}
