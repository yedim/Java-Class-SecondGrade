package RunnableExam;

class Top_R2 implements Runnable {
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.print(i + "\t");
		}
	}
}

public class Runnable2Exam {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		//1. Runnable�� �����ϴ� ��ü �����
		Top_R2 tr= new Top_R2();
		//2. Runnable�� ������ �� ��¥ ������ �����
		Thread thd1=new Thread(tr);
		Thread thd2=new Thread(tr);
		thd1.start();
		thd2.start();
		System.out.println("���α׷� ����");
	}

}
