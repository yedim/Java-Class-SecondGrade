package StringBuffer;

class Delete
{
	public static String delChar(String str,String del)
	{
		StringBuffer sb= new StringBuffer(str);//for��

		for(int i=0; i<del.length();i++)
		{
			char delCh = del.charAt(i);//del�� ���ε��� ��.! ~
			String delStr = Character.toString(delCh);//char�� string���� "!"  "~"
			
			int delIdx=sb.indexOf(delStr);//del�� str���� ��� ��ġ�� �ִ���.
			sb.deleteCharAt(delIdx);
			
			while(true)//���ڰ� 2�� �̻��� ��
			{
				delIdx=sb.indexOf(delStr);//delIdx�ٽ� �ؼ� 
				
				if(delIdx!=-1)//-1�̸� ���ڿ��� ���ٴ� ���̴�. -1�� �ƴ� ������ �� ������ �� �����
					sb.deleteCharAt(sb.indexOf(delStr,delIdx));
				else
					break;
			}
		}//for��
		System.out.println(sb);	
		return str; 		
	}
}

public class DelCharTest {

	public static void main(String[] args) 
	{
		Delete.delChar("12!3!45@","!@");
	}

}
