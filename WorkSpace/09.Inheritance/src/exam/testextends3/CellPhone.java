package exam.testextends3;

import java.util.Random;

public class CellPhone {
	//기본 기능을 가지고있는 최상위 부모클래스
	//필드 (인스턴스 멤버)
	public String model; //휴대폰 기종
	public String color;//색상
	
	public CellPhone(String color2, String model2) {
		// TODO Auto-generated constructor stub
	}
	//기능(인스턴스 멤버)
	public void powerOn() {
		System.out.println("종료 버튼 눌러서 전원 ON");
	}
	public void powerOff() {
		System.out.println("종료버튼 눌러서 전원 OFF");
	}
	public void bell() {
		System.out.println("전화와서 벨울립(소리남)");
	}
	public void hangup() {
		System.out.println("통화종료");
	}
	public void receiveVoice() {
		System.out.println("상대방 :"+ new Random().nextInt(123456)+1);
	}
	public void sendVoice(String voice) {
		System.out.println("통화종료");
	}
}

