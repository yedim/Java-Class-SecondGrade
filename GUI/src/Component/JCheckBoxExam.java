package Component;

import javax.swing.*;

public class JCheckBoxExam extends JFrame {

	
	public JCheckBoxExam()
	{
		super("üũ�ڽ���");
		JPanel p= new JPanel();
		JCheckBox ck1= new JCheckBox("���");
		JCheckBox ck2= new JCheckBox("����", true);
		JCheckBox ck3= new JCheckBox("���");
		
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		add(p);
		setSize(400,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new JCheckBoxExam();
	}

}
