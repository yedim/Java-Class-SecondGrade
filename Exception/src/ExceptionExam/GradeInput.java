package ExceptionExam;

//InputMismatchException

import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeInputException extends Exception
{
	private String reason;

	public NegativeInputException() {
		super();
		reason="�����Է�";
	}

	@Override
	public String toString() {
		return "NegativeInputException : " + reason;
	}
	
	
}
public class GradeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
		int newGrade;
		Scanner scan=new Scanner(System.in);
		System.out.println("�����Է� : ");
		
		while(scan.hasNext())//�����Է��� �ִ°�
		{
			newGrade =scan.nextInt();
			if(newGrade<0)throw new NegativeInputException();//throw������ ȣ��
			System.out.println("�����Է� : ");

		}
		}catch(InputMismatchException e)
		{
			System.out.println(e.toString());
		}catch(NegativeInputException nie)
		{
			System.out.println(nie.toString());
		}
	}

}
