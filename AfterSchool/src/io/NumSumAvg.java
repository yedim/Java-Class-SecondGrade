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

			System.out.print("숫자입력 : ");
			s1 = br.readLine();
			System.out.println("입력한 숫자:"+s1);

			System.out.print("숫자입력 : ");
			s2 = br.readLine();
			System.out.println("입력한 숫자:"+s2);
			
			int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
			double avg = sum / 2.0;
			System.out.println("합 : " + sum);
			System.out.println("평균 : " + avg);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
