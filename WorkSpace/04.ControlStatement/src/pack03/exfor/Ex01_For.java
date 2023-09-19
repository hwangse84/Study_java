package pack03.exfor;

public class Ex01_For {
public static void main(String[] args) {
	//모든 제어문은 자신의 지역을 가지며(블럭킹)지역은 중첩이 가능하다.
	//제어문 - 반복문(어떤 변수와 변수를 이용한 조건을 주고 그 조건이 true일 동안 반복 재생)
	//for()1. 초기값(변수 초기화),<- 조건(true)일때 반복),4.변수 증감식){
		// 3. 반복 구간	
	//}
	//for(int i=0; i<10; i++){
		//반복 구간
	//}
	
	
	for (int i=2; i<11; i+=2) {//증감식 꼭 써야함.(무한 루프)
	System.out.println(i);
	}
	for (int i=1; i<11; i+=2) {//증감식 꼭 써야함.(무한 루프)
		System.out.println(i);
		}
	//디버깅 모드 <- :코드를 한줄씩 실행하면서 변수에 뭐가 담겼나보고, 어디로 진행되는지 눈으로 확인
	
	
	
	
	
	
}//main
}
