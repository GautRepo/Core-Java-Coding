package com.ds.MethodRefrence;

class Sample{
	 Sample(){
		 System.out.println("Sample.Sample()");
	 }
}

interface Interfs{
	public Sample get();
}

public class ConstructerRef {
	
	public static void main (String[] args) {
		Interfs i = Sample :: new ;
		Sample s = i.get();
		
	}

}
