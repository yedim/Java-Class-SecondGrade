package Adapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindoweventExam2 extends Frame{

	public WindoweventExam2() {
		// TODO Auto-generated constructor stub
		super("종료버튼을 눌러주세요.");
		setSize(300,100);
		setVisible(true);
		addWindowListener(new MyClass());
	}

	public static void main(String[] args) {

		new WindoweventExam2();
	}

}

class MyClass extends WindowAdapter
{
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}