package Byte_base;

import java.io.IOException;

public class Echo {//메아리

	public static void main(String[] args) throws IOException {
		int bt;
		while((bt= System.in.read())!=1)
		{//한글 지원안함 문자 단위 io로 넘어가야 됨
			//에러 뜨면 JVM한테 예외처리 맡길겡~
			System.out.println((char)bt);

		}
	}

}
