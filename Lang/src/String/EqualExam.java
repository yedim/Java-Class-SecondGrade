package String;

public class EqualExam {
	public static void main(String[] args) {
		String str1="sunrin";
		String str2="sunrin";
		String str3=new String("highschool");
		String str4=new String("highschool");

		if(str1==str2)System.out.println("�ּ� ����");
		else System.out.println("�ּ� �ٸ���");
		if(str3==str4)System.out.println("�ּ� ����");
		else System.out.println("�ּ� �ٸ���");
		if(str1.equals(str2))System.out.println("�ּ� ����");
		else System.out.println("�ּ� �ٸ���");
		if(str3.equals(str4))System.out.println("�ּ� ����");
		else System.out.println("�ּ� �ٸ���");
	}
}
