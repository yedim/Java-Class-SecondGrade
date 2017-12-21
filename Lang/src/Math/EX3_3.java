package Math;

import java.util.Scanner;

public class EX3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan=new Scanner(System.in);
				int n;
				
				int randomNum=((int)(Math.random()*100));//랜덤
				int cnt=0;
				
				do{
					System.out.println("숫자입력(0~99)?");
					n= scan.nextInt();//입력
						
					if(n>=0 && n<=99)//숫자체크
					{
						if(randomNum<n)
							System.out.println("너무 큽니다\n");
						else if(randomNum>n)
							System.out.println("너무 작습니다.\n");
						else
						{	
							System.out.println("***축하합니다***\n");	
							return;
						}
						cnt++;//개수체크
					}
					else
						System.out.println("숫자의 범위를 벗어났습니다.");
					
				}while(cnt<=7);
				System.out.println("숫자맞추기 실패\n");

	}

}
