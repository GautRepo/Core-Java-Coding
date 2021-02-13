package com.ud.ListImpl;

public class EmployeeNode {
	
	private Employee employee;
	private EmployeeNode node;
	
	public EmployeeNode(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNode() {
		return node;
	}

	public void setNode(EmployeeNode node) {
		this.node = node;
	}

	@Override
	public String toString() {
		return "EmployeeNode [employee=" + employee + ", node=" + node + "]";
	}
	
	
	
	

}
