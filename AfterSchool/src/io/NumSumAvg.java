package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumSumAvg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1;
		String s2;
		try {

			System.out.print("�����Է� : ");
			s1 = br.readLine();
			System.out.println("�Է��� ����:"+s1);

			System.out.print("�����Է� : ");
			s2 = br.readLine();
			System.out.println("�Է��� ����:"+s2);
			
			int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
			double avg = sum / 2.0;
			System.out.println("�� : " + sum);
			System.out.println("��� : " + avg);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
