package Byte_base;

import java.io.IOException;
import java.io.InputStream;

public class InputExam {

	public static void streamTest(InputStream is)//매개변수로 입력스트림
	{
		try
		{
			while(true)
			{
				int i= is.read();//1바이트를 읽는 메소드
				if(i==-1)break;
				
				char c=(char)i;
				System.out.print(c);
			}
		}catch(IOException e){
			System.err.println(e);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		streamTest(System.in);//표준입력
//한글 깨지무ㅜㅜㅜ 바이트단위입력이라서
	}

}
