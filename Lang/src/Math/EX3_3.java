package Math;

import java.util.Scanner;

public class EX3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan=new Scanner(System.in);
				int n;
				
				int randomNum=((int)(Math.random()*100));//����
				int cnt=0;
				
				do{
					System.out.println("�����Է�(0~99)?");
					n= scan.nextInt();//�Է�
						
					if(n>=0 && n<=99)//����üũ
					{
						if(randomNum<n)
							System.out.println("�ʹ� Ů�ϴ�\n");
						else if(randomNum>n)
							System.out.println("�ʹ� �۽��ϴ�.\n");
						else
						{	
							System.out.println("***�����մϴ�***\n");	
							return;
						}
						cnt++;//����üũ
					}
					else
						System.out.println("������ ������ ������ϴ�.");
					
				}while(cnt<=7);
				System.out.println("���ڸ��߱� ����\n");

	}

}
