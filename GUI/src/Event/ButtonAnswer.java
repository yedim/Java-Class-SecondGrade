package Event;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonAnswer extends JFrame implements ActionListener{

	JButton yes, no;
	JLabel choice;
	JPanel jp;
	public ButtonAnswer() {
		super("��ư ����");
		setLayout(new BorderLayout());
		yes=new JButton("yes");
		no=new JButton("no");
		choice=new JLabel("����� ������ : ");
		
		jp.add(yes);
		jp.add(no);
		
		setSize(300,100);
		setVisible(true);
		
		add(jp,BorderLayout.NORTH);
		add(choice,BorderLayout.SOUTH);
		
		yes.addActionListener(this); //�ڱ��ڽ��� ActionListener�����ϰ��־
		no.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonAnswer();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()=="yes")
		{
			choice.setText(e.getActionCommand());//��ɾ�Ǵ� String������.
		}
		else if(e.getSource()=="no")
		{
			choice.setText(e.getActionCommand());

		}
		
	}

}
