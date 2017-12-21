package database;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class V_18_2 extends JFrame implements ActionListener {

	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();

	Font f=new Font("�������", Font.PLAIN, 18);

	JLabel lb_name =new JLabel("��  ��:");
	JTextField tf_name =new JTextField(10);
	JButton jb_name =new JButton("�˻�");
	
	JLabel lb_birth=new JLabel("��  ��:");
	JComboBox list_month = new JComboBox();	
	JLabel month=new JLabel("��");
	JComboBox list_day = new JComboBox();	
	JLabel day=new JLabel("��");
	
	JCheckBox solar=new JCheckBox("���");
	JCheckBox lunar=new JCheckBox("����");
	
	JLabel lb_phone=new JLabel("��ȭ��ȣ:");
	JTextField tf_phone =new JTextField(20);
	
	JLabel lb_group=new JLabel("��  ��:");
	JCheckBox school=new JCheckBox("��  ��");
	JCheckBox academy=new JCheckBox("��  ��");
	JCheckBox mytown=new JCheckBox("��  ��");
	JCheckBox etc=new JCheckBox("��  Ÿ");
	
	JTextArea tx=new JTextArea(10,30);

	JButton btnsave = new JButton("����");
	JButton btndelete = new JButton("����");
	JButton btnmodify = new JButton("����");
	JButton btnreset = new JButton("�ʱ�ȭ");

	public V_18_2() {
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
		btnsave.setFont(f);
		
		p6.add(btnsave);
		btndelete.setFont(f);
		p6.add(btndelete);
		btnmodify.setFont(f);
		p6.add(btnmodify);

		btnreset.setFont(f);
		p6.add(btnreset);
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		
		jb_name.addActionListener(this);
		btnsave.addActionListener(this);
		btndelete.addActionListener(this);
		btnmodify.addActionListener(this);
		btnreset.addActionListener(this);
		
		setSize(600,520);
		setVisible(true);

	}

	    public void actionPerformed(ActionEvent e) {
			String str_name=tf_name.getText();
			String str_month=list_month.getSelectedItem().toString();
			String str_day=list_day.getSelectedItem().toString();
			String str_cb="";
			String str_phone=tf_phone.getText();
			String str_school="0";
			String str_academy="0";
			String str_mytown="0";
			String str_etc="0";

			if(solar.isSelected()){str_cb=solar.getText();}
	    	if(lunar.isSelected()){str_cb=lunar.getText();}
	    	
	    	if(school.isSelected()){str_school+="1";}
	    	else{str_school+="0";}

	    	if(academy.isSelected()){str_academy+="1";}
	    	else{str_academy+="0";}

	    	if(mytown.isSelected()){str_mytown+="1";}
	    	else{str_mytown+="0";}

	    	if(etc.isSelected()){str_etc+="1";}
	    	else{str_etc+="0";}
	    
	    	//JDBC ����̹� ������ ã�� �ν��Ͻ� ����
			try{
				Class.forName("org.gjt.mm.mysql.Driver");
			}catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
			
			Connection conn=null;
			String url="jdbc:mysql://127.0.0.1:3307/test5?useSSL=false";//5.5�̻�?���� ssl�������־����.
			String id="root";
			String pw="mirim0316";
			
			try{
				conn=DriverManager.getConnection(url,id,pw);
			}catch(SQLException ee){
				System.err.println("DB���� ����");
			}
			
			Statement stmt=null;
			try{
				stmt=conn.createStatement();
			}
			catch(SQLException ex){
				System.err.println("�۾� ó�� ��ü ���� ����");
			}
			
			ResultSet rs=null;
			
			if(e.getSource()==jb_name)
			{
				try{
					rs=stmt.executeQuery("select * from t1 where name='"+str_name+"'");
					
					if(rs.next()){

						list_month.setSelectedItem(rs.getString("month"));
						list_day.setSelectedItem(rs.getString("day"));
						
						if(rs.getString("birth_option").equals("���")){
							solar.setSelected(true);
						}else if(rs.getString("birth_option").equals("����")){
							lunar.setSelected(true);
						}
						
						tf_phone.setText(rs.getString("phone"));
						if(rs.getString("group1").equals("1")){
							school.setSelected(true);
						}
						if(rs.getString("group2").equals("1")){
							academy.setSelected(true);
						}
						if(rs.getString("group3").equals("1")){
							mytown.setSelected(true);
						}
						if(rs.getString("group4").equals("1")){
							etc.setSelected(true);
						}
						tx.setText("�˻��Ϸ�\n");
						
					}
					
				}catch(SQLException ee){
					System.err.println("�˻�  ��ɾ� ���� ����"+ee.toString());
				}
			}
			else if(e.getSource()==btnsave)
			{
				try{

				int num=stmt.executeUpdate("insert into t1 values('"+str_name+"'"
						+","+str_month+","+str_day+",'"+str_cb+"','"+str_phone+"',"
						+str_school+","+str_academy+","+str_mytown+","+str_etc+")");
				System.out.println(num+"�� ���� ����");
				
				reset();
				tx.setText("����Ϸ�\n");

				}catch(SQLException ee){
					System.err.println("���� ��ɾ� ���� ����"+ee.toString());
				}
				
				
			}
			else if(e.getSource()==btnmodify)
			{
				try {
					int num=stmt.executeUpdate("update t1 set name='"+str_name+"'"
						+", month="+str_month+", day="+str_day+",birth_option='"+str_cb+"', phone='"+str_phone+
						"', group1="+str_school+",group2="+str_academy+",group3="+str_mytown+",group4="+str_etc+" where name='"+str_name+"'");
				
					tx.setText("�����Ϸ�\n");		
					reset();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if(e.getSource()==btndelete)
			{
				try {
					int num=stmt.executeUpdate("delete from t1 where name='"+str_name+"'");
					System.out.println(num+"���� ���� ����");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if(e.getSource()==btnreset)
			{
				reset();
			}
	}
	
	public void reset()
	{
		tf_name.setText("");
		list_month.setSelectedItem("");
		list_day.setSelectedItem("");
		
		solar.setSelected(false);
		lunar.setSelected(false);
		
		tf_phone.setText("");
		school.setSelected(false);
		academy.setSelected(false);				
		mytown.setSelected(false);
		etc.setSelected(false);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new V_18_2();
	}

}
