package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class MejorityElement {

	public static void main(String[] args) {
		int[] arr = {10,20,10,10,20,20,30,30}; 
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int a : arr) {
			if(!map.containsKey(a))
				map.put(a, 1);
			else
				map.put(a, map.get(a)+1);
			
			if(map.get(a)>2)
				System.out.println(a+"-->"+map.get(a));
		}

	}

}
