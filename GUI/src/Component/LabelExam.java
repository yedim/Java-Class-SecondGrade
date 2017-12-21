package Component;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class LabelExam extends Frame{
	public LabelExam()
	{
		super("Label");
		Panel p = new Panel();
		Label label1= new Label("���̺�1");
		Label label2= new Label("���̺�2");
		
		label1.setBackground(Color.yellow);
		label2.setBackground(Color.blue);
		
		p.add(label1);
		p.add(label2);
		add(p);
		setSize(300,100);
		setVisible(true);
		
		
	}
	public static void main(String[] args)
	{
		new LabelExam();
	}

}
