package pack01.testthread;

import java.awt.Toolkit;

//자바 애플맄ㅔ이션이 실행되는동안 thread라는 객체가 동작
//window로부터 소리를 제공받아 사용(toolkit):별로 중요x
public class Ex01_Thread {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		toolkit.beep();

		// for문은 컴퓨터 속도에 따라 차이가 있지만 0.0001초 내 5번 동작
		// Thread.sleep: 동작중인 프로세스를 휴지시킴(잘깐 딜레이):1000(1초)
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.println("띠로롱");//*로 시간 설정할수 있다(EX))1000*2)
			try {
				//진행중인 쓰레드(작업)이 슬립을 만났을떄 오류가 생길 가능성이 있음.->강제로 try{}cathe{}
				//File(IO)
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
