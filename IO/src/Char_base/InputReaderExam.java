package Char_base;

import java.io.*;


public class InputReaderExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Reader reader= new InputStreamReader(System.in);
			try
			{
				int c;
				while((c=reader.read())!=-1)
				{
					System.out.println((char)c);
				}
			}catch(IOException e)
			{
				System.err.print(e);
			}
			System.out.println();
	}

}
