package IOExam;

import java.io.*;
import java.util.*;

public class Ex2 {
static int i=0;
	
	//���ݳ��� ������ ������ ����� ���� �� �����.
	public static void PutData() throws Exception
	{
		BufferedWriter bw = new BufferedWriter(new FileWriter("phonebook.data",true));
		
		String s=null;
		
			String name;
			String number;
			String address;
			Scanner scan= new Scanner(System.in);

			System.out.print("�̸� : ");
			name=scan.next();

			System.out.print("��ȭ��ȣ : ");
			number=scan.next();
			
			System.out.print("�ּ� : ");
			address=scan.next();
			
			
			bw.write(name +" "+ number+" "+address);
			bw.newLine();
			bw.close();
			i++;
		
	}
	public static void SearchData() throws Exception
	{
		BufferedReader br= new BufferedReader(new FileReader("phonebook.data"));
		
		String s;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("�̸��Է� : ");
		String nn= sc.nextLine();
		while((s=br.readLine())!=null)
		{
					
			if(s.contains(nn)==true)
			{
				System.out.println("���� ��� : "+s);
			}
		}
		br.close();
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedWriter br1 = new BufferedWriter(new FileWriter("phonebook.data"));
		br1.flush();
		while(true){
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� �˻�");
		System.out.println("3. ����");
		System.out.print("�����Է� : ");
		
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		
		switch(n)
		{
		case 1: 
			PutData();
			break;
		case 2:
			SearchData();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("1~3 ���ڸ� �Է��ϼ���");
			
		}
		
		
	}
		
		
	}


}