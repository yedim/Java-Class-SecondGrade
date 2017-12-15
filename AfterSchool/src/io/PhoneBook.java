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
			System.out.print("이름을 입력하세요 >>");
			name = br.readLine();
			bw.write(name);
			
			System.out.print("전화번호를 입력하세요 >>");
			phonenum = br.readLine();
			bw.write(phonenum);
			bw.newLine();
			cnt++;
			System.out.println(cnt+"번에 저장되었습니다.");
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
			System.out.println("전화번호부");
			System.out.println("1.조회");
			System.out.println("2.입력");
			System.out.println("3.종료");
			System.out.print("번호를 선택하세요 : ");
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
				System.out.println("전화번호를 종료합니다.");
				exit();
				break;
			default:
				break;
			}
		}
		
	}
}
