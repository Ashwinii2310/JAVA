package edu.atria.oops.multithreading;

 class Good implements Runnable {
	public void run() {
		for (int i=0;i<5;i++) 
		System.out.println("hii");
		try {
			Thread.sleep(500);
		} 
		catch (Exception e) {
		
		}
		
	}
}


class Byee implements Runnable{
	public void run() {
		for (int i=0;i<5;i++) 
		System.out.println("hii");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		
		}
	
		
	}
}

 public class Running{
	 public static void main(String[] args)
	 {
		 Good obj1= new Good();
		 Byee obj2 = new Byee();
		 Thread obj3 = new Thread(obj1);
		 obj3.start();
		 try {
			 Thread.sleep(300);
		 }
		 catch(Exception e) {
			 
		 }
		 Thread obj4 = new Thread(obj2);
		 obj4.start();
		 obj3.setPriority(Thread.NORM_PRIORITY);
		 //Syso("good");
		 System.out.println(obj3.getPriority());
	 }
 
	 }
 //Runnable is the interface used to create a thread in java
 //run is the method used
 //  "Synchronized" is used to prevent multiple threads from accessing a method simultaneously

