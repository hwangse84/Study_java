package pack04.exwhile;

public class Ex01_While {
	public static void main(String[] args) {
		// while문을 이용해 1-10까지 합을 구하는프로그램 작성
		int i = 0;
		int sum = 0;
		i = 0;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}//
}