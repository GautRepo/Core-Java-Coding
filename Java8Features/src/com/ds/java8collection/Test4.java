package com.ds.java8collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		Employee emp = new Employee();
		emp.setEno(1);
		emp.setEname("Gautam");
		emp.setEsal(10000);
		
		Employee emp2 = new Employee();
		emp2.setEno(5);
		emp2.setEname("Priya");
		emp2.setEsal(5000);
		
		
		list.add(emp);
		list.add(emp2);
		
		List<String> names= list.stream().filter(e-> e.getEsal()>8000).map(e -> e.getEname()).collect(Collectors.toList());
		System.out.println(names);
		
		Collections.sort(list,(e1,e2)->e2.getEno().compareTo(e1.getEno()));
		System.out.println(list);
		
	}

}
