package Component;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;

public class ChoiceExam extends Frame {

	public ChoiceExam() {
		// TODO Auto-generated constructor stub
		super("Choice �׽�Ʈ");
		Panel p= new Panel();
		Choice ch= new Choice();
		
		ch.addItem("��");
		ch.addItem("����");
		ch.addItem("����");
		ch.addItem("�ܿ�");

		p.add(ch);
		add(p);
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChoiceExam();

	}

}
