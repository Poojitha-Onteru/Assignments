package com.practice1;

public class Employee {
	private String empname;
	private int empId;
	private String designation;
	private String mobileNum;
	
	public Employee() {
		super();
	}
	
	public Employee(String empname, int empId, String designation, String mobileNum) {
		super();
		this.empname = empname;
		this.empId = empId;
		this.designation = designation;
		this.mobileNum = mobileNum;
	}
	

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empId=" + empId + ", designation=" + designation + ", mobileNum="
				+ mobileNum + "]";
	}

}
