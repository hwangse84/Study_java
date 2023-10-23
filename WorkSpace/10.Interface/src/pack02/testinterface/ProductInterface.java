package pack02.testinterface;
public interface ProductInterface {
	//클래스의 규칙만있는곳!! 실제 기능구현(implements)은 클래스에서 한다
	public String COMPANY_NAME ="인터페이스 회사11" ;//대문자로 변경 : ctrl+x,
			                                 //소문자로 변경 : ctrl+y,
	//초기데이터 5건을 리턴받는 메소드
	public ProductDTO[] initDtos();
	
	
	public void dispaly(ProductDTO[] dtos);//배열을 입력받아 내부의 내용을 출력받는 메소드
}
