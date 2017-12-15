package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class FileInputConsoleOutput {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("score.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("scorecopy.txt"));
		StringTokenizer stz;
		
		String s;
		int num1[]= new int[4];
		int num2[]= new int[4];
		int sum;
		int avg;
		int i=0;
		while((s=br.readLine())!=null)
		{
			stz=new StringTokenizer(s,"\t");
			stz.nextToken();//이름
			stz.nextToken();//지역
			num1[i]=Integer.parseInt(stz.nextToken());//
			num2[i]=Integer.parseInt(stz.nextToken());//
			sum=num1[i]+num2[i];
			avg=sum/2;
			
			
			System.out.println(s+"\t"+sum+"\t"+avg);
			i++;
			bw.write(s+"\t"+sum+"\t"+avg);
			bw.newLine();
		}
		br.close();
		bw.close();
		
	}

}
