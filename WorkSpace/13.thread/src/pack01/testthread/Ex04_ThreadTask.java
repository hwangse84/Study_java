package pack01.testthread;

public class Ex04_ThreadTask extends Thread{
	private String taskName;
	
	public Ex04_ThreadTsk(String taskName) {
		this.taskName=taskName;
	}
	
	@Override
	public void run() {
	for(int i =0; i<10; i++) {
		System.out.println(i);
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			
		}
	}
	}

}
