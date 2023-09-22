package pack06.game;

import java.util.Random;
import java.util.Scanner;

public class ex {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("주사위게임!나를 이겨봐!");

		int on = 0;
		
		while (true) {

			System.out.println("이 프로그램은 무한반복하는 프로그램입니다");
			String str = sc.nextLine();
			
			on = Integer.parseInt(str);

			if (on == 1) {
				System.out.println("Game Start");

				break;
			} else if(on==-1) {
				System.out.println("Game over");
				break;
			}
		}

		while (on == 1) {

			System.out.println("게임 시작합니다");
			System.out.println("컴퓨터가 주사위를 굴립니다");
			sc.nextLine();// et
			
			int comNumber = random.nextInt(6) + 1;
			System.out.println(comNumber);
			System.out.println("내가 주사위를 굴립니다");
			sc.nextLine();// et
			int myNumber = random.nextInt(6) + 1;
			System.out.println(myNumber);
		
			if (comNumber > myNumber) {
				System.out.println("You Lose!!!");
			} else if (comNumber < myNumber) {
				System.out.println("You Win!!!");
			} else if (comNumber == myNumber) {
				System.out.println("주사위 나온 숫자가 같습니다.다시도전!");

			}
		}
	}
}