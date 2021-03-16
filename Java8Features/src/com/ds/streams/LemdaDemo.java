package com.ds.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LemdaDemo {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		Employee emp = new Employee();
		emp.setEno(1);
		emp.setEname("Gautam");
		emp.setEsal(1000);
		list.add(emp);
		
		List<String> names= list.stream().filter(e-> e.getEsal()>10000).map(e -> e.getEname()).collect(Collectors.toList());
		
	}

}
