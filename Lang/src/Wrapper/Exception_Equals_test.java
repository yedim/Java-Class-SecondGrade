package Wrapper;

public class Exception_Equals_test {

	public static void main(String[] args) {
		
		try
		{
			Integer i1=new Integer("10");
			Integer i2=new Integer("10.0");
			
			if(i1.equals(i2))//값비교로 오버라이딩 되어있다.
			{
				System.out.println("값이 같습니다.");
			}
			else
			{
				System.out.println("값이 다릅니다.");
			}

		}
		catch(NumberFormatException e)//예외처리(컴파일 O). 오류(컴파일 X)
		{
			System.out.println("숫자 포맷이 틀립니다.");
		}
	}

}
