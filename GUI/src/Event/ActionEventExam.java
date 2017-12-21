package Event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventExam  extends Frame implements ActionListener{

	Button b= new Button("¹öÆ°");
	Panel p= new Panel();
	
	public ActionEventExam() {
		// TODO Auto-generated constructor stub
		super("ActionEvent");
		p.add(b);
		add(p);
		setSize(300,500);
		setVisible(true);
		
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			System.exit(0);
		}
	}
	public static void main(String[] args)
	{
		new ActionEventExam();
	}}

