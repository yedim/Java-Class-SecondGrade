package String;

public class TrimExam {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strData1=" I Love You";
		String strData2;
		System.out.println("strData1.trim() ->"+strData1);

		strData2 = strData1.trim();
		System.out.println("strData1.trim() ->"+strData2);
		
		if(strData1.equals(strData2))//공백도 체크한다.
		{
			System.out.println("같음");
		}
		else
		{
			System.out.println("다름");
		}
	}

}
