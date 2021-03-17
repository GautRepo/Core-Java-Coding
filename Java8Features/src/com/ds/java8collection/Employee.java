package com.ds.java8collection;

public class Employee {
	
	private Integer eno;
	private String ename;
	private Integer esal;
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getEsal() {
		return esal;
	}
	public void setEsal(Integer esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	
	

}
