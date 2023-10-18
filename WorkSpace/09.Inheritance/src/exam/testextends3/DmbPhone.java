package exam.testextends3;

public class DmbPhone extends CellPhone{
	// 이미 기능 완성되어있는 1세대 CellPhone을 이용해 방송기능이 추가된 2세대 폰구현
	int channel;
	
	
	public DmbPhone(String model , String color, int channela) {
		super(color, model);
		this.channel=channela;
//		this.color=color;
//		this.model=model;
	}
	
	public void turnOnDmb() {
		System.out.println("채널"+ channel +"시청시작");
	}
	public void turnOffDmb() {
		System.out.println(channel +"채널 보다가 종료");
		
	}
	
	public void changeChannel(int channeld) {
		this.channel=channeld;
		System.out.println(channel +"로 변경");
	}
}
