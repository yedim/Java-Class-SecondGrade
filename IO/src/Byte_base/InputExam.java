package Byte_base;

import java.io.IOException;
import java.io.InputStream;

public class InputExam {

	public static void streamTest(InputStream is)//�Ű������� �Է½�Ʈ��
	{
		try
		{
			while(true)
			{
				int i= is.read();//1����Ʈ�� �д� �޼ҵ�
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
		streamTest(System.in);//ǥ���Է�
//�ѱ� �������̤̤� ����Ʈ�����Է��̶�
	}

}
