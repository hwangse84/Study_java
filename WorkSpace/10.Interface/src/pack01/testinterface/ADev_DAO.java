package pack01.testinterface;

// class의 상속 : 클래스가 가진 멤버를 상속받기 위함(필두, 메소드 등):extends:단일상속
//interface의 상속 : 인터페이스가 가진 규칙이나 메소드 형태를 강제로 구현하게 함:implements:다중상속이 가능

public class ADev_DAO  implements TestInterface{

	public String rtnStr() {
		
		String str="";
	    return str;
	}
	
	public int rtnInt() {
	    int num=10;
		return 0;
		
	}
	@Override
	public void search() {

		
	}

	@Override
	public void insert() {
		
		
	}
	
}
