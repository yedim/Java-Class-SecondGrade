package hwp;
//String�� stri=123456, strd=123.56�� ���� �� stri�� strd�� wrapper������ ��ȯ�Ͽ� ����ϰ�, stri�� strd�� ���� ����� ����Ͻÿ�.

public class Num15 {

	public static void main(String[] args) {
		String stri="123456";
		String strd="123.56";
		
		System.out.println(Integer.valueOf(stri)+Double.valueOf(strd));

	}

}
