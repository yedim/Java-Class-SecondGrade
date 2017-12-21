package Component;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JLabelExam extends JFrame{
	public JLabelExam()
	{
		super("Label");
		JPanel p = new JPanel();
		JLabel label1= new JLabel("���̺�1");
		JLabel label2= new JLabel("���̺�2",JLabel.CENTER);
		
		label1.setOpaque(true);
		label2.setOpaque(true);

		label1.setForeground(Color.black);
		label1.setBackground(Color.yellow);// JLabel������ ���� �ȵ�.
		label2.setBackground(Color.blue);
		
		p.add(label1);
		p.add(label2);
		add(p);
		setSize(300,100);
		setVisible(true);
		
		
	}
	public static void main(String[] args)
	{
		new JLabelExam();
	}

}
