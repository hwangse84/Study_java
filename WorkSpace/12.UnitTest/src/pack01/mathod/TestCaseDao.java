package pack01.mathod;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestCaseDao {
//@Test 를 하겠다(어노테이션)
	//Junit에서 메소드 이름을 원하는 문자열로 치환해서 보여줌(가독성)
	//timeOut :응답시간,메소드를 호출하고 결과를 받기까지의 시간(웹 디비에 접속 후 데이터를 받아오기까기 위한 시간)
	//잘못된 부분만 확인하기 때문에 디버깅 속도가 빨라짐
	//메소드에 불필요한 변수들이 많이 파람ㅔ터로 지정되어싸다면 테스트 자체가 불편함->코드 리펙토링
	//다음 사람이 내클래스 메소드 등을 이용할 때 그부분만 확인하고 자신의 문제점도 빠르게 파악가능.
	//통합테스트 : 모든 개발자의 코드를 병학하여 배포 "전" 테스트 서버 또는 운영서버에서 테스트함.
	
	//Given, Should, When, Then의 규칙으로 작성
	//Given :테스트에 사용된 자원을 준비하는 가정.
	//should : 조건이나 비교에 가기 전 과정이 필요(생략가능)
	 //when:실행(ㅂㅣ교)
	//Then: 검증(원하는 결과값을 얻었는지 ,오류인지)
	@DisplayName("DAO의 Sum메소드")
	@Test
	void testSum() {
		//Given
		DAO dao=new DAO();
		
		//Should
		//if(dao!=null)
		
		//when
		int result =dao.sum(0, 0);
		//Then : 검증오류
		assertEquals(11, result);
		assertNotEquals(12, result);
	}

}
