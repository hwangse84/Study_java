package exam.testextends;
// extends라는 키워드가 없는 상태에서는 각각의 이름을 가진 별개의 클래스이다
//Child_Class가 extends키워드 통해 부모클래스 선택-->부모자식 관계형성
//extends클래스명 
public class Child_Class extends Prent_Class{
	String child_field ="자식클래스 인스턴스멤버";
	public void childMethod() {
		
		System.out.println("자식 클래스 메소드");
	}
}
