package hwp;
//StringBuffer��ü�� sb1�� java programming�� �ְ�, sb2�� project�� ���� ��, sb1�� "project"���ڿ��� �߰��Ͽ� str1�� �ְ�, 
//sb1�� sb2�� �߰��Ͽ� str2�� ������ �� ���

public class Num09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1= new StringBuffer("java programming");//StringBuffer�� ���ڿ��� ������
		StringBuffer sb2 =new StringBuffer("project");
		
		StringBuffer str1 = sb1.append("project");
		StringBuffer str2 = sb1.append(sb2);
		
		System.out.println(str1);
		System.out.println(str2);
	}

}
