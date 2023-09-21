package pack06.game;

import java.util.Random;
import java.util.Scanner;

public class Ex01_HighLowGame {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		
		
		int randomNumber = random.nextInt(100) + 1;
		System.out.println(randomNumber);
		System.out.println("하이로게임입니다.랜덤한 숫자를 맞춰주세요.");
		while (true) {
			System.out.println("숫자를 입력해주세요");
			String str = sc.nextLine();
			
			int userNum = Integer.parseInt(str);
			if (randomNumber == userNum) {
				System.out.println("정답!축하");
				break;
			} else if (randomNumber > userNum) {
				System.out.println("High");

			} else if (randomNumber < userNum) {
				System.out.println("Low");
			}
		}

	}
}
