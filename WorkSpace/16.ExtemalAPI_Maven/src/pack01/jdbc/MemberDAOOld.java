package pack01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAOOld {

	private Connection conn;

	public boolean isConnection() {
//url,user,password=> properties파일(접속정보가 파일로 저장되어있는것)stream으로 파일 읽어오기.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user ="hanul";
		String password ="0000";
		try {
			conn = DriverManager.getConnection(url, user, password);//초기화!
			if(!conn.isClosed()) {
				System.out.println("열림");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	public void selectMember() {// true인경우 실행!

		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("SELECT*FROM MEMBER");
				
				ResultSet rs =ps.executeQuery();
				
				while(rs.next()) {
					System.out.println(rs.getString("id")+ " " + rs.getString("pw"));
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void insertMember(String id,String pw) {
		if(isConnection()==true) {
			try {
				PreparedStatement ps = conn.prepareStatement("INSERT INTO MEMBER VALUES(?,?)");
				ps.setString(1, id);
				ps.setString(2, pw);
				int result =ps.executeUpdate();
				System.out.println(conn.getAutoCommit());
			
			//conn.commit();//확정되지 않은 작업이 있는 테이블 조회시 연결실패가 뜸,LOCK상태됨!
				System.out.println(result);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public void updateMember(String id, String pw) {
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("UPDATE MEMBER SET PW=? WHERE ID =?");
				
				ps.setString(1, pw);
				ps.setString(2, id);
				int result = ps.executeUpdate();
				System.out.println(result);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
