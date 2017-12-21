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

		//JDBC 드라이버 파일을 찾아 인스턴스 생성
		try{
			Class.forName("org.gjt.mm.mysql.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		Connection conn=null;
		String url="jdbc:mysql://127.0.0.1:3307/test5?useSSL=false";//5.5이상?부터 ssl연결해주어야함.
		String id="root";
		String pw="mirim0316";
		
		try{
			conn=DriverManager.getConnection(url,id,pw);
		}catch(SQLException ee){
			System.err.println("DB연결 실패");
		}
		
		Statement stmt=null;
		try{
			stmt=conn.createStatement();
		}
		catch(SQLException e){
			System.err.println("작업 처리 객체 생성 실패");
		}
		
		ResultSet rs=null;
		
		try{
			rs=stmt.executeQuery("select * from t1");
			while(rs.next()){
				System.out.println(rs.getString("name")+" "+rs.getString("month")+" "
				+rs.getString("month")+" "+rs.getString("day")+" "+rs.getString("birth_option")+" "
				+rs.getString("phone")+" "+rs.getString("group1")+" "+rs.getString("group2")+" "
				+rs.getString("group3")+" "+rs.getString("group4"));//getStriin(필드명)은 해당 필드의 값을 출력.
			}
		}catch(SQLException e){
			System.err.println("명령어 전송 실패");
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
