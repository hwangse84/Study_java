package pack01.Car;

public class CarMain {
	public static void main(String[] args) {
		// Car의 인스턴스멤버 ->Car가 인스턴스화 ->객체->객체. 사용이 가능하다.
		Car car = new Car();
		for (int i = 0; i < 10; i++) {
			car.hseMethod();// 만들어진 메소드를 호출함 -> 메소드의 중괄호 클럭킹 시작과 끝
			
			//메소드의 파라멭ㅓ
			// 정의+호출 : 변수 초기화식
			car.hseMethod1("황승은");
			car.hseMethod1("전지현");
			car.hseMethod2("승은", "휴식");
			car.hsemethod3("현대차",0);
			car.hsemethod4(5);
			
			int result =car.rtnmethod1();
			System.out.println(result+1);
			
			
			System.out.println(car.rtnMethod2(50));
			
		}
	}
}










