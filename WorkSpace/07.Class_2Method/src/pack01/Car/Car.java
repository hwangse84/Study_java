package pack01.Car;

public class Car {
	// 클래스의 중괄호 사이에 있는 모든걱?멤버
	// 그 중, 변수클래스 등으로 선언되어있는것?필드, 속성, 인스턴스 변수, iv
	// 기능을 담담 ->메소드(method):ex) main메소드->자바 프로그램의 시작기능을 담당

	// 메소드의 선언(정의)--->
	// 접근제한자 : public >protected>default>private:'지금은 public 만 사용!'
	// 리턴 타입 :void냐 void가 아니냐로 달라짐
	// 1.접근 제한자 2. 리턴타입 3. 메소드명 4. (매개변수,파라메터) 5. {
	// }

	// class 타입외->소문자 시작, 카멜
	public void hseMethod() {
		System.out.println("void형태는 return타입 없음.??");
		System.out.println("현재 메소드는 클래스으이 블럭킹 내부에 있음");
		System.out.println("hseMethod는 클래스의 멤버, 인스턴스 멤버");
	}

	// x,y -->x+y
	// 파라메터, 매개변수(메소드 동작시 필요한 값이 있다면 뭐든 받아올수있음)
	// 변수 선언(받아오기위한 그릇)
	public void hseMethod1(String name) {
		System.out.println(name + "(이)가 학습 중");// 이름 바뀔시 계속 결과 바뀔수있게함

	}

	public void hseMethod2(String name, String state) { // , state
		System.out.println(name + "()가" + state + "중");
	}

	public void hsemethod3(String carname, int price) {
		System.out.println(carname + " " + price + "원");
	}

	public void hsemethod4(int count) {
		for (int i = 0; i <= count; i++) {
			System.out.print("출력");
		}
	}
	//뭐지 내가 필요한것 리턴할수있다.
	//void가 아닌 경우에는 주어진 리턴타입을 반드시 "반환해줄것"->return
	public int rtnmethod1() {
//		int result = 1;
//		return result;
		System.out.println("rtnMethod");
		return 1;
	}
	public int rtnMethod2(int number) {
		System.out.println("rtnMethod2");
		return number;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
