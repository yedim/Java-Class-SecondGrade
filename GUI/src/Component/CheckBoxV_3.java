package Component;

import javax.swing.*;

public class CheckBoxV_3 extends JFrame{

	public CheckBoxV_3()
	{
		JPanel p = new JPanel();
		JCheckBox jb1=new JCheckBox("��");
		JCheckBox jb2=new JCheckBox("����");
		JCheckBox jb3=new JCheckBox("����");
		JCheckBox jb4=new JCheckBox("�ܿ�",true);
		p.add(jb1);
		p.add(jb2);
		p.add(jb3);
		p.add(jb4);
		add(p);
		setSize(400,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new CheckBoxV_3();
	}

}
