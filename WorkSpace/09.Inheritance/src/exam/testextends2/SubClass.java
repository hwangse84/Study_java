package exam.testextends2;
//상속받기 : eatends
//sum메소드,minus메소드 상속받음,(기존기능)+ (SubClass기능)
public class SubClass extends SuperClass {
	//@override : 부모클래스의 기능을 자식 클래스가 물려받아 "형태를 유지"하고 기능을 바꿈,추가!
	//--->> 재정의라고한다.
	//@ :어노테이션: 기계가(java) 인식을 하는 주석
	
	
	public SubClass() {
		System.out.println("자식클래스 생성자");
	}
	
	@Override
	public int sum(int x, int y) {//부모클래스가 가진 메소드를 호출
		
		return super.sum(x, y)+1;//+1을 해주어 기능 바꿈
	}
	
	public int mul(int x, int y) {
		return x*y;
	}
	public int div(int x, int y) {
		return x/y;
	}
}
