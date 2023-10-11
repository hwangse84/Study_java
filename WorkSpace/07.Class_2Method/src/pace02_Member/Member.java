package pace02_Member;

public class Member {
	int iField;
	static int sField;//static인지 void인지 확인!
	
		//메소드 이름이 중복되면 코드오류
		//메소드 오버로딩:같은 이름의 메소드를 파라메터 타입 
		//또는 개수를 달리하여 중복시켜서 사용하는 방식
	public void iMethod() {
		System.out.println("인스턴스 메소드");
	}
	public void iMethod(int parm) {
		System.out.println(" 파라메터 1개");
	}
	
	public void iMethod(String parm) {
		System.out.println(" 파라메터 1개");
	}
	public void iMethod(String parm, int parm2) {
		System.out.println(" 파라메터 2개");
	}
	
	
	
	
	
	
	
	public static void sMethod() {
		System.out.println("스태틱 메소드");
		
	}
}
