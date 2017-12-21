package Math;

import java.util.Scanner;

class Player {
	
	public static int PutNumber() throws NumInputException{
		Scanner scan=new Scanner(System.in);
		System.out.println("�����Է�(0~99)?");
		int n=scan.nextInt();
		
		if(n<0 || n>99)	{
			NumInputException excpt = new NumInputException();
			throw excpt;//throw���� ���� ���ܰ� �߻������� �ڹ� ���� �ӽ� �˸�. 
		}
		return n;
	}
}
class CompareNumber{
	
	private static int cnt=0;//static���� �ؾ� �������� �� 0���� �ȵǵ��ư�.
	private static int randomNum=((int)(Math.random()*100));

	public CompareNumber(int n){
		
		if(randomNum<n)
			System.out.println("�ʹ� Ů�ϴ�"); 
		else if(randomNum>n)
			System.out.println("�ʹ� �۽��ϴ�."); 
		else{
			System.out.println("***�����մϴ�.***"); System.exit(0);
		}	
	}
	
	public void CountNumber(){
		cnt++;
		if(cnt>=7){
			System.out.println("7���� ��ȸ�� �������ϴ�. ���ڸ��߱� ����...");
			System.exit(0);
		}
	}
}

class NumInputException extends Exception{
	
	public NumInputException(){
		System.out.println("0���� 99������ ��ȿ�մϴ�.");
	}
}

class EX3_3_OOP2 {
	public static void main(String[] args) {
		
			try{			
				while(true){	
					int n=Player.PutNumber();//����ó���� �޼ҵ忡�� �ϰ� ��.
					CompareNumber cn=new CompareNumber(n);	
					cn.CountNumber();
				}			
			}
			catch(NumInputException e){	
				
			}
				
	}
}
