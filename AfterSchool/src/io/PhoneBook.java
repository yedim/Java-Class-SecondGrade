package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PhoneBook {

static int cnt=0;
	
	public static void find()
	{
		try {
			BufferedReader br= new BufferedReader(new FileReader("phonebook.txt"));
			String s;
			while((s=br.readLine())!=null)
			{
				System.out.println(s);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void input()
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String name;
		String phonenum;
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("phonebooklecture.txt",true));
			System.out.print("�̸��� �Է��ϼ��� >>");
			name = br.readLine();
			bw.write(name);
			
			System.out.print("��ȭ��ȣ�� �Է��ϼ��� >>");
			phonenum = br.readLine();
			bw.write(phonenum);
			bw.newLine();
			cnt++;
			System.out.println(cnt+"���� ����Ǿ����ϴ�.");
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void exit()
	{
		System.exit(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		while(true)
		{
			System.out.println("��ȭ��ȣ��");
			System.out.println("1.��ȸ");
			System.out.println("2.�Է�");
			System.out.println("3.����");
			System.out.print("��ȣ�� �����ϼ��� : ");
			int n = scan.nextInt();
			switch(n)
			{
			case 1:
				find();
				break;
			case 2:
				input();
				break;
			case 3:
				System.out.println("��ȭ��ȣ�� �����մϴ�.");
				exit();
				break;
			default:
				break;
			}
		}
		
	}
}
