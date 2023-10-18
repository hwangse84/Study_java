package exam.changetp3;

public class Main {
	public static void main(String[] args) {

		Child child = new Child();
		Parent parent = new Parent();
       // 객체를 생성할 때 사용된 인스턴스 : instanceof사용된 인스턴스를 비교하여 강제형 변환 가능여부확인
		//비교할 객체 instanceof 비교할 클래스
		if(child instanceof Parent) {
			System.out.println("TRUE");
			// parent =child;
		}else {
			System.out.println("FALSE");;
		}
		
		if(parent instanceof Child) {
			System.out.println("TRUE");
	   }else {
			System.out.println("FALSE");
		}
		parent = child;
		parent.method1();
		parent.method2();
		System.out.println("부모 클래스 = 자식 글래스 가능()0");
		child = (Child) parent;
		child.method1();
		child.method2();
		child.method3();
	}
}
