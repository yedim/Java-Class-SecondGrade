package Exception;


public class Arithmetic_Exception{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=2;
		
		try
		{
			int c = a/b;
			
		}catch(ArithmeticException e)
		{
			System.out.println("0으로 실행 안됨");
		}
		finally
		{
			System.out.println("무조건 실행");
		}

	}

}
