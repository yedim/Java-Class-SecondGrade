package hwp;
//String형 stri=123456, strd=123.56을 넣은 후 stri와 strd를 wrapper형으로 변환하여 출력하고, stri와 strd를 더한 결과를 출력하시오.

public class Num15 {

	public static void main(String[] args) {
		String stri="123456";
		String strd="123.56";
		
		System.out.println(Integer.valueOf(stri)+Double.valueOf(strd));

	}

}
