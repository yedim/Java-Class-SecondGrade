package Math;

import java.util.Scanner;

class Num//���ڳֱ�,�������� �߻�
{
	Scanner scan=new Scanner(System.in);
	private int n;
	private int randomNum ;//����
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
class CompareNum extends Num//���ϱ�,����üũ�ϱ�
{
	public void isRangeNum(int randomNum,int n)//�������� ����������ũ
	{
		System.out.println("�����Է� (0~99)? ");
		randomNum=getRandomNum();
		n=getN();
		
		
		if(n<1 || n>99)
			System.out.println("1���� 99������ ���ڸ� �Է��ϼ���.");
		else
		{
			if(randomNum<n)
				System.out.println("�ʹ� Ů�ϴ�");
			else if(randomNum>n)
				System.out.println("�ʹ� �۽��ϴ�.");
			else
			{
				System.out.println("***�����մϴ�.***");
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
			System.out.println("���� ���߱� �����ϼ̽��ϴ�.");
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
