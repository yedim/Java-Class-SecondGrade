package String;

class NumToHanguel 
{
	public static void translate(int number)
	{
		String num[]={"","��","��","��","��","��","��","ĥ","��","��"};
		String dan[]={"","��","��", "õ", "��"};
		
		String str;
		str= String.valueOf(number);//int => string��ȯ
		
		char []data =str.toCharArray();//string =>char��ȯ
		for(int i=0 ;i<data.length;i++)
		{
			System.out.print(data[i]);
		}
		System.out.println();
		
		for(int i=0 ;i<data.length;i++)
		{
				int numIndex=data[i]-48;
				int danIndex=data.length-(i+1);
				
				if(numIndex==0)
					danIndex=0;
				
				if(danIndex !=0 && numIndex==1)//���� �ڸ� ���������ϰ� 1�̸� ������ ���̰� ���� ���־� �ȴ�.
					numIndex=0;
				
				if(danIndex>=5)
				{
					if(danIndex<7)
					{
						danIndex-=4;
					}
					else
					{
						System.out.println("�鸸�� ���� ū �����Դϴ�. �߸� �Է��ϼ̽��ϴ�.");
						return;	
					}	
				}
				System.out.print(num[numIndex]+dan[danIndex]);			
		}//for�� ��	
		
	}
	public static void translate(double number)
	{
		System.out.println("�Ҽ� �ȵ˴ϴ�.");
	}
}
public class NumToKorean {

	public static void main(String[] args) {
		NumToHanguel.translate(12345);
		System.out.println();
		NumToHanguel.translate(10030);
		System.out.println();
		NumToHanguel.translate(25);
		

	}

}
