package pack01.Car;




public class Calculater {
//Calculater클래스는 계산기 기능을 가진 클래스!
	// 기능 4가지 구현해보기
	  // 기능1) .plus <-두수를 입력받아 두 수의 헙을 바로 출력하는 메소드(반환x)

	public void plus(int number1, int number2) {
		System.out.println(number1 + number2);
		// return number1 + number2;
	}
	  // 기능2) minus <-두수를 입력받아 두 수의 뺴기를 바로 출력하는 메소드(반환x)

	public void minus(int number1,int number2) {
		System.out.println(number1 - number2);
		//return number1 - number2;
	}

        //  3.mul   <- 두수의 곱하기를 메소드 호출부로 반화해주는 메소드 ->출력은 계산기 메인에서 함
	public int mul(int num1, int num2) {
//			int result = num1*num2;
//			return result;
			return (int)num1*num2;
		}

            //  4. div   <- 두수의 나누기를 메소드 호출부로 반화해주는 메소드 ->출력은 계산기 메인에서 함
	public double div(int num1, int num2) {
		return  (double)num1/(double)num2;
	
	}

}
