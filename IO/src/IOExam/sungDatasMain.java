package IOExam;
import java.io.*;
import java.util.*;

class sungDatasExam{

	public void readingData(String fname)throws IOException
	{
		try{//���� �����͸� ���� �� ���� �߻��� �� ó��
			FileReader fr=new FileReader(new File(fname));//writed.txt������ �д� FileReader��ü����
			BufferedReader br= new BufferedReader(fr);
			String csvStr="";
			String tmpStr ="";
			
			do//�ݺ��� �Ἥ �ٴ����� �о��
			{
				tmpStr=br.readLine();
				if(tmpStr != null)
				{
					csvStr +=tmpStr +"\t";//csvStr�� 4��¥���� ���Ͱ� �ƴ� \t�� �����ؼ� ���ٷ� ��������.
				}
			}while(tmpStr!=null);
			
			StringTokenizer parse = new StringTokenizer(csvStr,"\t");
			int length=parse.countTokens()/4;//16���� 4��??
			
			String []name = new String[length];
			String []address = new String[length];
			double []math= new double[length];
			double []english=new double[length];
			double []total =new double[length];
			double []avg=new double[length];
			
			for(int i=0; i<length;i++)
			{
				name[i]=parse.nextToken();
				address[i]=parse.nextToken();
				math[i]=Double.valueOf(parse.nextToken());
				english[i]=Double.valueOf(parse.nextToken());
				total[i]=math[i]+english[i];
				avg[i]=total[i]/2.0;
			}
			
			for(int j=0; j<length;j++)
				System.out.println(name[j]+"\t"+address[j]+"\t"+math[j]+"\t"+english[j]+"\t"+total[j]+"\t"+avg[j]);
			
		}catch(FileNotFoundException e){
			System.out.println("�߸��� ���� �̸��� �Է��߽��ϴ�.");
		}
	}

}

public class sungDatasMain
{
	public static void main(String[] args) {
		
		sungDatasExam wd = new sungDatasExam();
		try{
			wd.readingData("writed.txt");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
