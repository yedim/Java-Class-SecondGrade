package hwp;
//StringBuffer 객체 sb1에 java programming을 생성한 후 java를 JAVA로 치환한 후 sb2에 할당한 후 출력하시오.

public class Num10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		StringBuffer sb1=new StringBuffer("java programming");
		sb1.replace(0,3,"JAVA");
		System.out.println(sb1);
	}

}
