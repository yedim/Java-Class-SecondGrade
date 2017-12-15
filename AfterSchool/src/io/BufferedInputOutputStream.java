package io;

import java.io.*;
//콘솔 입력 출력(바이트단위 한글입력)
public class BufferedInputOutputStream {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedInputStream bis = new BufferedInputStream(System.in);//키보드정보를 가지고 있어야댐
		BufferedOutputStream bos= new BufferedOutputStream(System.out);//출력정보를 가지고 있어야댐
		
		int a;
		while((a=bis.read())!=-1)
		{
			bos.write(a);	//ctrl+z누르면 출력
		}
		bis.close();
		bos.close();
	}

}
