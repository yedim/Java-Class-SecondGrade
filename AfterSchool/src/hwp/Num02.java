package hwp;
//str 변수에 ‘I LOVE YOU’를 할당한 후, 출력하시오.( for, charAt())

public class Num02 {

	public static void main(String[] args) {
		
		String str="I LOVE YOU";
		
		for(int i=0; i<str.length();i++)
		{
			System.out.print(str.charAt(i));
		}
	}

}
