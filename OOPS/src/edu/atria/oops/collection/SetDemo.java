package edu.atria.oops.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//In set Duplicate elements are not allowed.
//Insertion order is not maintained. therefore no index concept.    

public class SetDemo {
	public static void main(String[] args) {
		Set set = new LinkedHashSet();//In linkedHashSet the insertion oorder is maintained
		//HashSet can be used.
		//get error if u try to create an object for interface set,so use implementable class
		
		//accepts heterogenous datatype
		set.add(5);
		set.add("Atria");
		set.add(true); //boolean value is given
		set.add(75.5f);
		set.add('f');
		
		
		System.out.println("the set elements are:" +set);
		set.add(true);//duplicate element is not printed again
		
	}

}
