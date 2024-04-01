package edu.atria.oops.classandobject;
//encapsulation(oops) concept is used by making fields private

public class Employee {
	 private int id;
	 private String name;
	 private float salary;
	 private String department;
	 
	// default constructor created (name of constructor is same as class name)
	 public Employee() { 
		 System.out.println("Default constructor is called................");
		
	 }
	 //parameter constructor is created and parameters passed
	 public Employee(int id,String name,float salary,String department) {
		 System.out.println("Parameterized constructor is called...............");
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
		 this.department=department;
	 }
	 
	//getter -gets the data,setter -sets the data,all methods are made  public 
	//source-generate getter and setter -click all -make public
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) { //void bcs setter wont return anything it sets the value in that place
		this.department = department;
	}
	
	 //toString is used becuase without this the default constructor when called shows the memory location not the values
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
// green symbol for line 54 is bcs toString method is overriding

	}
	
}	


