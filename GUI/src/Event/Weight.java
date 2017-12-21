package Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//1pound = 0.45359237kg
public class Weight extends JFrame implements ActionListener,KeyListener{

	JTextField tf=new JTextField(10);
	JLabel lb=new JLabel("몸무게를 입력하세요");
	JButton b=new JButton("파운드로 변환");
	JPanel p=new JPanel();
	double kg;

	public Weight() {
		// TODO Auto-generated constructor stub
		super("몸무게 변환기");

		lb=new JLabel("몸무게를 입력하세요");
		
		p.add(lb);
		p.add(tf);
		p.add(b);
		
		add(p);
		setSize(300,150);
		setVisible(true);
		b.addActionListener(this);
		tf.addKeyListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Weight();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			WeightTrans.Trans(kg, tf);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b){
			WeightTrans.Trans(kg, tf);
		}
	}

}

class WeightTrans{
	
	public static void Trans(double kg, JTextField tf){
		kg=Double.parseDouble(tf.getText());
		kg*=2.20462;
		tf.setText(Double.toString(kg));
	}
}
