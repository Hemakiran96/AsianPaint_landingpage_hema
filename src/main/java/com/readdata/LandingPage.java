package com.readdata;

public class LandingPage{
	
	private String fName;
	private String fGmail;
	private String fMobile;
	private String fPincode;

	public LandingPage(String Name, String Gmail, String Mobile, String Pincode) {
		this.fName = Name;
		this.fGmail = Gmail;
		this.fMobile = Mobile;
		this.fPincode = Pincode;
		
	}
	
	public String Name() {
		return fName;
	}
	
	public String Gmail() {
		return fGmail;
	}

	public String Mobile() {
		return fMobile;
	}


	public String Pincode() {
		return fPincode;
	}
	
}
