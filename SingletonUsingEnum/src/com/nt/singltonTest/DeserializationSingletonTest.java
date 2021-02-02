package com.nt.singltonTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.nt.sdp.Printers;

public class DeserializationSingletonTest {
	
	
	public static Object doSerialize(Object obj) {
		System.out.println("doSerialize()");
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:/prin.sir"));
			oos.writeObject(obj);
			oos.flush();
			oos.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		return obj;
	}
	public static ObjectInputStream doDeserialization(String path) {
		ObjectInputStream ois=null;
		try {
			ois = new ObjectInputStream(new FileInputStream(path));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return ois;
	}
	

	public static void main(String[] args) {
		Printers p1 =Printers.INSTANCE;
		//DeserializationSingletonTest.doSerialize(p1);
		
		try {
			Printers p2=(Printers) DeserializationSingletonTest.doDeserialization("E:/prin.sir").readObject();
		
			System.out.println(p1.hashCode()+" "+p2.hashCode());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
