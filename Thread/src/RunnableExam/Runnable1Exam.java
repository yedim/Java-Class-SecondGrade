package RunnableExam;

class Top implements Runnable
{
	public void run()
	{
		for(int i=0; i<50;i++)
			System.out.print(i+"\t");
	}
}
public class Runnable1Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���α׷� ����");
		Top t=new Top();
		Thread thd=new Thread(t);
		thd.start();
		System.out.println("���α׷� ����");
	}

}
