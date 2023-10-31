package pack01.exif;

public class Ex01_If {
private static char[] if_var1;

public static void main(String[] args) {
	
	//main메소드(함수, 기능)
	//javaProject에서 프로그램읠 시작점을 구분하기위한 메소드 =>main
	//블럭킹 : {}
	//어떤 문장이나 메소드, 클래스 등등의 구역(지역)을 의미
	//지역 블럭킹이 열리면 '{'메모리에 올라가고
	//지역 불럭킹 끝'}' 메모리에서 내림을 반복한다.=>자바 프로그램
	//클래스 지역을 제외하고 선언되거나 초기화되는 모든 변수는 우리가
	//지역 변수라고하며 해당 지역에서만 사용이 가능하다=>지역화폐
	//if(조건식){
		//if문 지역: 조건식이 true일떄만 해당 지역은 코드 실행이된다.
	//}
	//코드전체선택 : ctrl+a
	
	int score = 99;
	if (score>=90) {
		int if_var1 =100;
		
			System.out.println("장학금 받음" );
			if(score==100)	{	
				System.out.println("전교1등 + of_var1+if_var2");
		}
		 
		char[] if_var2 = null;
		System.out.println(if_var2);//if지역밖에서  사용불가
	}
	
	System.out.println(if_var1);//if지역밖에서  사용불가
}// main
}// class
