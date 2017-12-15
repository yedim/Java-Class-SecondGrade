package hwp;
//String형 a=10, b=20을 넣은 후 합과 평균을 구하여 출력하시오.(평균: float)

public class Num16 {

	public static void main(String[] args) {
		String a="10";
		String b="20";
		
		int sum= Integer.valueOf(a)+Integer.valueOf(b);
		int avg = sum/2;
		
		System.out.println(avg);

	}

}
