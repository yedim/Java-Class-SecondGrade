package RunnableExam;


class Top2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<30;i++)
		{
			System.out.print((Thread.currentThread()).getName()+i+"\t");
		}
	}
}
public class Runnable3Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���α׷� ����");
		Top2 t= new Top2();//
		Thread thd1= new Thread(t,"a");
		Thread thd2=new Thread(t,"b");
		System.out.println(thd1.getPriority());
		System.out.println(thd2.getPriority());
		thd1.start();
		thd2.start();
		System.out.println("���α׷� ����");
	}

}
