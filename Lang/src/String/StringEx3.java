package String;

public class StringEx3 {

	public static void main(String[] args) {

		char ch = 'A';
		String str1 = "A";
		String str2;//str2선언. 빈 문자열 : 크기가 0인 문자열, 즉 메모리 공간은 차지하고 있지만 값을 가지지 않는다.
		
		str2=String.valueOf(ch);//매개변수 값을 String형으로 형변환
		System.out.println(str1+str2);
		
		if(str1==str2)//참조
			System.out.println("같다");
		else
			System.out.println("다르다");	
		
		
		if(str1.equals(str2))//값비교 -> 오버라이딩
			System.out.println("같다");
		else
			System.out.println("다르다");		
	
	}

}
