package ThreadExam;


class Top extends Thread {
	public void run() {
		for (int i = 0; i < 50; i++)
		{
			if(i%10==0)
				System.out.println();
			
			System.out.print(i + "\t");
		}
	}
}

public class Thread1Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���α׷� ����");
		Top d=new Top();
		d.start();
		System.out.println("���α׷� ����");
	}

}
//���� : ���� ������ ���������� ������ Ȯ���� �� �ִ�.
