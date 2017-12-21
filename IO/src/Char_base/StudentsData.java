package Char_base;

import java.io.*;
import java.util.Scanner;
public class StudentsData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int number;
		String name;
		String major;
		
		try
		{
			FileInputStream fis= new FileInputStream("students.dat");
			DataInputStream dis =new DataInputStream(fis);
			
			number= dis.readInt();
			name=dis.readUTF();
			major = dis.readUTF();
			
			System.out.println(number +"  "+name+"  "+major+"  ");
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
