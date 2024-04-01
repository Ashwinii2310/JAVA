package edu.atria.oops.collection;

// hover over student to add unimplemented methods
//COMPARABLE INTERFACE - interview question - HOVER ON Comparable to know about it
// comparable is a functional interface
//natural ordering is a dictionary order
public class Student implements Comparable<Student> {
	private String name;
	private int RollNo;
	private float per;

	//create a parameterized constructor
	public Student(String name, int rollNo, float per) {
		super();
		this.name = name;
		this.RollNo = rollNo;
		this.per = per;
		
	}

  // create getters and setters method
	public String getName() {
		return name;
	}

    public void setName(String name) {
		this.name = name;
	}


	public int getRollNo() {
		return RollNo;
	}

    public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

    public float getPer() {
		return per;
	}

    public void setPer(float per) {
		this.per = per;
	}

  //create ToString method

	@Override
	public String toString() {
		return "Student [name=" + name + ", RollNo=" + RollNo + ", per=" + per + "]";
	}
	



	@Override // compareTo is a method ,and it is accepting a default object and returning 0(before)
	public int compareTo(Student anotherStudent) {
		if(this.per == anotherStudent.per)
			return 0;
			// if condition is used to check and compare percentage of two student 
		else if(this.per> anotherStudent.per )
		  return 1;
		else {
			return -1;
		}
		
}  //o stands for another student so replace it with another student because u r  comparing student with another student

}





