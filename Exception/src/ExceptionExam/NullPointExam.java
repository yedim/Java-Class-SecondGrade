package ExceptionExam;

public class NullPointExam {
	public static void main(String[] args)  {

		try{
			String str=null;
			System.out.println("���ڿ�  : "+str.length());
		}catch(NullPointerException e){
			System.out.println("e.toString() : "+e.toString());
		}
		
	}
}
