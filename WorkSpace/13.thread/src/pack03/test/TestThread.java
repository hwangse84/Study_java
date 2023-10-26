package pack03.test;

import java.util.Scanner;

public class TestThread extends Thread {
	private int number;

	public TestThread(int number) {
		this.number = number;

	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		int off = 0;
		int on=1;
		
		while(true) {
			
			if (on == 1) {
				System.out.println("영화다운로드 START!!");

				break;
			} else {
				System.out.println("다시 눌러주세요");
				break;
			}

		}

	while(true)

	{
		System.out.println("영화 다운로드중입니다.");

		for (int i = 0; i <= 100; i++) {
			System.out.println(i + "% 다운로드중");
            
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();

				
			}
		}
		System.out.println("작업중단, 음악 다운로드중!");

		if (off == 1) {
			System.out.println("프로그램 종료");
		}
	}
}}
