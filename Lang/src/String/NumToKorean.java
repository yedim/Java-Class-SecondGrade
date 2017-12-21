package String;

class NumToHanguel 
{
	public static void translate(int number)
	{
		String num[]={"","일","이","삼","사","오","육","칠","팔","구"};
		String dan[]={"","십","백", "천", "만"};
		
		String str;
		str= String.valueOf(number);//int => string변환
		
		char []data =str.toCharArray();//string =>char변환
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
				
				if(danIndex !=0 && numIndex==1)//일의 자리 숫자제외하고 1이면 단위만 붙이고 일은 없애야 된다.
					numIndex=0;
				
				if(danIndex>=5)
				{
					if(danIndex<7)
					{
						danIndex-=4;
					}
					else
					{
						System.out.println("백만이 가장 큰 단위입니다. 잘못 입력하셨습니다.");
						return;	
					}	
				}
				System.out.print(num[numIndex]+dan[danIndex]);			
		}//for문 끝	
		
	}
	public static void translate(double number)
	{
		System.out.println("소수 안됩니다.");
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
