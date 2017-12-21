package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SelectExam {

	public SelectExam() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		//JDBC ����̹� ������ ã�� �ν��Ͻ� ����
		try{
			Class.forName("org.gjt.mm.mysql.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
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
		catch(SQLException e){
			System.err.println("�۾� ó�� ��ü ���� ����");
		}
		
		ResultSet rs=null;
		
		try{
			rs=stmt.executeQuery("select * from t1");
			while(rs.next()){
				System.out.println(rs.getString("name")+" "+rs.getString("month")+" "
				+rs.getString("month")+" "+rs.getString("day")+" "+rs.getString("birth_option")+" "
				+rs.getString("phone")+" "+rs.getString("group1")+" "+rs.getString("group2")+" "
				+rs.getString("group3")+" "+rs.getString("group4"));//getStriin(�ʵ��)�� �ش� �ʵ��� ���� ���.
			}
		}catch(SQLException e){
			System.err.println("��ɾ� ���� ����");
		}
		
		try{
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException e){
			e.getStackTrace();
		}
	}

}
