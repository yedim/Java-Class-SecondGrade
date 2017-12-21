package Char_base;

import java.io.*;
import java.util.Scanner;
public class Students {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int number;
		String name;
		String major;
		
	
		Scanner scan= new Scanner(System.in);
		System.out.print("학번 : ");
		number=scan.nextInt();
		
		System.out.print("이름 : ");
		name=scan.next();

		System.out.print("전공 : ");
		major=scan.next();
		
		FileOutputStream fos = new FileOutputStream("students.dat");
		DataOutputStream dos= new DataOutputStream(fos);
		dos.writeInt(number);
		dos.writeUTF(name);
		dos.writeUTF(major);
		
		
	}

}
