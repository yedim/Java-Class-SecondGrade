package IOExam;

import java.util.Scanner;

class RandomNum
{
	public RandomNum()
	{
		System.out.println("랜덤 숫자 6개 출력");
		for(int i=0;i<6;i++)
		{
			int num=(int)(Math.random()*45)+1;
			System.out.print(num+"\t");	
		}
		System.out.println();
	}
	public RandomNum(int n)
	{
		System.out.println("랜덤 숫자 "+n+"개 출력");
		for(int i=0;i<n;i++)
		{
			int num=(int)(Math.random()*45)+1;
			System.out.print(num+"\t");
		}
	}
}

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RandomNum r1= new RandomNum();
		RandomNum r2= new RandomNum(3);

		
	}

}
