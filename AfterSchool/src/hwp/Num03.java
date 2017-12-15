package hwp;
//String 객체 R1, R2, R3를 생성한 후, 각각 ‘JAVA’, ‘JAVA’,‘java’를 할당하시오.

public class Num03 {

	public static void main(String args[]) {
		String R1 = new String("JAVA");
		String R2 = new String("JAVA");
		String R3 = new String("java");

		System.out.println("R1==R2-->" + (R1 == R2));
		System.out.println("R1.equals(R2)-->" + R1.equals(R2));
		System.out.println("R1==R3" + (R1 == R3));
		System.out.println("R1.equals(R3)" + R1.equals(R3));
		// ==는 참조값 비교, .equals는 값비교
	}
}
