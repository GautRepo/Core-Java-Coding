package com.ud.ListImpl;

public class EmployeeLinkedList {
	
	private EmployeeNode head;
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNode(head);
		head=node;
	}

}