package hwp;
//Integer��ü wrapi�����Ͽ� 100�� �ְ�, Double��ü wrapd�� �����Ͽ� 55.7�� �ְ� I=100, d=55.7�� ���¿���
//Integer.toString(i)+Double.toString(d)�� ����Ͽ� ����Ͻÿ�.
//����, wrapi.toString()+wrapd.toString()�� ����Ͽ� ����Ͻÿ�.

public class Num14 {

	public static void main (String args[])
	{
		Integer wrapi =new Integer(100);
		Double wrapd=new Double(55.7);
		int I =100;
		double d=55.7;
		
		System.out.println(Integer.toString(I)+Double.toString(d));
	}
}
