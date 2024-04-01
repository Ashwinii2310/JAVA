package edu.atria.oops.abstractclass;
      // enable abstract box while creating class

public abstract class Shape {
	 //static float area;
	float area;
	
	//return type if float,name of method is calculate area
	
	public abstract float calculateArea();
	
	//1.an abstract method can have both non abstract method and abstract method
	
	/*public static final  void display() {
		System.out.println("Area of the shape is:"+area);
	}*/
	
    //2.if there is atleast one abstract method then the class should  be an abstract class
	//3.an abstract class can have static and final  methods ,static added to public so add to float at line 5

    public void display() {
    	System.out.println("Area of the shape:"+ area);
    }
}