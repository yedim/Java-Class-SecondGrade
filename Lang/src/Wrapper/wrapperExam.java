package Wrapper;

public class wrapperExam {

	public static void main(String[] args) {
		
		String data1="10";
		String data2="20";
		
		//parseInt
		System.out.println("data1 + data2 ="+(Integer.parseInt(data1)+Integer.parseInt(data2)));
		
		//parsedouble
		System.out.println("data1 + data2 ="+(Double.parseDouble(data1)+Double.parseDouble(data2)));
				
		//intValue
		System.out.println(Integer.valueOf(data1).intValue());//!!
		//doubleValue
		System.out.println(Double.valueOf(data2).doubleValue());
	}

}
