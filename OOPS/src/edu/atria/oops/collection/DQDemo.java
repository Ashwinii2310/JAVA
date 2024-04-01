package edu.atria.oops.collection;
import java.util.Deque;
import java.util.LinkedList;

public class DQDemo {

	public static void main(String[] args) {
		Deque<Integer> que = new LinkedList<>();
		que.add(4);
		que.offer(3);// same as add
		que.add(2);
		que.offer(1);
		
		que.addFirst(100);//refer notes for other methods
		que.addLast(100);
		
		System.out.println("Queue Content is" + que);
		System.out.println("Queue Content(get First) is:"+que.getFirst());
		System.out.println("Queue Content(get last) is:"+que.getLast());

	}

}
