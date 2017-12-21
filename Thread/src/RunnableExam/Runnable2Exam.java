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
		System.out.println("프로그램 시작");
		//1. Runnable을 구현하는 객체 만들기
		Top_R2 tr= new Top_R2();
		//2. Runnable을 장착한 후 진짜 스레드 만들기
		Thread thd1=new Thread(tr);
		Thread thd2=new Thread(tr);
		thd1.start();
		thd2.start();
		System.out.println("프로그램 종료");
	}

}
