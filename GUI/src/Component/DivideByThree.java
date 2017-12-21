package Component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DivideByThree extends JFrame{

	private JLabel prompt;
	private JTextField number;
	private JButton check;
	public DivideByThree() {
		// TODO Auto-generated constructor stub
		super("3의 배수 확인");
		Container cont = getContentPane();//this.getContentPane();
		cont.setLayout(new FlowLayout());
		prompt=new JLabel("정수값을 입력하세요");
		number=new JTextField(10);
		check=new JButton("검사");
		cont.add(prompt);
		cont.add(number);
		cont.add(check);
		setSize(300,150);
		setVisible(true);
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DivideByThree();
	}

}
