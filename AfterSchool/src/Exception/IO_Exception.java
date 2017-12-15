package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_Exception {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

			String s;
			s=br.readLine();
			System.out.println(s);
				
			String str=null;
			System.out.println(str.length());
			
			int[] arr= {10,20,30,40};
			for(int i=0; i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
