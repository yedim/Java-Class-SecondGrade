package Adapter;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class V_18 extends JFrame {

	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();

	Font f=new Font("나눔고딕", Font.PLAIN, 18);

	JLabel lb_name =new JLabel("이  름:");
	JTextField tf_name =new JTextField(10);
	JButton jb_name =new JButton("검색");
	
	JLabel lb_birth=new JLabel("생  일:");
	JComboBox list_month = new JComboBox();	
	JLabel month=new JLabel("월");
	JComboBox list_day = new JComboBox();	
	JLabel day=new JLabel("일");
	
	JCheckBox solar=new JCheckBox("양력");
	JCheckBox lunar=new JCheckBox("음력");
	
	JLabel lb_phone=new JLabel("전화번호:");
	JTextField tf_phone =new JTextField(20);
	
	JLabel lb_group=new JLabel("그  룹:");
	JCheckBox school=new JCheckBox("학  교");
	JCheckBox academy=new JCheckBox("학  원");
	JCheckBox mytown=new JCheckBox("동  네");
	JCheckBox etc=new JCheckBox("기  타");
	
	JTextArea tx=new JTextArea(10,30);

	
	public V_18() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		setFont(f);
		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p3.setLayout(new FlowLayout());
		p4.setLayout(new FlowLayout());
		p5.setLayout(new FlowLayout());
		p6.setLayout(new FlowLayout());

		lb_name.setFont(f);
		tf_name.setFont(f);
		jb_name.setFont(f);
		lb_birth.setFont(f);
		month.setFont(f);
		day.setFont(f);
		solar.setFont(f);
		lunar.setFont(f);
		lb_phone.setFont(f);
		tf_phone.setFont(f);
		lb_group.setFont(f);
		school.setFont(f);
		academy.setFont(f);
		mytown.setFont(f);
		etc.setFont(f);
		tx.setFont(f);
		
		p1.add(lb_name);
		p1.add(tf_name);
		p1.add(jb_name);
		
		
		for(int i=1; i<13;i++)
		{
			list_month.addItem(String.valueOf(i));
		}	
		list_month.setEditable(true);
		
		for(int i=1; i<31;i++)
		{
			list_day.addItem(String.valueOf(i));
		}		
		list_day.setEditable(true);
		
			
		p2.add(lb_birth);
		p2.add(list_month);
		p2.add(month);
		p2.add(list_day);
		p2.add(day);
		p2.add(solar);
		p2.add(lunar);
		
		p3.add(lb_phone);
		p3.add(tf_phone);
		
		p4.add(lb_group);
		p4.add(school);
		p4.add(academy);
		p4.add(mytown);
		p4.add(etc);
		
		p5.add(tx);
		
		JButton btnsave = new JButton("저장");
		btnsave.setFont(f);
		btnsave.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				String s="";
				String group="";

		    	if(solar.isSelected()){s=solar.getText();}
		    	if(lunar.isSelected()){s=lunar.getText();}
		    	
		    	if(school.isSelected()){group+=" "+school.getText().replaceAll(" ","");}
		    	if(academy.isSelected()){group+=" "+academy.getText().replaceAll(" ","");}
		    	if(mytown.isSelected()){group+=" "+mytown.getText().replaceAll(" ","");}
		    	if(etc.isSelected()){group+=" "+etc.getText().replaceAll(" ","");}

		    	tx.setText("/"+lb_name.getText()+" "+tf_name.getText()+"/"+
		    lb_birth.getText()+" "+list_month.getSelectedItem().toString()+month.getText()+" "+list_day.getSelectedItem().toString()+day.getText()+" "+s+"/"+
		    lb_phone.getText()+" "+tf_phone.getText()+"/"+
		    lb_group.getText()+group
		    
		    );
		    	
		    }
		});

		p6.add(btnsave);
		JButton btndelete = new JButton("삭제");
		btndelete.setFont(f);
		p6.add(btndelete);
		JButton btnmodify = new JButton("수정");
		btnmodify.setFont(f);
		p6.add(btnmodify);

		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		
		setSize(600,520);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new V_18();
	}

}
