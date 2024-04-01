package edu.atria.oops.inheritancedemo;

public class Mp  extends Citizen{
	
	private int mpid;
	private String MpName;
	private String Locality;
	private String Party;

	//create a public parameterized constructor
	public Mp(long aadharNo, String nationality, String address, String dob, char gender,int mpid,String MpName,String Locality,String Party) {
		super(aadharNo, nationality, address, dob, gender);
		this.mpid = mpid;
		this.MpName = MpName;
		this.Locality = Locality;
		this.Party = Party;
	}

	public int getMpid() {
		return mpid;
	}

	public void setMpid(int mpid) {
		this.mpid = mpid;
	}

	public String getMpName() {
		return MpName;
	}

	public void setMpName(String mpName) {
		MpName = mpName;
	}

	public String getLocality() {
		return Locality;
	}

	public void setLocality(String locality) {
		Locality = locality;
	}

	public String getParty() {
		return Party;
	}

	public void setParty(String party) {
		Party = party;
	}

	//source,generate toString by clicking inherit methods
	@Override
	public String toString() {
		return "Mp [mpid=" + mpid + ", MpName=" + MpName + ", Locality=" + Locality + ", Party=" + Party
				+ ", getAadharNo()=" + getAadharNo() + ", getNationality()=" + getNationality() + ", getAddress()="
				+ getAddress() + ", getDob()=" + getDob() + ", getGender()=" + getGender() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
