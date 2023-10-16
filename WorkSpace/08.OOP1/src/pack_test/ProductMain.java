package pack_test;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ProductDAO dao = new ProductDAO();
		ProductDTO dto = new ProductDTO(0, " ", 0);
		ProductUserDAO userDao = new ProductUserDAO();
		ProductAdminDAO adminDao = new ProductAdminDAO();
		ProductDTO[] Dtos = dao.productList();
		ProductUserDTO[] userDtos = userDao.userIndex();
		userDao.displayCustomerData(userDtos[0]);
		while (true) {
			dto.mode = dao.chooseMode();
			if (dto.mode == 3) {
				break;
			} else if (dto.mode == 1) {
				if (userDao.userLogin(userDtos)) {
					while (userDao.userMenu(Dtos))
						;
				}
			} else if (dto.mode == 2) {
				if (adminDao.adminLogin()) {
					while (adminDao.adminMenu(Dtos))
						;
				}
			}
		}
	
	while(true) {
		//dto.userMenu =dao.displays(Dtos);
		
	}
	}

}
