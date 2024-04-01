package edu.atria.oops.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		//we can use vector class by extending or list,or stack itself
        //the two operations of stack is push and pop.
		//remove method,search method
		Stack<Integer> s= new Stack<Integer>();
		System.out.println("Pushing Elements into the stack");
		
		//using stack object reference we can call push method
		s.push(95);//this becomes the first element in stack.
		s.push(94);
		s.push(93);
		s.push(92);
		s.push(91);
		s.push(90);
		s.push(0);
		
		System.out.println("stack elements are"+s);
		s.remove(1);
		System.out.println("stack elements are"+s);
		System.out.println("Removing the last element:"+s.pop());
		System.out.println("now the elements are:"+s);
		System.out.println("Search an element:"+s.search(92));// if u give element which is not there ,output is -1
		//95 is last ele,0 is first,0 is removed so when u search 92 u get the index value of 92.
		System.out.println(s.peek());//just gives the top or first element without deleting it from stack
		System.out.println("the stack elements are:"+s);
		
	}

}
