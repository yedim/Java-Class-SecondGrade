package Wrapper;

public class WrapExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Integer wrapi = new Integer(100);
			Double wrapd = new Double(55.7);
			int i=100;
			double d= 55.7;
			double d1;
			d1 = d+i;
			System.out.println(i+d);
			System.out.println(Integer.toString(i)+Double.toString(d));
			System.out.println(wrapi+wrapd.intValue());//100+55=>155		
	}
}
