package IOExam;
/*Ű���� �Է��ؼ� ���Ϸ� ���. 'q'�Ǵ� 'Q'�� �Է¹����� ����(WrapperŬ����Ȱ��) . QuitTest.class. 
 BufferedReader,BufferedWriter, FileWriterȰ��*/
import java.io.*;
public class InExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try
		{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
			String a;//String a,b; �޸� �Ҵ��� �ȵȴ�. �̰� �ȵ�
			String b;
			
			int sum;
			double avg;
			
				System.out.println("ù��° ���� �Է� ");
				a=br.readLine();
				
				System.out.println("�ι�° ���� �Է� ");
				b=br.readLine();
				
				sum=Integer.parseInt(a)+Integer.parseInt(b);
				avg=sum/2.0;
				System.out.println("�� : "+sum);
				System.out.println("��� : "+avg);
			
		}
		catch(FileNotFoundException fe)
		{
			fe.printStackTrace();
		}
		catch(IOException ie)//������ �Ʒ������� �־�� �˴ϴ�!!!!
		{
			ie.printStackTrace();
		}
	}

}
