package Math;

import java.util.Scanner;

class Num//숫자넣기,랜덤숫자 발생
{
	Scanner scan=new Scanner(System.in);
	private int n;
	private int randomNum ;//랜덤
	static int cnt=0;

	public Num(){
		n=scan.nextInt();
		randomNum=((int)(Math.random()*100));
	}
	public int getN() {
		return n;
	}
	
	public int getRandomNum() {
		return randomNum;
	}

}
class CompareNum extends Num//비교하기,개수체크하기
{
	public void isRangeNum(int randomNum,int n)//범위안의 숫자인지췌크
	{
		System.out.println("숫자입력 (0~99)? ");
		randomNum=getRandomNum();
		n=getN();
		
		
		if(n<1 || n>99)
			System.out.println("1부터 99사이의 숫자를 입력하세요.");
		else
		{
			if(randomNum<n)
				System.out.println("너무 큽니다");
			else if(randomNum>n)
				System.out.println("너무 작습니다.");
			else
			{
				System.out.println("***축하합니다.***");
				return;
			}
		}

		CheckCount();	
	}
	
	public void CheckCount()
	{	
		cnt++;
		
		if(cnt>=7)
		{
			System.out.println("숫자 맞추기 실패하셨습니다.");
			return;
		}
	}
}


public class EX3_3_OOP {

	public static void main(String[] args) {
		
		
		while(true)
		{
			
		}
		
	}

}
