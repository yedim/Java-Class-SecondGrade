package ExceptionExam;
//FileNotFoundException�� IOException

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExam {

	public static void main(String[] args)  {/*throws Exception*///command�޸� ����ó�����ѰŰ� �Է��ѰŸ� ����ó���ѰŰ� 
		//throws�� �ڱ⸦ ȣ���� ���� ����ó���� �ѱ�.main���� ȣ�������� JVM���� �Ѱ��ش�. �̰Թٷ� JVM�� ó���� ����پƾ�.
		// TODO Auto-generated method stub
		
		try {
			FileReader fr = new FileReader("datar.txt");
			FileWriter fw = new FileWriter("dataw.txt");

			int c;
			while((c=fr.read())!=-1)
			{
				fw.write(c);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
