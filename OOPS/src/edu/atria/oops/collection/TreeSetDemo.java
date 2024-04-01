/*package edu.atria.oops.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> treeSet = new TreeSet<Integer>();//type safety or type restriction (wrapper class) 
		//is done so that they are made homogeneous
		
		// exception occurs when u add heterogenous element even before the type safety 
		treeSet.add(21);
		treeSet.add(25);
		treeSet.add(66);
		treeSet.add(77);
		treeSet.add(99);
		treeSet.add(34);
		//Insertion order is  not maintained but it is SORTED and printed
		
		//treeSet.add("atria");// no compile error but exception in main thread 
	
			System.out.println("The TreeSet elements are: "+ treeSet);
		
	}

}*/


// Above program is a demo for TreeSet 
// below is Student program main program

package edu.atria.oops.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//user defined tree set
	
		TreeSet<Student> t = new TreeSet<Student>() ;
		t.add(new Student("Rahul",101,98.5f));
		t.add(new Student("Raveena",102,97.65f));
		t.add(new Student("praveen",103,98.65f));
		t.add(new Student("Ashwini",104,94.85f));
		t.add(new Student("Advith",105,98.65f));
		System.out.println("The Student details are: " + t);
		
		
	}
}