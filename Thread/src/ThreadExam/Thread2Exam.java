package ThreadExam;

class DerivedThread extends Thread{
	public void run()
	{
		for(int i=0; i<50;i++)
		{
			System.out.print(i+"\t");
		}
	}
}
public class Thread2Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���α׷� ����");
		DerivedThread d1= new DerivedThread();
		DerivedThread d2= new DerivedThread();
		
		d1.start();
		d2.start();
		System.out.println("���α׷� ����");
	}

}
