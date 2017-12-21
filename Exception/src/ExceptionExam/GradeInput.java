package ExceptionExam;

//InputMismatchException

import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeInputException extends Exception
{
	private String reason;

	public NegativeInputException() {
		super();
		reason="음수입력";
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
		System.out.println("점수입력 : ");
		
		while(scan.hasNext())//다음입력이 있는가
		{
			newGrade =scan.nextInt();
			if(newGrade<0)throw new NegativeInputException();//throw생성사 호출
			System.out.println("점수입력 : ");

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
