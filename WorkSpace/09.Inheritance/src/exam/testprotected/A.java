package exam.testprotected;

public class A {// 4개의 접근제한자
	public  int public_field1;
	int default_field2;
	private int private_field3;
	protected int protected_field4;
	
	protected A() {
		//생성을 막음.
		System.out.println(" 생성자 메소드를 public ->protected");
	}
}
