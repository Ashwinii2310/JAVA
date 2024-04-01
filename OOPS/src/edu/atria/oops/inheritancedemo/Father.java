package edu.atria.oops.inheritancedemo;

public class Father extends Grandfather {
	
	private int height;
	
	private String dob;
	
	public Father(int age, String relation,int height,String dob) {
		super(age, relation);
		this.height= height;
		this.dob = dob;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Father [height=" + height + ", dob=" + dob + ", getAge()=" + getAge() + ", getRelation()="
				+ getRelation() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}