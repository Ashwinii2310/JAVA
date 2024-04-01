package edu.atria.oops.collection;

import java.util.PriorityQueue;


public class PriorityQDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> que = new PriorityQueue<>();
		
		
		que.add(4);
		que.offer(10);// same as add
		que.add(3);
		que.offer(0);
		System.out.println("Queue Content is" + que);
	

	}

}
