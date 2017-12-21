package Char_base;
/*키보드 입력해서 파일로 출력. 'q'또는 'Q'를 입력받으면 종료(Wrapper클래스활용) . QuitTest.class. 
 BufferedReader,BufferedWriter, FileWriter활용*/
import java.io.*;
public class QuitText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try
		{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new FileWriter("QuitTest.txt"));

			String readData;
			while((readData=br.readLine())!=null)
			{

				if(readData.equalsIgnoreCase("q")) break;//==은 안되네.(readData.toUpperCase()).matches("Q")
				System.out.println(readData);
			
				bw.write(readData);
				bw.newLine();
			}
			
			br.close();
			bw.close();
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
