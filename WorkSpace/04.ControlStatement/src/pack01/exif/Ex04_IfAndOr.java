package pack01.exif;

public class Ex04_IfAndOr {
	public static void main(String[] args) {
//	 조건식 : 반드시 true, false를 반환 받는 식.
//	boolean에 담을 수 있는 값.(==조건식)
		

		int number = 9;
		if (number % 2 == 0 && number % 3 == 0) {
			System.out.println("짝수, 3의배수");
		} else if (number % 2 == 0 && number % 3 != 0) {
			System.out.println("짝수,3의배수 X");
		} else if (number % 2 != 0 && number % 3 == 0) {
			System.out.println("홀수,3의배수");
		} else if (number % 2 != 0 && number % 3 != 0) {
			System.out.println("홀수, 3의배수X");
		}

	
	
	}
}
