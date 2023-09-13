package pack02.variabletype;

public class Ex01_Byte {
public static void main(String[] args) {
	//byte byte1 = -129;	 : -128~127까지의 범위만 나타낼수있음.(byte)
			            //부호비트때문에 양수에서 값하나가 적다.(128이 없는이유)
					//byte자체는 직접 사용을 많이 안하기 때문에 이런종류가있다 정도만 인지하면 된다.
	
	
// byte변수 문제)
// 1. byte1이라는 변수를 선언하기.
// 2. byte1이라는 변수에 값 100을 할당하고 출력하기.
// 3. byte2~4까지의 변수를 나열해서 선언하기.
// 4. byte2~4까지의 변수에 값 할당하기. 각각 20 , 30 , 40
// 5. byte5~6을 나열과 동시에 초기화하기. 
	
	
byte byte1;
byte1 = 100;
System.out.println(byte1);
byte byte2, byte3, byte4;
byte2=20; byte3=30; byte4=40;
byte byte5=11, byte6=22;
	System.out.println(byte1);
	System.out.println(byte2);
	System.out.println(byte3);
	System.out.println(byte4);
	System.out.println(byte5);
	System.out.println(byte6);
	
}
}
