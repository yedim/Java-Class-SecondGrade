package StringBuffer;

public class sbTest {

	public static void main(String[] args) {

		StringBuffer sb1= new StringBuffer("java");
		StringBuffer sb2= new StringBuffer("java");
	
		if(sb1==sb2)//참조
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");	
		}
		
		
		if(sb1.equals(sb2))//참조비교 (오버라이딩X)=>toString쓰세욤
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");	
		}
		
	}

}
