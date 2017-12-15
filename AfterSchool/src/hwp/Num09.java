package hwp;
//StringBuffer객체에 sb1에 java programming을 넣고, sb2에 project를 넣은 후, sb1에 "project"문자열을 추가하여 str1에 넣고, 
//sb1에 sb2를 추가하여 str2에 대입한 후 출력

public class Num09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1= new StringBuffer("java programming");//StringBuffer는 문자열이 수정됨
		StringBuffer sb2 =new StringBuffer("project");
		
		StringBuffer str1 = sb1.append("project");
		StringBuffer str2 = sb1.append(sb2);
		
		System.out.println(str1);
		System.out.println(str2);
	}

}
