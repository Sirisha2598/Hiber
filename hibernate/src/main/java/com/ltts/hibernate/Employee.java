package com.ltts.hibernate;

public class Employee {
	

	private int Empid;
	private String Empname;
	private String Empaddress;
	
	
	
	
	public Employee() {
		super();
	}
	public Employee(int empid, String empname, String empaddress) {
		super();
		Empid = empid;
		Empname = empname;
		Empaddress = empaddress;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public String getEmpaddress() {
		return Empaddress;
	}
	public void setEmpaddress(String empaddress) {
		Empaddress = empaddress;
	}
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Empname=" + Empname + ", Empaddress=" + Empaddress + "]";
	}
	
		
}