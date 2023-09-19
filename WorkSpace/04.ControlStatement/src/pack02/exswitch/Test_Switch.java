package pack02.exswitch;

public class Test_Switch {
	public static void main(String[] args) {
		// 스위치문을 값을 가지고만 어떤 조건 분기가 가능 "break" 넣어줘야만 끊김

		int score = 90;

	switch (score / 10) {
		case 10:
			System.out.println("A");
			break;

		case 9:
			System.out.println("A");
			break;

		case 8:
			System.out.println("B");
			break;

		case 7:
			System.out.println("C");
			break;

		case 6:
			System.out.println("D");
			break;

		default:
			System.out.println("E");
			break;

		}
	}

}
