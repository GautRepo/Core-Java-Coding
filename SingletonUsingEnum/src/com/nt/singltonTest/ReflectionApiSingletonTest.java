package com.nt.singltonTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.nt.sdp.Printers;

public class ReflectionApiSingletonTest {

	public static void main(String[] args) {
		Class c = null;
		Constructor[] cons = null;
		Printers p1 = Printers.INSTANCE;
		Printers p2 = null;

		try {
			c = Class.forName("com.nt.sdp.Printers");
			cons = c.getDeclaredConstructors();
			cons[0].setAccessible(true);
			p2 = (Printers) cons[0].newInstance();
			System.out.println(p1.hashCode()+" "+p2.hashCode());

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
