package edu.atria.oops.interfacee;

//()parameter-> {}Implementation

public class LambdaWithoutParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement s=()->{          //no paramenters given inside() only the implementation is given by calling interafce Statement and storing in var s
			return("hello");      //since in in body of statement interface we have given string here give return not print (syso) 
			};
       System.out.println(s.greet());
       
       isOdd o  = (a)->a%2==0 ? true: false;
       System.out.println(o.checkOdd(5));
	}
	
}
