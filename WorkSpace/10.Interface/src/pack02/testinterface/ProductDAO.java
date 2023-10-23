package pack02.testinterface;

public class ProductDAO implements ProductInterface{
//상품정보 5건을 담아 return하는 메소드 initDtos 완성하기
	
	public ProductInterface[] rtnArr() {
		ProductInterface[] pArr=new ProductInterface[4];
		
		return pArr;
	}
	@Override
	public ProductDTO[] initDtos() {
		ProductDTO[] dtos = new ProductDTO[5];
		//ProductDTO dto1=new ProductDTO(1, 1000, "상품명1");
		dtos[0]=new ProductDTO(1, 1000, "상품명1");
		dtos[1]=new ProductDTO(2, 1123, "상품명2");
		dtos[2]=new ProductDTO(3, 1124, "상품명3");
		dtos[3]=new ProductDTO(4, 1125, "상품명4");
		dtos[4]=new ProductDTO(5, 1126, "상품명5");
		
		return dtos;
	}

//상품정보를 담고이쓴 배열 dtos입력받아 내부 내용(상품번호, 명, 가격)을 츨력하는 메소드)
	@Override
	public void dispaly(ProductDTO[] dtos) {
		System.out.println(COMPANY_NAME);
		for(int i =0; i<dtos.length; i++) {
		System.out.println(dtos[0].getNum()+"."+dtos[0].getName()+""+dtos[0].getPrice());
	
		}
	}
	
}
