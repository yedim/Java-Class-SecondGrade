package Component;

import java.awt.Color;
import java.awt.List;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Test1 extends JFrame{

	public Test1() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 681);
		JPanel p = new JPanel();
		 p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane( p);
		 p.setLayout(null);
		
		JLabel label1 = new JLabel("id");
		label1.setBounds(17, 15, 78, 21);
		 p.add(label1);
		
		JLabel label2 = new JLabel("password");
		label2.setBounds(17, 51, 78, 21);
		 p.add(label2);
		
		label1.setOpaque(true);
		label2.setOpaque(true);

		label1.setForeground(Color.black);
		label1.setBackground(Color.blue);// JLabel에서는 배경색 안됨.
		label2.setBackground(Color.blue);
		
		
		JTextField textField = new JTextField();
		textField.setBounds(124, 12, 156, 27);
		p.add(textField);
		textField.setColumns(10);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(124, 48, 156, 27);
		p.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel Qlabel1 = new JLabel("1. 당신의 관심 분야는?(여러개 선택 가능) ");
		Qlabel1.setBounds(27, 96, 500, 21);
		p.add(Qlabel1);
		
		JCheckBox CheckBox1 = new JCheckBox("news");
		CheckBox1.setBounds(27, 130, 70, 29);
		p.add(CheckBox1);
		
		JCheckBox CheckBox2 = new JCheckBox("sports");
		CheckBox2.setBounds(120, 130, 100, 29);
		p.add(CheckBox2);
		
		JCheckBox CheckBox3 = new JCheckBox("movies");
		CheckBox3.setBounds(226, 130, 100, 29);
		p.add(CheckBox3);
		
		JCheckBox CheckBox4 = new JCheckBox("music");
		CheckBox4.setBounds(120, 160, 100, 29);
		p.add(CheckBox4);
		
		JLabel Qlabel2 = new JLabel("2.얼마나 자주극장에 가십니까?");
		Qlabel2.setBounds(27, 208, 500, 21);
		p.add(Qlabel2);
		
		ButtonGroup bg  = new ButtonGroup();

		JRadioButton radioButton1 = new JRadioButton("한달에 한번");
		radioButton1.setBounds(25, 230, 272, 41);
		
		JRadioButton radioButton2 = new JRadioButton("일주일에 한번");
		radioButton2.setBounds(25, 260, 272, 41);
		
		JRadioButton radioButton3 = new JRadioButton("거의 안간다");
		radioButton3.setBounds(25, 290, 272, 41);
		
		bg.add(radioButton1);
		bg.add(radioButton2);
		bg.add(radioButton3);
		
		p.add(radioButton1);
		p.add(radioButton2);
		p.add(radioButton3);
		
		JLabel Qlabel3 = new JLabel("3.좋아하는 계절은?");
		Qlabel3.setBounds(27, 350, 500, 21);
		p.add(Qlabel3);
		
		
		String []listStr={"봄","여름","가을","겨울"};
		JList list = new JList(listStr);
		list.setBounds(43, 380, 1, 1);
		p.add(list);
		
		JLabel Qlabel4 = new JLabel("4.하고싶은 말을 남기세요.");
		Qlabel4.setBounds(27, 500, 500, 21);
		p.add(Qlabel4);
		
		JTextArea textArea = new JTextArea("입력 : ");
		textArea.setBounds(109, 550, 112, 86);
		p.add(textArea);
				
		setVisible(true);
		setSize(400,800);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test1();
	}

}
