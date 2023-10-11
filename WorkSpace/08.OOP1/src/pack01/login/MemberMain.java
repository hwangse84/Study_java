package pack01.login;

import java.util.Scanner;

public class MemberMain {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);// IO
	MemberDTO dto= new MemberDTO();
	
	dto.id = scan.nextLine();
	dto.pw = scan.nextLine();
	//
	
	MemberDAO dao= new MemberDAO ();
	if(dao.login(dto)==1) {
		System.out.println("화면이동");
	}else {
		System.out.println("다시입력");
	}
	scan.close();
	//아이디가 admin이고 비밀번호가 admin 1234와 일치한다면"로그인
	//되었습니다"
	//그 외  -> "아이디 또는 비밀번호를 확인해주세요"
	
	
	
	
	
}
}
