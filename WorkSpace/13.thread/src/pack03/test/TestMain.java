package pack03.test;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number = Integer.parseInt(scan.nextLine());

		
		TestThread thread = new TestThread(0);
		thread.start();
	}
}
