package edu.atria.oops.inheritancedemo;

public class Grandfather {
	private int age;
	private String relation;
	
	
	public Grandfather(int age, String relation) {
		this.age = age;
		this.relation = relation;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getRelation() {
		return relation;
	}


	public void setRelation(String relation) {
		this.relation = relation;
	}


	@Override
	public String toString() {
		return "Relations [age=" + age + ", relation=" + relation + "]";
	}

	
}
