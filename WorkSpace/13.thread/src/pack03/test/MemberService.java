package pack03.test;

import java.util.Scanner;

public class MemberService {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	
	MemberService memberService= new MemberService();
	
	String userId =scan.nextLine();
	String userPw =scan.nextLine();
	Integer.parseInt(userPw);
	
	
	while(true) {
	System.out.println("아이디와 비밀번호를 입력해 주세요");
	scan.nextLine();
	
	

	
	if(userId==hong && userPw==12345 ) {
		System.out.println("로그인 되었습니다.");
		
	} else {
		System.out.println("id 또는 password가 올바르지 않습니다.");
		return;
	}
	}
	

}
}
