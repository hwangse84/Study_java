package pack03.test;

import java.util.Random;

//스캐너를 통해서 입력받은 파일을 다운로드
//1. file이름을 받아온 후, 2. 진행률
public class FileDownTask extends Thread {
	private String FileName;
	private int percent;// <=0

	@Override
	public void run() {
		while (percent <= 100) {
			percent += new Random().nextInt(10) + 5;
			if (percent > 100) {
				percent = 100;
				break;
			}
			System.out.println(FileName + "파일 다운로드중.." +percent+"%");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public FileDownTask(String fileName) {
		this.FileName = fileName;
	}

}
