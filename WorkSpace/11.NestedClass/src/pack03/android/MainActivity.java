package pack03.android;

public class MainActivity extends AppCompatActivity{
	
	protected void onCreate() {
		super.onCreate();
		
		Button btn=new Button();
		btn.setListner(new Button.onClickListner() {
			
			@Override
			public void onClick() {
				System.out.println("로그인 버튼 눌리면 여기 실행");
				
			}
		});
		public static void main(String[] args) {
			MainActivity main= new MainActivity();
			main.onCreate();	
				}
	}
}

