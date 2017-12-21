package Event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventExam2 extends Frame implements ItemListener,ActionListener{

	Panel p1= new Panel();
	TextArea ta =new TextArea(7,15);
	Checkbox cb1= new Checkbox("Ű��",false);
	Checkbox cb2= new Checkbox("���",false);
	Checkbox cb3= new Checkbox("����",false);
	
	Button b1=new Button("�ݱ�");
	public ItemEventExam2() {
		// TODO Auto-generated constructor stub
		super("ItemEvent");
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p1.add(b1);
		
		add(p1,BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		add(b1,BorderLayout.SOUTH);
		setSize(300,300);
		setVisible(true);
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		b1.addActionListener(this);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ItemEventExam2();
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		// TODO Auto-generated method stub
		if(ie.getStateChange()==ItemEvent.SELECTED){
			ta.append(ie.getItem()+"�� ���õ�\n\n");
		}
		else if(ie.getStateChange()==ItemEvent.DESELECTED){
			ta.append(ie.getItem()+"�� ��ҵ�\n\n");
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1){
			System.exit(0);
		}
	}

}
