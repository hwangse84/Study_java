package pack02.product;

//DTO데이터의 속성,객체의 속성(에이터베이스에 있는
//데이터 타입에 맞춰서 데이터를 운반
//Data Ttansfer Object
//(Value Object):Web 표준 --> 생성자를 
//별도로 x, 필드에 접근을 막아놓은 형태
public class ProductDTO {
	private int num;
	private int price;
	private String name;
	
	


	public int getNum() {
		return num;
	}




	public void setNum(int num) {
		this.num = num;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public ProductDTO(int num, int price, String name) {
		this.num=num;
		this.price =price;
		this.name=name;
	}
	// public:외부에서 접근이 되어야 하는 메소드
	// getter &setter
	// get : 외부로부터 접근이 안되는 필드의 변수값을 return
	// set : 필드의 변수값을 바꾸기위한 (set)메소드
//	//alt+shift+s 또는
	//마우스 오른쪽 클릭->source ->getter&setter ->생성자메소드
	
}










