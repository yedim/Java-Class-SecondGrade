package String;

public class ValueOfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
		String strData1="A";
		String strData2=String.valueOf(ch);
		String strData3= strData1.valueOf(ch);
		if(strData1.equals(strData3)){
			System.out.println("같음");
		}
		else{
			System.out.println("다름");
		}
		
		
	}
}
