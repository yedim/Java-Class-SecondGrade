package IOExam;
import java.io.*;

/*PrintWriter를 통해 pwdata.txt파일에 "안녕하세요. PrintWriter입니다."라고 적어보세요.
힌트: PrintWriter를 사용한 다음에는 꼭 close()해 주어야 합니다.*/

public class PrintWriter_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw= null;
		try {
			pw=new PrintWriter("src/io/pwdata.txt");
			
			String s=null;
			s="안녕하세요.PrintWriter입니다.\n";
			pw.println(s);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			pw.close();
		}

	}

}
