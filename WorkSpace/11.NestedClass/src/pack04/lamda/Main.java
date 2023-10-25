package pack04.lamda;

public class Main {
	public static void main(String[] args) {
		LamdaInter lamda =new LamdaInter() {
			//1. 파라메터부
			//2. ->
			//3.{}
			@Override
			public void method(Object o,Object o2) {
				System.out.println("람다 메소드"+o);
				
			}
		};
		lamda.method("","");
		//인터페이스의 구조를 정확히 모르는 사람은 해독힘듬.(가독성x, 
lamda=(o,o2)->{
	
	System.out.println("람다 메소드");
	};
	lamda.method("","");
	//자료구조.forEach(dto->코드부)
	//String[] arrs=new String[] {"1","2"};
	
}
}
