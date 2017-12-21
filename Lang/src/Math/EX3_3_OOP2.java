package Math;

import java.util.Scanner;

class Player {
	
	public static int PutNumber() throws NumInputException{
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자입력(0~99)?");
		int n=scan.nextInt();
		
		if(n<0 || n>99)	{
			NumInputException excpt = new NumInputException();
			throw excpt;//throw문을 통해 예외가 발생했음을 자바 가상 머신 알림. 
		}
		return n;
	}
}
class CompareNumber{
	
	private static int cnt=0;//static으로 해야 실행했을 때 0으로 안되돌아감.
	private static int randomNum=((int)(Math.random()*100));

	public CompareNumber(int n){
		
		if(randomNum<n)
			System.out.println("너무 큽니다"); 
		else if(randomNum>n)
			System.out.println("너무 작습니다."); 
		else{
			System.out.println("***축하합니다.***"); System.exit(0);
		}	
	}
	
	public void CountNumber(){
		cnt++;
		if(cnt>=7){
			System.out.println("7번의 기회가 끝났습니다. 숫자맞추기 실패...");
			System.exit(0);
		}
	}
}

class NumInputException extends Exception{
	
	public NumInputException(){
		System.out.println("0부터 99까지만 유효합니다.");
	}
}

class EX3_3_OOP2 {
	public static void main(String[] args) {
		
			try{			
				while(true){	
					int n=Player.PutNumber();//예외처리를 메소드에서 하게 함.
					CompareNumber cn=new CompareNumber(n);	
					cn.CountNumber();
				}			
			}
			catch(NumInputException e){	
				
			}
				
	}
}
