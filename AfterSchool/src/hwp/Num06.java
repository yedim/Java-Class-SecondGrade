package hwp;
//strData1에 ‘I LOVE YOU’를 할당 한 후, YOU만 추출하여 strData3에 대입한 후 출력하시오.

public class Num06 {

	public static void main(String[] args) {

		String strData1 ="I LOVE YOU";
		String strData3 = strData1.substring(7, 10);
		System.out.println(strData3);
	}

}
