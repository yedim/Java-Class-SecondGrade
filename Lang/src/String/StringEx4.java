package String;

//�Է¹��� ����=> �ѱ��ھ� ������
class NumToString 
{
	public static void translate(int number)
	{
		String str;
		str= String.valueOf(number);
		
//		for�� ������ string�� �߶� ����� ���� ���̴�.
//		for(int i=0 ;i<str.length();i++)
//		{
//			System.out.println(str.charAt(i));
//		}
		
		char []data =str.toCharArray();//string =>char��ȯ
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
