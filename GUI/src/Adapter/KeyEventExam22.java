package Adapter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyEventExam22 extends JFrame{

	JTextField jumin1=new JTextField(10);
	JLabel lb =new JLabel("-",JLabel.CENTER);
	JTextField jumin2=new JTextField(10);
	JPanel p=new JPanel();
	public KeyEventExam22() {
		// TODO Auto-generated constructor stub
		super("KeyEvent");
		p.add(jumin1);
		p.add(lb);
		p.add(jumin2);
		add(p);
		setSize(300,100);
		setVisible(true);
		jumin1.addKeyListener(new KeyClass(jumin1, jumin2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventExam22();
	}

}

class KeyClass extends KeyAdapter{
	
	JTextField jumin1=new JTextField(10);
	JTextField jumin2=new JTextField(10);

	public KeyClass(JTextField jumin1,JTextField jumin2){
		this.jumin1=jumin1;
		this.jumin2=jumin2;
	}
	public void keyReleased(KeyEvent ke)
	{
		if(jumin1.getText().trim().length()==6){
			jumin2.requestFocus();
		}
	}
	
	public void keyPressed(KeyEvent ke)
	{
		if(ke.getKeyCode()==ke.VK_LEFT){
			jumin2.setText("Left´­¸²");
		}
	}
}
