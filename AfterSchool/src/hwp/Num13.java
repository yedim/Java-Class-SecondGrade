package hwp;
//Integer��ü in1�� 100, Integer��ü in2�� 100, Integer��ü in3�� 200�� �ְ�, in1�� in2�� ���� ���ϰ�, in1�� in3�� ���Ͽ� ����Ͻÿ�.

public class Num13 {

	public static void main(String[] args) {

		Integer in1=new Integer(100);
		Integer in2=new Integer(100);
		Integer in3=new Integer(200);
		
		System.out.println(in1.compareTo(in2));
		System.out.println(in1.compareTo(in3));
	}

}
