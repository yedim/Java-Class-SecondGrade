package IOExam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


class School {
	int length;
	String[] name = new String[10];
	String[] address = new String[10];
	String[] phonenum = new String[15];
	int[] teachernum = new int[10];
	int[] studentnum=new int[10];

	public void writingData(){
		
			for (int j = 0; j < length; j++) {
				System.out.println(name[j] + "\t" + address[j] + "\t" + phonenum[j] + "\t" + teachernum[j] + "\t" +studentnum[j]);
			}
	}

	public void readingData(String fname) throws IOException {
		
		String csvStr = "";
		String tmpStr = "";
		
		BufferedReader br = new BufferedReader(new FileReader(fname));
		
		do {
			tmpStr = br.readLine();
			if (tmpStr != null) {
				csvStr += tmpStr + "\t";
			}
		} while (tmpStr != null);

		StringTokenizer parse = new StringTokenizer(csvStr, "\t");
		length = parse.countTokens() / 4;
		for (int i = 0; i < length; i++) {
			name[i] = parse.nextToken();
			address[i] = parse.nextToken();
			phonenum[i] = parse.nextToken();
			teachernum[i]=Integer.valueOf((parse.nextToken())).intValue();
			studentnum[i]=Integer.valueOf((parse.nextToken())).intValue();
			
		}
	}
}

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School s = new School();
		try {
			s.readingData("JavaClass_1/school.txt");
			s.writingData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
