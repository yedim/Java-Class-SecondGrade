package hwp;
//Integer객체 in1에 100, Integer객체 in2에 100, Integer객체 in3에 200을 넣고, in1과 in2의 값을 비교하고, in1과 in3를 비교하여 출력하시오.

public class Num13 {

	public static void main(String[] args) {

		Integer in1=new Integer(100);
		Integer in2=new Integer(100);
		Integer in3=new Integer(200);
		
		System.out.println(in1.compareTo(in2));
		System.out.println(in1.compareTo(in3));
	}

}
