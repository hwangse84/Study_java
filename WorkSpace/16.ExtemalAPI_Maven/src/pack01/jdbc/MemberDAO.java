package pack01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	private Connection conn;

	public boolean isConnection() {
//url,user,password=> properties파일(접속정보가 파일로 저장되어있는것)stream으로 파일 읽어오기.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hanul";
		String password = "0000";
		try {
			conn = DriverManager.getConnection(url, user, password);// 초기화!
			if (!conn.isClosed()) {
				System.out.println("열림");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	public void memberDisplay(ArrayList<MemberDTO> list) {

		if (list == null || list.size() == 0) {
			System.out.println("조회된 데이터가 없습니다");
			return;

		}
		for (MemberDTO dto : list) {

			System.out.println("ID : " + dto.getId() + "PW : " + dto.getPw());
		}
	}

	public ArrayList<MemberDTO> selectMember() {// true인경우 실행!

		if (isConnection()) {

			ArrayList<MemberDTO> list = new ArrayList<>();

			try {
				PreparedStatement ps = conn.prepareStatement("SELECT*FROM MEMBER");

				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					MemberDTO dto = new MemberDTO(rs.getString("id"), rs.getString("pw"));
					list.add(dto);
					// System.out.println(rs.getString("id")+ " " + rs.getString("pw"));

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
		return null;// fdfad

	}

	public void insertMember(MemberDTO dto) {
		if (isConnection() == true) {
			try {
				PreparedStatement ps = conn.prepareStatement("INSERT INTO MEMBER VALUES(?,?)");
				ps.setString(1, dto.getId());
				ps.setString(2, dto.getPw());
				int result = ps.executeUpdate();
				System.out.println(conn.getAutoCommit());

				// conn.commit();//확정되지 않은 작업이 있는 테이블 조회시 연결실패가 뜸,LOCK상태됨!
				System.out.println(result);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public void updateMember(MemberDTO dto) {
		if (isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("UPDATE MEMBER SET PW=? WHERE ID =?");

				ps.setString(1, dto.getPw());
				ps.setString(2, dto.getId());
				int result = ps.executeUpdate();
				System.out.println(result);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void deleteMember(MemberDTO dto) {
		if (isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("DELETE FROM MEMBER WHERE ID = ? AND PW = ?");

				ps.setString(1, dto.getId());
				ps.setString(2, dto.getPw());
				int result = ps.executeUpdate();
				System.out.println(result);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				closeConnection();
			}
		}

	}

	public void closeConnection() {
		if(conn!= null) {
			try {
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
			
		}
	
	
	public boolean isId(String id) {
		if (isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement(" SELECT * FROM MEMBER WHERE ID = ? ");
				ps.setString(1, id);
				ResultSet rs = ps.executeQuery();
				return rs.next();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				closeConnection();
			}
		}
		return false;
	}

}
