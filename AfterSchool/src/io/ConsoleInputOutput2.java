package io;

import java.io.*;
//콘솔 입력 출력(바이트단위)
public class ConsoleInputOutput2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int bt;
		///byte로는 깨지니깐 byte배열 새용
		while((bt=System.in.read())!=1)
		{
			System.out.print((char)bt);	//byte단위로는 한글 입력이 안된다우
		}
		
	}

}
