package hwp;
//String ��ü R1, R2, R3�� ������ ��, ���� ��JAVA��, ��JAVA��,��java���� �Ҵ��Ͻÿ�.

public class Num03 {

	public static void main(String args[]) {
		String R1 = new String("JAVA");
		String R2 = new String("JAVA");
		String R3 = new String("java");

		System.out.println("R1==R2-->" + (R1 == R2));
		System.out.println("R1.equals(R2)-->" + R1.equals(R2));
		System.out.println("R1==R3" + (R1 == R3));
		System.out.println("R1.equals(R3)" + R1.equals(R3));
		// ==�� ������ ��, .equals�� ����
	}
}
