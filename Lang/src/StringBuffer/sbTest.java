package StringBuffer;

public class sbTest {

	public static void main(String[] args) {

		StringBuffer sb1= new StringBuffer("java");
		StringBuffer sb2= new StringBuffer("java");
	
		if(sb1==sb2)//����
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("�ٸ���");	
		}
		
		
		if(sb1.equals(sb2))//������ (�������̵�X)=>toString������
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("�ٸ���");	
		}
		
	}

}
