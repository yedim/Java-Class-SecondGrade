package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TrippleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			FileReader fr= new FileReader("");
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
