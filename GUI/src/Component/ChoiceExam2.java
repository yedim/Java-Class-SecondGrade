package Component;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class ChoiceExam2 extends Frame {

	public ChoiceExam2() {
		// TODO Auto-generated constructor stub
		super("Choice �׽�Ʈ");
		Panel p= new Panel();
		Choice chmonth= new Choice();
		Choice chday= new Choice();

		Label lbmonth=new Label("��");
		Label lbday=new Label("��");
		for(int i=1;i<=12;i++)
		{
			chmonth.addItem(Integer.toString(i));
		}
		p.add(chmonth); p.add(lbmonth);
		for(int i=1;i<=31;i++)
		{
			chday.addItem(Integer.toString(i));
		}
		
		p.add(chday); p.add(lbday);
		
		add(p);
		pack();//component����� �°�
		//setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChoiceExam2();

	}

}
