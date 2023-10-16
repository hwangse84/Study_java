package member;

import common.Common;
import product.ProductDAO;

public class MemberDAO {
	Common common;
	ProductDAO dao;

	public MemberDAO(Common common) {
		this.common = common;

	}

// 메소드() : 파라메터부 : 데이터를 받아오기 위한 변수 선언만 가능
	public void login(String id, String pw) {
		MemberDTO[] memDtos = getLoginDatas();
		for (MemberDTO dto : memDtos) {
			if (id.equals(dto.getId()) && pw.equals(dto.getPw())) {
				System.out.println("성공");
				common.loginInfo = dto;
				break;
			}
		}
	}

//테스트 데이터부분(DB가 아직 없거나 연결 직전 테스트
	public MemberDTO[] getLoginDatas() {
		MemberDTO[] memDtos = new MemberDTO[2];
		memDtos[0] = new MemberDTO("user", "user1", "김유저", "김닉네임");
		memDtos[1] = new MemberDTO("admin", "admin1", "김관리", "김관리", true);

		return memDtos;
	}

	public void inputMoney() {
		System.out.println("금액입력");
		common.loginInfo.setMoney(common.loginInfo.getMoney() + common.getIntScanner(100));
		// while 처리가 Scanner 안에 포함되어있다.
	}

	public void displayMoney() {
		System.out.println(common.loginInfo.getMoney() + "원");
	}

	public void startUserMode() {
		if (common.loginInfo == null)

			return;
		dao = new ProductDAO(common);
		while (true) {
			System.out.println("1.금액입력 2.상품구매, 3.잔돈확인 4.종료(로그아웃)");
			int choiceMenu = common.getIntSanner();
			if (choiceMenu == 1) {
				inputMoney();
			} else if (choiceMenu == 2) {
				dao.buyItem();
			} else if (choiceMenu == 3) {
				displayMoney();
			} else if (choiceMenu == 4) {
				break;
			} else {
				System.out.println("잘못입력");
			}

		}
	}

	public void startAdminMode() {// 관리자모드
		if (common.loginInfo == null || common.loginInfo.isAdmin() == false) {
			System.out.println("관리자 계정만 접근이 가능!!!");
			return;

		}
		dao = new ProductDAO(common);
		while (true) {
			System.out.println("1.상품추가 2.준비중(수정) 3.준비중(삭제) 4.종료(로그아웃)");
			int choiceMenu = common.getIntSanner();
			if (choiceMenu == 1) {
				dao.addItem();
			} else if (choiceMenu == 2) {
				dao.buyItem();
			} else if (choiceMenu == 3) {
				displayMoney();
			} else if (choiceMenu == 4) {
				break;
			} else {
				System.out.println("잘못입력");

			}
		}
	}

	public void startUserLogin() {

		while (true) {
			// 상품초기화 여기에 하면 안된다. 사용자관리자모드 선택전에 넣어둔다
			System.out.println("1. 사용자모드 2. 관리자모드  3.종료");
			System.out.println("메뉴선택");
			int choiceMenu = common.getIntSanner();
			if (choiceMenu == 1) {
				login(common.getStrScanner("아이디입력"), common.getStrScanner("패스워드입력"));
				startUserMode();

			} else if (choiceMenu == 2) {
				login(common.getStrScanner("아이디입력"), common.getStrScanner("패스워드입력"));

				startAdminMode();

			} else if (choiceMenu == 3) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("다시 선택");
			}

		}

	}
}
