package pack03.test;

import java.util.Scanner;

public class HorseGameMain {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine());
		sc.nextLine();

		HorseGame thread = new HorseGame();
		thread.start();
	}

}
