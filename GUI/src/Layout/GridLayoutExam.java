package Layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExam extends JFrame{

	public GridLayoutExam() {
		// TODO Auto-generated constructor stub
		super("GridLayout");
		setLayout(new GridLayout(2,3));
		
		add(new JButton("��ư1"));
		add(new JButton("��ư2"));
		add(new JButton("��ư3"));
		add(new JButton("��ư4"));
		add(new JButton("��ư5"));
		add(new JButton("��ư6"));
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutExam();
	}

}
