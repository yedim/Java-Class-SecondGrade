package Layout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExam extends JFrame{

	public FlowLayoutExam() {
		// TODO Auto-generated constructor stub
		super("FlowLayout");
		Container cont=getContentPane();
		cont.setLayout(new FlowLayout());
		cont.add(new JButton("��ư1"));
		cont.add(new JButton("��ư2"));
		cont.add(new JButton("��ư3"));
		pack();
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutExam();
	}

}
