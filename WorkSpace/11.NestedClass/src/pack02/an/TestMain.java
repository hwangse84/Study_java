package pack02.an;

public class TestMain {
	TestClass tc=new TestClass(){

	int testField=30;void testMethod(){
	// super.testMethod();
	System.out.println("익명의 지역에서 재정의");

	}};

	// tc.testField =3;
	// tc.testMethod();

	// 인터페이스도 인스턴스화가 가능함.
	// 인터페이스의 규칙상 메소드는 반드시 구현되어 있어야함
	TestInterface []tiArr=new TestInterface() {
		int num=10;
		
		@Override
		public void method() {
			
			System.out.println("인터페이스 인스턴스화!"+num);
		}
		};
	TestInterface ti=new TestInterface(){

	};
	}// ti.method();
}
