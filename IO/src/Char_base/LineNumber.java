package Char_base;
import java.io.*;

public class LineNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt=1;
		
		try{
			FileReader fr= new FileReader(args[0]);//song.txtÀÐ¾î¿È
			BufferedReader br=new BufferedReader(fr);//¹öÆÛ
		
			String str;
			while((str= br.readLine())!=null)
			{
					str=cnt+str;
					System.out.println(str); cnt++;		
			}
			fr.close();
			
		}catch(FileNotFoundException fe)
		{
			fe.printStackTrace();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
			
		
	}

}
