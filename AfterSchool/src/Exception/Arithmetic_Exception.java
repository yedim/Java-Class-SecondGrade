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
			System.out.println("0���� ���� �ȵ�");
		}
		finally
		{
			System.out.println("������ ����");
		}

	}

}
