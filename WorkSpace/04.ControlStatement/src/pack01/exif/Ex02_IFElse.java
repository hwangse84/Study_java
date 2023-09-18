package pack01.exif;

public class Ex02_IFElse {
	public static void main(String[] args) {
		// if(조건식){
		// 조건식이 true일떄 실행코드(참)
		// }else{
		// 반드시 if문 블럭킹 끝에 붙으며 별도의조건없음
		// 조건식의 조건이 false일때 실행하는 코드를 넣어준다

		int score = 90;
		// 만약에 score변수 내부에 있는 갑이 90점 이상이면 점수가 90이상이며A등급 출력
		// 그외에는 90점 미만 A등급 아님
		//

		if (score >= 90) {
			System.out.println("점수가 90이상 A등급");
		} else {
			System.out.println("90점미만 A등급이 아님");
		}
	}// main
}// class
