package pack_test;

public class ProductAdminDTO {
	public String getProdutdata() {
		return produtdata;
	}

	public void setProdutdata(String produtdata) {
		this.produtdata = produtdata;
	}

	public String getProdutnumber() {
		return produtnumber;
	}

	public void setProdutnumber(String produtnumber) {
		this.produtnumber = produtnumber;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductprice() {
		return productprice;
	}

	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}

	public String getSv() {
		return sv;
	}

	public void setSv(String sv) {
		this.sv = sv;
	}

	// 상품 정보, 순번, 이름, 가격, 구매 횟수
	String produtdata,produtnumber,productname,productprice, sv; //sv:판매량
	
}
