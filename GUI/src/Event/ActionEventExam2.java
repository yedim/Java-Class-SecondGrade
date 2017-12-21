package Event;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ActionEventExam2  extends JFrame implements ItemListener, ActionListener{

	JPanel p1= new JPanel();
	JTextArea ta =new JTextArea(7,15);
	
	JCheckBox[] fruit = new JCheckBox[3];
	//checkbox���� getItem�� object�����ε� jcheckbox�� index���·� ����
	String[] fr_s={"Ű��","���","���"};
	JButton jb=new JButton("�ݱ�");
	
	public ActionEventExam2()
	{
		super("�׼��̺�Ʈ");
		for(int i=0; i<fruit.length;i++)
		{
			fruit[i]=new JCheckBox(fr_s[i]);
			p1.add(fruit[i]);
			fruit[i].addItemListener(this);
		}
		
		add(p1, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(jb,BorderLayout.SOUTH);
		
		jb.addActionListener(this);
		setSize(300,300);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getStateChange()==ItemEvent.SELECTED)
		{
			if(e.getItem()==fruit[0]){
				ta.append(fr_s[0]+"�� ���õ�\n\n");
			}else if(e.getItem()==fruit[1]){
				ta.append(fr_s[1]+"�� ���õ�\n\n");
			}else{
				ta.append(fr_s[2]+"�� ���õ�\n\n");
			}

		}
		if(e.getStateChange()==ItemEvent.DESELECTED)
		{
			if(e.getItem()==fruit[0]){
				ta.append(fr_s[0]+"�� ��ҵ�\n\n");
			}else if(e.getItem()==fruit[1]){
				ta.append(fr_s[1]+"�� ��ҵ�\n\n");
			}else{
				ta.append(fr_s[2]+"�� ��ҵ�\n\n");
			}		
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jb){
			System.exit(0);
		}
	}
	public static void main(String[] args)
	{
		new ActionEventExam2();
	}
	
}

