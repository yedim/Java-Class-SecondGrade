package Component;

import java.awt.Panel;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextAreaExam extends JFrame{

	public JTextAreaExam() {
		// TODO Auto-generated constructor stub
		super("JTextArea");
		JPanel p= new JPanel();
		JTextArea ta1= new JTextArea("first",3,30);//스크롤 없는 게 default
		JTextArea ta2= new JTextArea("second",6,10);
		JScrollPane sp=new JScrollPane(ta2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		p.add(ta1);
		p.add(ta2);
		add(p);
		setSize(500,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextAreaExam();
	}

}
