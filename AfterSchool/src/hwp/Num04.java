package hwp;
//char�� ch �� ��A�� �Ҵ��ϰ�, String�� strData1�� ��A���� �����Ͻÿ�.
//�׸���, ch���� String�� strData2�� ������ ��,
//strData1�� strData2�� ������ ������ ���Ͽ� ����Ͻÿ�.(valueOf())

public class Num04 {

	public static void main(String[] args) {
		
		char ch ='A';
		String strData1="A";
		String strData2=String.valueOf(ch);
		
		if(strData1.equals(strData2))
			System.out.println("����");
		else
			System.out.println("�ٸ�");
	}

}
