package pack03.typechange;

public class Ex02_Casting {
public static void main(String[] args) {
	//0. 아래의 명령은 무슨 캐스팅이라고 표현하는가?
		//답 : 자동형변환, Up Casting, 묵시적 형변환
	//1. 아래의 명령은 몇 번의 캐스팅이 발생했는가?
		//답 : 1.1 : 3.5F+12.0F ->int ->float
		//     1.2 : 15.5F + 12.0F ->int->float
		// 제일 큰 타읿(담는것)을 제외한 타입의 개수만큼 타입변환이 발생됨
	//
	double sum = 3.5F + 12;
	System.out.println(sum);
	
	
	//2지수로는 소수점을 정확하게 표현을 못함, 근사치를 계속해서 계산.
	//BigDecimal(X)
	//데이터의 정확한 계산은 ->Database
	//double sum2 =3.14F +12;
	//System.out.println();
}
}
