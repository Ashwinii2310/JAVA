package edu.atria.oops.multithreading;

public class Hii extends Thread {
	
		public void run() {
			for (int i=0;i<5;i++) 
			System.out.println("hii");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			
			}
			
		}
	}


