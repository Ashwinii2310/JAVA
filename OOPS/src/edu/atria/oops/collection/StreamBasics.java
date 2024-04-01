package edu.atria.oops.collection;
// Stream introduced in java8
//source is array list collection
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamBasics {
// refer notes for stream api intro
	public static void main(String[] args) {
    // of- Returns a sequential ordered stream whose elements are th.ot.e specified values
		// specify the stream as Integer here and pass integer values
		
		Stream<Integer> str=Stream.of(10,20,30,40);
        /* Stream<Integer> strOne=str.map(num->num+2);
         strOne.forEach(System.out::println);*/
		
// here directly we take values of stream using of()
// intermediate operation ......map the given condition and store in str stream 
// str.forEach(System.out::println); u will get exception because str stream is closed after intermediate operation ,so u have to create a another stream to do this operation
// a new stream is created strOne to overcome exception
// takes all the element and prints , :: is a method referencing calls print method 
		         
         
// writing above two lines in one line without creating new stream and doing both intermediate and terminal operation same time
       str.map(num->num+2).forEach(System.out::println);
		
		
       
// source to stream operations example 
       
	Integer[] values = new Integer[] {1,2,3,2,4,3,6,7};// obtain source  values from integer array source and we convert it into a stream using stream method of array class
    Arrays.stream(values).map(num-> num*num).limit(4).distinct().forEach(System.out::println);
    
//above line is a pipeline operation where the stream created and both intermediate and terminal operation is done
// limit is a method just used to limit the operations only for 2 elements =it is an intermediate
// distinct is a method that gives only distinct elements  ,this is also intermediate operations   
	}

}
