package Byte_base;

import java.io.IOException;

public class Echo {//�޾Ƹ�

	public static void main(String[] args) throws IOException {
		int bt;
		while((bt= System.in.read())!=1)
		{//�ѱ� �������� ���� ���� io�� �Ѿ�� ��
			//���� �߸� JVM���� ����ó�� �ñ��~
			System.out.println((char)bt);

		}
	}

}
