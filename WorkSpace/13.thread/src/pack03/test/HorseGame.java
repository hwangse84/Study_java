package pack03.test;

import java.util.Random;

public class HorseGame extends Thread {

	@Override
	public void run() {

		Random random = new Random();

		int numberA = random.nextInt(3) + 1;
		int numberB = random.nextInt(3) + 1;
		int numberC = random.nextInt(3) + 1;
		int start = 1;
		while (true) {

			if (start == 1) {
				System.out.println("경마게임 START!!");

				break;
			} else {
				System.out.println("다시 눌러주세요");
				break;
			}
		}
		while (start == 1) {
			System.out.println("게임이 시작되었습니다.");

			for (int i = 0; i <= 100; i++) {
				//if (numberA || numberB || numberC == 100) {

					return;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				break;
			}
		}

	}
}