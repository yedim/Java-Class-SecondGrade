package hwp;
//���ڿ� Class�� s���ڰ� �� �� ���ԵǾ� �ִ��� ����Ͻÿ�.

public class Num08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Class";
		StringBuffer sb= new StringBuffer(str);
		int cnt=0;
		
		for(int i=0; i<str.length();i++)
		{
			if(sb.charAt(i)=='s')
				cnt++;
		}
		System.out.println(cnt);
		
	}

}
