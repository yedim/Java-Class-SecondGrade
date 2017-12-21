package Component;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddText extends JFrame{

	private JPanel panel;
	private JTextArea redtext;
	private JTextField bluetext;
	private JButton addButton;
	private JButton deleteButton;
	
	public AddText() {
		// TODO Auto-generated constructor stub
		super("텍스트 입력기");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		setContentPane(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		redtext = new JTextArea(18,43);
		redtext.setBorder(BorderFactory.createLineBorder(Color.RED));
		redtext.setEditable(false);//편집못하게
		panel.add(redtext);
		
		bluetext = new JTextField(40);
		bluetext.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		panel.add(bluetext);
		
		addButton = new JButton("추가한다");
		panel.add(addButton);
		addButton.addActionListener(new AddTextListener());
		
		
		deleteButton = new JButton("지운다");
		panel.add(deleteButton);
		deleteButton.addActionListener(new AddTextListener());
	
		setSize(500,500);
		setVisible(true);
	}
	
	private class AddTextListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==addButton)
			{
				String text=bluetext.getText();
				redtext.append(text);
				bluetext.setText("");
			}
			else if(e.getSource()==deleteButton)
			{
				redtext.setText("");
				bluetext.setText("");
			}	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AddText();
	}

}
