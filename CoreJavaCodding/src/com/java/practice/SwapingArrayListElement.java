package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapingArrayListElement {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Collections.swap(list, 2, 3);
		System.out.println(list);
		

	}

}
