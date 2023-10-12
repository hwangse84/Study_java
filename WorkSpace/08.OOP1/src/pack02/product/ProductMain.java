package pack02.product;

public class ProductMain {
public static void main(String[] args) {
	//ProductDTO를 하나 객체로 만들고 필드 전체에 값 할당 후 출력
	//
	ProductDAO dao = new ProductDAO();
//	ProductDTO[] dtos = dao.selectRead();
//	dtos=dao.delete(dtos);
//	dao.display(dtos);
//	ProductDTO dto1 = new ProductDTO(1, 6900, "스카프");
//	ProductDTO dto2 = new ProductDTO(1, 5700, "마늘");
//	ProductDTO dto3 = new ProductDTO(1, 3600, "커피");
//	dao.delete(dtos);
	
	dao.find();

	
	
	
	
	//dao.display(dtos[1]);
	
	


//	dto.num=1;
//	dto.name="~~스카프";
//	dto.setPrive(6900);
//	System.out.println(dto.name+dto.getPrice()+"원");
//	dto.price=-6900;
//	System.out.println(dto.num+"."+dto.name+":"+dto.price+"원");
//}
}
