package pack01.Car;

public class Computer {
	//ComputerMain 에서 plus 메소드를 호출하는데 !
	//컴퓨터의 전원(isPower)이 켜졌을 떄는 기능이 똑같이되고 1,2=>3
	//그게 아니라면 "먼져 컴퓨터의 전원을 켜주세요"./라는 메세지가 출력하게 해보기
	boolean isPower;//기본 "false",전역변수
	
	public void plus(int num1, int num2) {
		System.out.println(num1+num2);
	
	if(isPower) {
		
		System.out.println(num1+num2);
		
	}else{
		System.out.println("전원을 켜주셍요!!");
	}
}
}