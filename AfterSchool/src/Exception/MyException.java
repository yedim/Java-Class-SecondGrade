package Exception;

public class MyException {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test01();
	}
	private static void test01()
	{
		test02();
	}
	private static void test02()
	{
		try
		{
			throw new Exception("test");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
