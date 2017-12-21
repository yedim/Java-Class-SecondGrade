package ThreadExam;

class Summing
{
	private int sum;
	
	public synchronized void sumTo(int num) throws InterruptedException
	{
		sum=0;
		for(int i=1; i<=num;i++)
		{
			sum+=i;
			System.out.print("������ : "+Thread.currentThread().getName());
			System.out.println("�� 1~"+i+"���� ���� "+sum);
			Thread.sleep(500);
		}
	}
	public int getSum(){return sum;}
}
public class MultiThreadExam extends Thread{

	private Summing sum;
	private int num;
	public MultiThreadExam(String s, Summing sum, int num)
	{
		super(s);
		this.sum=sum;
		this.num=num;
		System.out.println("������ : "+getName()+"�� ����");
	}
	public void run()
	{
		try {
			sum.sumTo(num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("������ : "+getName()+"�� ����");
	}
	public static void main(String[] args) {

		Summing sum=new Summing();
		MultiThreadExam a= new MultiThreadExam("A",sum,5);
		MultiThreadExam b= new MultiThreadExam("B",sum,5);
		a.start();
		b.start();
	}

}
