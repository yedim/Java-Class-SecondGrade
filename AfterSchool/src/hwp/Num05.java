package hwp;
//strData1�� �� I LOVE YOU���� ������ �� ���������� ���� strData2�� �����Ͻÿ�. 
//�׸���, strData1�� strData2�� ������ ������ ���Ͽ� ����Ͻÿ�.(trim())

public class Num05 {

	public static void main(String[] args) {
		
		String strData1 =" I LOVE YOU";
		String strData2= strData1.trim();
		System.out.println(strData1.equals(strData2));
	}

}
