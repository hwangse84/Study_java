package pack01.variable;

public class Ex01_Variable {
	public static void main(String[] args) {
		//변수는 값을 저장하기위한것
		//변수의타입 변수이름 ; <=변수의 선언: 이타입의 변수를 해당 이름으로 사용할것을 미리 알려줌
		//변수에 값 할당 : 변수명 = 변수타입에 맞는 값;
		int 변수;
		변수 =10;
		System.out.println(변수);
		
		//변수 x, y, z를 각각 선언.
		// 변수 x에는 5,y에는 10, z에는 15를 각각 값 할당하고 출력
		int x;
		x = 5;
				System.out.println(x);
		int y;
		y = 10;
				System.out.println(y);
						
	   int z;
	   z = 15;
				System.out.println(z);
	//1.블러킹 내부에서는 같은 이름의 변수는 선언이 불가능하다
	//int x;오류 : 이미 코드의 윗줄에서 선언이 되어있음(사용하겠다고 명시됨)
	// 2. 변수 이름 규칙 : 첫번째 글자는 소문자로 시작하고 의미있는 단어들을 연결해서 사용
	//단어들의 연결은 대문자로 구분
	//3. 자바 예약어는 사용할수 없다.(보라색으로 나오는것들 int, Class,Void)
				
	}
}
