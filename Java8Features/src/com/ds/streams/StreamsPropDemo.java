package com.ds.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPropDemo {

	public static void main(String[] args) {
		
		List<String> list = List.of("Gautam","Priya","Pankaj","Sunita","Shivam");
		
		//filter
		List<String> l= list.stream().filter(str->str.length()>5).collect(Collectors.toList());
		System.out.println(l);
		
		
		//map
		List<String> l2= list.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);
		
		//count
		 Long count = list.stream().filter(str->str.length()==5).count();
		 System.out.println(count);
		 
		 //sorted without arg
		 List<String> l3 = l2.stream().sorted().collect(Collectors.toList());
		 System.out.println(l3);
		 
		 //sort with arg
		 List<String> l4 = l2.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
		 System.out.println(l4);
		 
		 //min value
		 String str = list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		 System.out.println(str);
		 
		 //max value
		 String st = list.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		 System.out.println(st);
		 
		 
		 //forEach
		 list.stream().forEach(s -> System.out.print(s+" "));
		 System.out.println();
		 
		 //forEach with method ref
		 list.stream().forEach(System.out::println);
		 
		 //toArray()
		 String[] arr= list.stream().toArray(String[] :: new);
		 for(String s : arr) {
			 System.out.print(s+" ");
		 }
		 System.out.println();
		 
		 //streams to group of elements
		 Stream<Integer> stream = Stream.of(1,11,111,1111,11111);
		 stream.forEach(System.out :: println);
		 
		 //stream for array
		 Integer[] iarr = {1,2,3,4,5,6};
		 Stream<Integer> istr = Stream.of(iarr);
		 istr.forEach(System.out::println);
		 

	}

}
