package pack01.testinterface;
//class ->interface
public interface TestInterface {
//인터페이스에서 구현하는 모든것들은 추상 메소드, 상수
//여러 개발자가 같은 인터페이스를 상속받고	각자의 DAO를 만들고 병합하면 오류없이 코드 호출이 가능함.(String MVC)
	String SERVER_IP ="192.168.0.40";//final상수 : 초기값 설정후 변경이 불가능한것을 의미!전체 대문자로!
	                    //CMD->ipconfig
	void search();
	void insert();
}
