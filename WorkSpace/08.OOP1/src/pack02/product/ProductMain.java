package pack02.product;

public class ProductMain {
public static void main(String[] args) {
	//ProductDTO를 하나 객체로 만들고 필드 전체에 값 할당 후 출력
	//
	ProductDTO[] dtos=new ProductDTO[5];
//	
//	ProductDTO dto1 = new ProductDTO(1, 6900, "스카프");
//	ProductDTO dto2 = new ProductDTO(1, 5700, "마늘");
//	ProductDTO dto3 = new ProductDTO(1, 3600, "커피");
//	

	
	dtos[0]=new ProductDTO(1, 6000, "스카프");
	dtos[1]=new ProductDTO(2, 5700, "마늘");
	dtos[2]=new ProductDTO(3, 3600, "커피");
	dtos[3]=new ProductDTO(4, 3600, "커피");
	dtos[4]=new ProductDTO(5, 3600, "커피");
	
	
	
	ProductDAO dao = new ProductDAO();
	dao.displays(dtos);
	

//	dto.num=1;
//	dto.name="~~스카프";
//	dto.setPrive(6900);
//	System.out.println(dto.name+dto.getPrice()+"원");
//	dto.price=-6900;
//	System.out.println(dto.num+"."+dto.name+":"+dto.price+"원");
}
}
