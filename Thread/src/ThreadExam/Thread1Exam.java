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
		System.out.println("프로그램 시작");
		Top d=new Top();
		d.start();
		System.out.println("프로그램 종료");
	}

}
//설명 : 실행 순서가 순차적이지 않음을 확인할 수 있다.
