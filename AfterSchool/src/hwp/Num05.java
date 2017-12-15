package hwp;
//strData1에 ‘ I LOVE YOU’를 대입한 후 공백제거한 값을 strData2에 대입하시오. 
//그리고, strData1과 strData2의 내용이 같은지 비교하여 출력하시오.(trim())

public class Num05 {

	public static void main(String[] args) {
		
		String strData1 =" I LOVE YOU";
		String strData2= strData1.trim();
		System.out.println(strData1.equals(strData2));
	}

}
