package pace02_Member;

public class Member {
	int iField;
	static int sField;//static인지 void인지 확인!
	
	public void iMethod() {
		System.out.println("인스턴스 메소드");
	}
	
	public static void sMethod() {
		System.out.println("스태틱 메소드");
		
	}
}
