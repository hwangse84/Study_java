package pack04.lamda;
//functionalInterface이다: 구현해야할 메소ㅡ(추상) 1개만 정의돈 인터페이스
//2개 이상은 람다식 표현불가능.!

//Listner라는 이름의 규칙을 많이 사용함
@FunctionalInterface
public interface LamdaInter {
	void method(Object o,Object o2);
	
    //함수형, 객체지향(oop)
	// 함수 vs Method
	//근본적으로는 동일-> 함수는 일반용어 vs메소드는 객체지향개념 용어
	//함수는 클래스로부터 독립적(일회성)vs 메소드는 종속적
	//코틀린(javaBase)언어 vs java(Lamda표현식)
}
