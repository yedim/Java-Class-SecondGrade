package Component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxButtonOnly extends JFrame {

	private JCheckBox cb_bold, cb_italic;
	private JButton btn_ok, btn_cancel;
	public CheckBoxButtonOnly() {
		// TODO Auto-generated constructor stub
		super("간단한 화면");
		setSize(200,100);
		Container cont = getContentPane();//this.getContentPane();
		cont.setLayout(new FlowLayout());
		
		cb_bold=new JCheckBox("고딕체");
		cb_italic=new JCheckBox("이탈릭체");
		btn_ok=new JButton("확인");
		btn_cancel=new JButton("취소");
		cont.add(cb_bold);
		cont.add(cb_italic);
		cont.add(btn_ok);
		cont.add(btn_cancel);
		
		setSize(150,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxButtonOnly();
	}

}
