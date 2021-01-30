package com.nt.singltonTest;

public class ForCloning implements Cloneable {
	

	public Object doclone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
