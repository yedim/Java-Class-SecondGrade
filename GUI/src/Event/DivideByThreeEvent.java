package Event;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class DivideByThreePanel extends JPanel{

	private JLabel prompt, result;
	private JTextField number;
	private JButton check;
	
	public DivideByThreePanel() {
		// TODO Auto-generated constructor stub
		prompt=new JLabel("정수값을 입력하세요");
		result = new JLabel("");
		
		number= new JTextField(12);
		check=new JButton("버튼");
		
		add(prompt);
		add(number);
		add(check);
		add(result);
		
		setPreferredSize(new Dimension(300,70));
		setBackground(Color.WHITE);
		
		NumberListener nl =new NumberListener();
		check.addActionListener(nl);
	}
	
	private class NumberListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			String text=number.getText();
			int num=Integer.parseInt(text);
			if(num%3==0)
			{
				number.setText("3의 정수");
			}else{
				number.setText("3의 정수 아님");
			}
		}
	}

}
public class DivideByThreeEvent
{
	public static void main(String[]args)
	{
		JFrame jframe= new JFrame("3의 배수 확인");
		DivideByThreePanel panel =new DivideByThreePanel();
		jframe.getContentPane().add(panel);
		jframe.pack();
		jframe.setVisible(true);
	}
}
