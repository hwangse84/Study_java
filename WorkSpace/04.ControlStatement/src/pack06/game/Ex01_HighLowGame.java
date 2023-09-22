package pack06.game;

import java.util.Random;
import java.util.Scanner;

public class Ex01_HighLowGame {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		
		System.out.println("하이로게임입니다.랜덤한 숫자를 맞춰주세요.");
		int start = 0;

		while (true) {
			System.out.println("숫자를 입력해주세요");
			String str = sc.nextLine();
			
			

			start = Integer.parseInt(str);
			if (start == 2) {
				System.out.println("game start");
				break;
			} else if (start == 3) {
				System.out.println("game over");
				break;
			}

		}
		
		int randomNumber = random.nextInt(100) + 1;
		System.out.println(randomNumber);
		while (start == 2) {
			
			
			int userNum = random.nextInt(100) + 1;
			if (randomNumber == userNum) {
				sc.nextLine();
				
				System.out.println("정답!축하");
				break;
			}if (randomNumber > userNum) {
				System.out.println("High");
				sc.nextLine();
			} else if (randomNumber < userNum) {
				System.out.println("Low");
}
			}}}