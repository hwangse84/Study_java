package exam.testextends2;
//자식 클래스가 부모클래스 선택하면 SuperClass(부모클래스)예정
public class SuperClass {
//Super
	public SuperClass() {
		System.out.println("부모클래스 생성자");
	}
	public int sum(int x, int y) {
	return x+y;	
	}
	public int minus(int x, int y) {
		return x-y;	
	}
}
