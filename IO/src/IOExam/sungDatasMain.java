package IOExam;
import java.io.*;
import java.util.*;

class sungDatasExam{

	public void readingData(String fname)throws IOException
	{
		try{//파일 데이터를 읽을 때 에러 발생할 때 처리
			FileReader fr=new FileReader(new File(fname));//writed.txt파일을 읽는 FileReader객체생성
			BufferedReader br= new BufferedReader(fr);
			String csvStr="";
			String tmpStr ="";
			
			do//반복문 써서 줄단위로 읽어옴
			{
				tmpStr=br.readLine();
				if(tmpStr != null)
				{
					csvStr +=tmpStr +"\t";//csvStr에 4줄짜리를 엔터가 아닌 \t로 구분해서 한줄로 만들어버림.
				}
			}while(tmpStr!=null);
			
			StringTokenizer parse = new StringTokenizer(csvStr,"\t");
			int length=parse.countTokens()/4;//16개면 4줄??
			
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
			System.out.println("잘못된 파일 이름을 입력했습니다.");
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
