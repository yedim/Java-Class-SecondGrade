package Char_base;
/*Ű���� �Է��ؼ� ���Ϸ� ���. 'q'�Ǵ� 'Q'�� �Է¹����� ����(WrapperŬ����Ȱ��) . QuitTest.class. 
 BufferedReader,BufferedWriter, FileWriterȰ��*/
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

				if(readData.equalsIgnoreCase("q")) break;//==�� �ȵǳ�.(readData.toUpperCase()).matches("Q")
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
		catch(IOException ie)//������ �Ʒ������� �־�� �˴ϴ�!!!!
		{
			ie.printStackTrace();
		}
	}

}
