package Component;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JTextFieldExam extends JFrame{

	public JTextFieldExam() {
		// TODO Auto-generated constructor stub
		super("�ؽ�Ʈ �ʵ�");
		JPanel p =new JPanel();	
		JLabel l1=new JLabel("�ֹε�Ϲ�ȣ");
		JTextField tf1= new JTextField("�ֹε�Ϲ�ȣ���ڸ�");
		JPasswordField tf2= new JPasswordField(15);
		
		tf1.selectAll();
		tf2.setEchoChar('*');
		p.add(l1);
		p.add(tf1);
		p.add(tf2);
		add(p);
		setSize(400,100);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextFieldExam();
	}

}
