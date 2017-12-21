package IOExam;
/*키보드 입력해서 파일로 출력. 'q'또는 'Q'를 입력받으면 종료(Wrapper클래스활용) . QuitTest.class. 
 BufferedReader,BufferedWriter, FileWriter활용*/
import java.io.*;
public class InExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try
		{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
			String a;//String a,b; 메모리 할당이 안된다. 이거 안돼
			String b;
			
			int sum;
			double avg;
			
				System.out.println("첫번째 숫자 입력 ");
				a=br.readLine();
				
				System.out.println("두번째 숫자 입력 ");
				b=br.readLine();
				
				sum=Integer.parseInt(a)+Integer.parseInt(b);
				avg=sum/2.0;
				System.out.println("합 : "+sum);
				System.out.println("평균 : "+avg);
			
		}
		catch(FileNotFoundException fe)
		{
			fe.printStackTrace();
		}
		catch(IOException ie)//상위를 아래쪽으로 넣어야 됩니다!!!!
		{
			ie.printStackTrace();
		}
	}

}
