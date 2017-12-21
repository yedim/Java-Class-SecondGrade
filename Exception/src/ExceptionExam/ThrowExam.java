package ExceptionExam;

public class ThrowExam {

	public static void arrayMethod() throws ArrayIndexOutOfBoundsException{
		String[] irum=new String[3];
		irum[3]="홍길동";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowExam ts = new ThrowExam();
		try{
			arrayMethod();
		}catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("배열 예외 발생");
		}
	}

}
