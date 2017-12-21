package StringBuffer;

class Delete
{
	public static String delChar(String str,String del)
	{
		StringBuffer sb= new StringBuffer(str);//for밖

		for(int i=0; i<del.length();i++)
		{
			char delCh = del.charAt(i);//del이 따로따로 됨.! ~
			String delStr = Character.toString(delCh);//char를 string으로 "!"  "~"
			
			int delIdx=sb.indexOf(delStr);//del이 str에서 어디에 위치해 있는지.
			sb.deleteCharAt(delIdx);
			
			while(true)//문자가 2개 이상일 때
			{
				delIdx=sb.indexOf(delStr);//delIdx다시 해서 
				
				if(delIdx!=-1)//-1이면 문자열이 없다는 뜻이다. -1이 아닐 때까지 또 있으면 또 지우고
					sb.deleteCharAt(sb.indexOf(delStr,delIdx));
				else
					break;
			}
		}//for끝
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
