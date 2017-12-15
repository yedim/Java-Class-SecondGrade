package hwp;
//char형 ch 에 ‘A’ 할당하고, String형 strData1에 “A”를 대입하시오.
//그리고, ch값을 String형 strData2에 대입한 후,
//strData1과 strData2의 내용이 같은지 비교하여 출력하시오.(valueOf())

public class Num04 {

	public static void main(String[] args) {
		
		char ch ='A';
		String strData1="A";
		String strData2=String.valueOf(ch);
		
		if(strData1.equals(strData2))
			System.out.println("같음");
		else
			System.out.println("다름");
	}

}
