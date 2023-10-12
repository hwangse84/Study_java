package pack_test;

import java.util.Scanner;

public class ProductUserDAO {
	// 개인정보 수정(이름, 주소, 연락처, 이메일, 비밀번호) 포인트 충전
	// 상품 정렬(가격순, 역순, 상품명 순, 역순, 가격순, 역순, 가격 범위, 베스트)
	Scanner sc = new Scanner(System.in);

	public ProductUserDTO userIndex() {
		ProductUserDTO dto = new ProductUserDTO("user", "user1");
		return dto;

public void login(ProductUserDTO ) {
	  		
	  		if(dto.id.equals("user") && dto.pw.equals("user1")) {
	  			System.out.println("로그인되었습니다.");
	  			//return 1;
	  			
	  		}else {
	  			System.out.println("아이디 또는 비밀번호를 확인");
	  			
	  		}
	  		//return 0;
		//if(id.contains(" ")) {
			//System.out.println("아이디를 다시입력해주세요");
		}
	}
}
