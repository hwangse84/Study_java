package pack02.trycatch;

public class Ex02_TryCatchFinal {
public static void main(String[] args) {
	
	
	
	
	try {
		System.out.println("코드1");
		System.out.println("코드2");
	} catch (Exception e) {
		//try의 코드가 예외를 발생했을때 (오류)실행
		System.out.println("코드3");
	}finally {
		//무조건(반드시!!) 실행되어야하는 코드를 넣어줌
		System.out.println("코드4");
	}
}
}
