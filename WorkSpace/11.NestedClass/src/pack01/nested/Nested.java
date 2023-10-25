package pack01.nested;

public class Nested {

	// 멤버 :클래스 안 중괄호 안 모든것! 변수, 메소드 등...
	// 멤버의 종류:
	// 1. 인스턴스 멤버 :클래스가 인스턴스화(객체) 과정을 거처야만 사용가능한것들!
	// 접근 방법 : 객체. (점 찍으면 다나옴)
	// 2. 스태틱 멤버 : 클래스에 접근만 하면 사용한것들.
	// 접근 방법 : 클래스.(점 찍으면 다 나옴)
	// 구분하는 방법 :

	// 스태틱 멤버 : 스태틱 클래스

	public void nesInner3() {
		class NesInner3 {
			String iField;// lv값 할당하기!

			public void iMethod() {
				System.out.println("메소드");
			}
		}
		NesInner3 nes3 = new NesInner3();
		nes3.iField = "lV";
		nes3.iMethod();
	}

////////////
	public static int field2;

	public static void method2() {
		Nested nas = new Nested();
		System.out.println("메소드2" + nas.field);
	}

	public int field;

	public void method() {
		System.out.println("메소드1" + field2);
	}
public class NesInner {
	
		public NesInner() {
		}

		// public static sField1;//?
		String iField;

		public void iMethod() {
			System.out.println("iMethod");
		}
	}

	public static class NesInner2 {
		static String sField2 = "ON";
		String iField;

		public void iMethod() {
			System.out.println("static");
		}
	}

}
