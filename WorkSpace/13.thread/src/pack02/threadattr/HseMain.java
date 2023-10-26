package pack02.threadattr;

import java.util.Scanner;

public class HseMain {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int number = Integer.parseInt(scan.nextLine());
	scan.nextLine();

	HseThread thread = new HseThread(5);
	thread.start();
}
}
