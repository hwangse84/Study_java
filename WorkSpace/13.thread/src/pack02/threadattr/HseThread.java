package pack02.threadattr;

public class HseThread extends Thread {
	
	private int number; 
	
	public HseThread(int number) {
		this.number = number;
	}
	@Override
	public void run() {
		
		for (int i = 2; i < 10; i++) {
			
			for (int j = 1; j < 10; j++) {
				System.out.println
				    (i + "x" + j + "=" + (i * j));

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}
		}
	}
}
