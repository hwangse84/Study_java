package pack03;

public class D {
A pack1_A = new A();
//패키지는 클래스를 유일하게 구별하게 만드는 식별자
pack03.A pack3_A =new pack03.A();

public D publicD=new D();
D defaultD=new D(1);
private D privateD=new D("A");

public D() {
	System.out.println("public 생성자 : 파라메터 없음");
	
}
D(int param){
	System.out.println("default 생성자 : 파라메터 없음");
}
private D(String param) {
	System.out.println("public 생성자 : 파라메터 없음");
}
}
