package com.demo.training;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class mainclass {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		person p=new person();
		p.setName("surabhi");
		p.setAddress("mumbai");
	p.setNumber(101);
		try {
			System.out.println("Before Serialization");
			FileOutputStream  fileOut=new FileOutputStream("C:\\Users\\S4406022\\Desktop\\pp.txt");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(p);
			out.close();
			fileOut.close();
			System.out.println("end");
			
			//read
			FileInputStream fn=new FileInputStream("C:\\\\Users\\\\S4406022\\\\Desktop\\\\pp.txt");
			ObjectInputStream ob=new ObjectInputStream(fn);
			System.out.println(ob.readObject());
			ob.read();
			ob.close();
			fn.close();
			
		}
		catch(IOException i) {
			i.printStackTrace();
		}
		
		}

	}


