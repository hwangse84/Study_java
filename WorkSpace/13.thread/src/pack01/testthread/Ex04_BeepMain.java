package pack01.testthread;

public class Ex04_BeepMain {
	public static void main(String[] args) throws InterruptedException {
		Ex03_BeepTask e3 = new Ex03_BeepTask();
		// Runnable run =new Ex03_BeepTask();
		Thread thread = new Thread(e3);
		thread.start();// 휴식시간주겠다!

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			Thread.sleep(500);

		}
		System.out.println("요기코드");
	}
}
