package edu.atria.oops.inheritancedemo;

public class Son  extends Father{

	


	private int Nosiblings;
    private int birthyear;
	private char gender;

	public Son(int age, String relation, int height, String dob,int Nosiblings,int birthyear,char gender) {
		super(age, relation, height, dob);
		 this.Nosiblings =Nosiblings;
		this.birthyear= birthyear;
		this.gender = gender;
		
}


	public int getNosiblings() {
		return Nosiblings;
	}


	public void setNosiblings(int nosiblings) {
		Nosiblings = nosiblings;
	}


	public int getBirthyear() {
		return birthyear;
	}


	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Son [Nosiblings=" + Nosiblings + ", birthyear=" + birthyear + ", gender=" + gender + ", getHeight()="
				+ getHeight() + ", getDob()=" + getDob() + ", toString()=" + super.toString() + ", getAge()=" + getAge()
				+ ", getRelation()=" + getRelation() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}


	
}
