package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class system_ini_FileUpperCase {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new FileReader("C:\\Windows\\system.ini"));
		
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s.toUpperCase());
		}
	}

}
