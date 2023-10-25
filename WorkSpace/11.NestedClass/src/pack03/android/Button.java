package pack03.android;

public class Button {
public onClickListner listner;//null<=외부에서 어떤 이벤트를 작성할지 결정.
	
	//자주사용하지x
//	public onClickListner getListner() {
//		return listner;
//	}

	
	//os가 해줌.
void click() {
	listner.onClick();
	
}
	public void setListner(onClickListner listner) {
		this.listner = listner;
		this.click();
	}


	static interface onClickListner{
		
		void onClick();
		//OnClickListnerㄹㅏ는 인터베이스 형태를 사용하기 위해서 onClick 이라는 메소드는 반드시 있어야함
		
		

}
}