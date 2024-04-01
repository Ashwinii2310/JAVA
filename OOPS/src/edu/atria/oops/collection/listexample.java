package edu.atria.oops.collection;

import java.util.List;
import java.util.ArrayList;

public class listexample {

	public static void main(String[] args) {
		//List is the interface and list is the reference name
		//Can't instantiate the list--so create a class
		//List list= new List();
		
		
		//this is call type safety ,where u restrict the list during compile time i.e list<String> accepts only the String elements in the list
		//<>u can give any parameter i.e any primitive datatype
		
		List list = new ArrayList(); // get error if u don't import
        list.add(0,1);   //0 is the index  value and 1 is the value of that position
        list.add(1,"Avyaan");
        list.add(2,'M');
        list.add(3,98.9f);
        list.add(4,698686980);//dynamically growing
        list.add(5,"tenth");
        
        System.out.println(list);
          System.out.println("element in first index is:" + list.get(1));
         // System.out.println("element in Seventh index is:" + list.get(7)); will get an exception as index 7 out of bounds for length 6
	
       System.out.println( list.contains('A'));//check for letter A
       System.out.println(list.size());
       list.add(6,"Rahul");//duplicate can be created only diffrentiation is index value
       System.out.println(list);
       list.add(7,null);
       System.out.println(list);
       
       //to clear all the elements in the list
       list.clear();
       System.out.println(list);
	
	
	}
	
	//Arraylist is an implementable class of List

}
