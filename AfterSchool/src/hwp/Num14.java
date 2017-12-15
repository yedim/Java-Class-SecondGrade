package hwp;
//Integer객체 wrapi생성하여 100을 넣고, Double객체 wrapd를 생성하여 55.7를 넣고 I=100, d=55.7인 상태에서
//Integer.toString(i)+Double.toString(d)를 계산하여 출력하시오.
//또한, wrapi.toString()+wrapd.toString()을 계산하여 출력하시오.

public class Num14 {

	public static void main (String args[])
	{
		Integer wrapi =new Integer(100);
		Double wrapd=new Double(55.7);
		int I =100;
		double d=55.7;
		
		System.out.println(Integer.toString(I)+Double.toString(d));
	}
}
