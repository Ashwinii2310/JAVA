package edu.atria.oops.statickeyword;

public class EmployeeStatic {
	private String name;
	private int Id;
	// static used bcs company name of all employees is same therefore static keyword used
    private static String companyName="IBM";
    
    //create constructor
	public EmployeeStatic(String name, int id) {
		super();
		this.name = name;
		Id = id;
		//static variable is not there bcs that act as global reference
	}
    // generate only getter methods by enabling them during generating 
	public String getName() {
		return name;
	}

	public int getId() {
		return Id;
	}

	public static String getCompanyName() {
		return companyName;
	}
	@Override
	public String toString() {
		return "EmployeeStatic [name=" + name + ", Id=" + Id + ",companyName="+companyName+"]";
	}
    

	}
    
    

