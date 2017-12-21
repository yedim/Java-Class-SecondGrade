package Wrapper;

import java.util.StringTokenizer;

public class dataValueExam {

	public static void main(String[] args) {
		String line;
		String tmpStr ="hong ¿ë»ê±¸ 10.5 20.5";
		StringTokenizer parse=new StringTokenizer(tmpStr);
		String name=parse.nextToken();
		String address=parse.nextToken();
		double math=Double.valueOf(parse.nextToken());
		double english=Double.valueOf(parse.nextToken());;
		double total=math+english;
		double avg=total/2.0;

		System.out.println(name +"\t"+address +"\t"+math +"\t"+english +"\t"+total +"\t"+avg);
	}

}
