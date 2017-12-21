package Component;

import java.awt.Panel;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxExam extends JFrame{

	public JComboBoxExam() {
		// TODO Auto-generated constructor stub
		super("ÄÞº¸¹Ú½º");
		String[] pets={"°³","°í¾çÀÌ","»ç¸¶±Í","¾Þ¹«»õ",};
		Panel p =new Panel();
		JComboBox cb= new JComboBox(pets);
		p.add(cb);
		add(p);
		setSize(300,400);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComboBoxExam();
	}

}
