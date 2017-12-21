package Component;

import javax.swing.*;

public class JRadioCheckboxExam extends JFrame {

	public JRadioCheckboxExam()
	{
		super("라디오버튼형");
		JPanel p= new JPanel();
		ButtonGroup bg  = new ButtonGroup();
		JRadioButton ra1= new JRadioButton("여자");
		JRadioButton ra2= new JRadioButton("남자");
		JRadioButton ra3= new JRadioButton("어린이");

		bg.add(ra1);
		bg.add(ra2);
		bg.add(ra3);

		p.add(ra1);
		p.add(ra2);
		p.add(ra3);

		add(p);
		setSize(400,100);
		setVisible(true);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JRadioCheckboxExam();
	}

}
