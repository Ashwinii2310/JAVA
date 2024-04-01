//Queue first in first out
//queue can be implemented in any of the four classes ,linked list,AbstractQueue list,priorityQueue,array dequeue
//refer notes

package edu.atria.oops.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	
	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();//since we cannot create obj for interface we use class ,here linkedlist
		
		que.add(4);
		que.offer(3);// same as add
		que.add(2);
		que.offer(1);
		//que.clear(); gives exception as nosuchelementexception 
		System.out.println("Queue Content is" + que);
		System.out.println("Queue content (using Remove)is :"+que.remove());//remove ,takes off the head(front) of the queue.
		System.out.println("Queue updated content is:"+que);
		System.out.println("Queue content using Peek is:"+ que.peek());//just gives the value of queue head and returns it.
		que.clear();//clears the queue
		
		System.out.println("Queue content(using Poll) is:"+que.poll());//removes the value and returns it 
		System.out.println("Queue updated content is:"+que);
		
	}
	

}
