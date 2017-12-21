package Char_base;

import java.io.*;
public class BufferedReaderExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try{
			String aa=br.readLine();//입력
			System.out.println(aa);//출력
		}catch(IOException e){
			
		}
	}

}
