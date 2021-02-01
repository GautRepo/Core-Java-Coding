package com.nt.singltonTest;

import java.io.Serializable;

public class Utility implements Cloneable,Serializable {
	
	private static final long serialVersionUID = 346L;

	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
