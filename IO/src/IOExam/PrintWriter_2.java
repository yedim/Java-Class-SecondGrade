package IOExam;
import java.io.*;

/*PrintWriter�� ���� pwdata.txt���Ͽ� "�ȳ��ϼ���. PrintWriter�Դϴ�."��� �������.
��Ʈ: PrintWriter�� ����� �������� �� close()�� �־�� �մϴ�.*/

public class PrintWriter_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw= null;
		try {
			pw=new PrintWriter("src/io/pwdata.txt");
			
			String s=null;
			s="�ȳ��ϼ���.PrintWriter�Դϴ�.\n";
			pw.println(s);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			pw.close();
		}

	}

}
