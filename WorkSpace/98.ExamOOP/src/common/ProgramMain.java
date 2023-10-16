package common;

import member.MemberDAO;
import product.ProductDAO;

public class ProgramMain {
	//common : 공통적으로 사용클래스(메소드, 변수)
	//프로그램 메인 --> 멤버 --> 상품
public static void main(String[] args) {
	System.out.println("1. 사용자모드 2. 관리자모드  3.종료");
	Common common = new Common();//스캐너 시작,초기화
	MemberDAO dao = new MemberDAO(common);
	common.items= new ProductDAO(common).initItems();// 일회성!
	
	dao.startUserLogin();
	
	common.endProgram();//스캐너 종료
}//
}
