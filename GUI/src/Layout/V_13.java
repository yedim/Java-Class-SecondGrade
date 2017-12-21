package Layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.FlowLayout;

public class V_13 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V_13 frame = new V_13();
					frame.setVisible(true);
					frame.setSize(500,400);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public V_13() {
		super("친구정보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JLabel name=new JLabel("이름");
		panel1.add(name);
		
		contentPane.add(panel1, BorderLayout.NORTH);
		
		textField = new JTextField();
		panel1.add(textField);
		textField.setColumns(10);
		JButton search=new JButton("검색");
		panel1.add(search);
		
		JPanel panel3 = new JPanel();
		contentPane.add(panel3, BorderLayout.SOUTH);
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnsave = new JButton("저장");
		panel3.add(btnsave);
		
		JButton btndelete = new JButton("삭제");
		panel3.add(btndelete);
		
		JButton btnmodify = new JButton("수정");
		panel3.add(btnmodify);
		
		JPanel panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		panel2.add(scrollPane);
		
		JTextArea textArea = new JTextArea(13,40);
		scrollPane.setViewportView(textArea);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		
	}

}
