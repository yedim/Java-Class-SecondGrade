package String;

//입력받은 숫자=> 한글자씩 나누기
class NumToString 
{
	public static void translate(int number)
	{
		String str;
		str= String.valueOf(number);
		
//		for문 돌리면 string을 잘라서 출력한 것일 뿐이다.
//		for(int i=0 ;i<str.length();i++)
//		{
//			System.out.println(str.charAt(i));
//		}
		
		char []data =str.toCharArray();//string =>char변환
		for(int i=0 ;i<data.length;i++)
		{
				System.out.println("data ["+i+"]"+" = "+data[i]);
		}
		
	}
}
public class StringEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumToString.translate(2513);
	}

}
