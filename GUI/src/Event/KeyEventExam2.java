package Event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyEventExam2 extends JFrame implements KeyListener{

	JTextField jumin1=new JTextField(10);
	JLabel lb =new JLabel("-",JLabel.CENTER);
	JTextField jumin2=new JTextField(10);
	JPanel p=new JPanel();
	public KeyEventExam2() {
		// TODO Auto-generated constructor stub
		super("KeyEvent");
		p.add(jumin1);
		p.add(lb);
		p.add(jumin2);
		add(p);
		setSize(300,100);
		setVisible(true);
		jumin1.addKeyListener(this);
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventExam2();
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
