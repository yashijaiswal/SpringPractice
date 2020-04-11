package com.test.springprac.beans;

public class Department {

	
	private int deptID;
	private String deptName;
	private Address deptAddr;
	
	public int getDeptID() {
		return deptID;
	}
	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Address getDeptAddr() {
		return deptAddr;
	}
	public void setDeptAddr(Address deptAddr) {
		this.deptAddr = deptAddr;
	}
	@Override
	public String toString() {
		return "Department [deptID=" + deptID + ", deptName=" + deptName + ", deptAddr=" + deptAddr + "]";
	}
	
	
	
}
