package pack01.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01_Connection {
//1.연결(statement가 이동이 가능한 연결로를 만듬):connection

	public static void main(String[] args) {// 빨간줄 -> try catch 해야함
		try {
			// oracle.jdbc.driver.OracleDriver;
			// java 버전이 낮은 경우 Class.forName이라는 메소드를 통해 동적 로딩 필요
			// try {
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			// } catch (ClassNotFoundException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			Scanner sc = new Scanner(System.in);
			System.out.println("아이디 입력(MEMBER) :");
			String id = sc.nextLine();
			System.out.println("비밀번호 입력(MEMBER) :");
			String pw = sc.nextLine();
			//현재상태 <-Sql Injection공격 당하기 딱 좋음 
			
			//String sql = "SELECT ID,PW FROM MEMBER WHERE ID= '" + id + "' and PW ='" + pw + "'";
String sql ="SELECT ID,PW FROM MEMBER WHERE ID= ? AND PW = ?";
			
			//select id, pw from member id ='admin' and pw =' 'or =' '
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hanul";
			String password = "0000";

			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = conn.prepareStatement("SELECT ID,PW FROM MEMBER WHERE ID ='admin'and pw ='admin1234'");
			ps.setString(1, id);//
			ps.setString(2, pw);//
			ResultSet rs = ps.executeQuery();// 오라클에서는 반드시 숫자는1부티!
			if (rs.next()) {// next가 안전함.
				System.out.println(rs.getString("ID"));
			}

			if (!conn.isClosed()) {
				System.out.println("핑 성공!");

			} else {
				System.out.println("실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
