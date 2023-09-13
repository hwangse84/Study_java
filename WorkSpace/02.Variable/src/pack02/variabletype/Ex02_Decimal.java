package pack02.variabletype;

public class Ex02_Decimal {
public static void main(String[] args) {
	short short1;
	short1 = 31;
	System.out.println(short1);
	
	int inta;
	inta=5677;
	System.out.println(inta);
	
	long long1;
	long1=2836489922L;//;long 타입 뒤에는 int가 아니라 Long이다라는 
	                  //구분자로 'L'을 붙인다
	
	char char1=65535;//문자세트,유니코드 65535가아니라 'A'로 써야함
	System.out.println(char1);
	System.out.println("왜 출력이 안됐을까");
}
}
