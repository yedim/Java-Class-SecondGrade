package Component;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class TextFieldExam extends Frame{

	public TextFieldExam() {
		// TODO Auto-generated constructor stub
		super("�ؽ�Ʈ �ʵ�");
		Panel p =new Panel();	
		TextField tf1= new TextField("�ֹε�Ϲ�ȣ���ڸ�");
		TextField tf2= new TextField(15);
		
		tf1.selectAll();
		tf2.setEchoChar('*');
		p.add(tf1);
		p.add(tf2);
		add(p);
		setSize(400,100);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldExam();
	}

}
