package Layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExam extends JFrame{

	public BorderLayoutExam() {
		// TODO Auto-generated constructor stub
		super("BorderLayout");
		JButton b1=new JButton("��");
		JButton b2=new JButton("�Ʒ�");
		JButton b3=new JButton("����");
		JButton b4=new JButton("���");
		JButton b5=new JButton("������");
		
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.WEST);
		add(b4,BorderLayout.CENTER);
		add(b5,BorderLayout.EAST);
		
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutExam();
	}

}
