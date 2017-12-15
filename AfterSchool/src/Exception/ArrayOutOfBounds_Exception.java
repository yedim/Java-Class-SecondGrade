package Exception;


public class ArrayOutOfBounds_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= new int[3];
		
		try
		{
			for(int i=0; i<=a.length;i++)
			{
				System.out.println(a[i]);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
