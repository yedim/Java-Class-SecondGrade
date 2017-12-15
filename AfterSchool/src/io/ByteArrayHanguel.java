package io;

import java.io.*;
//콘솔 입력 출력(바이트단위)
public class ByteArrayHanguel {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		byte[] b= new byte[1024];//byte배열 1024개 
		int length=0;//length 자바 입력하면
		length= System.in.read(b);//콘솔에 입력한 것을 b에 저장하고, length에 반환값인 4가 들어감
		System.out.write(b,0,length);
		
	}

}
