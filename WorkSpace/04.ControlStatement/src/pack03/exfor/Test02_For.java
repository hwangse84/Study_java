package pack03.exfor;

public class Test02_For {
public static void main(String[] args) {
	//for문을 이용하여 구구단 2단  출력
	//2*1=1
	//2*2=4
	//2*3=6
	//2*4=8
	//2*5=10
	//2*6=12
	//2*7=14
	//2*8=16
	//2*9=18
	
	//int i=1;
	System.out.println("2 X1 =2");
	System.out.println("2 X2 =4");
	System.out.println("2 X3 =6");
	System.out.println("2 X4 =8");
	System.out.println("2 X5 =10");
	System.out.println("2 X6 =12");
	System.out.println("2 X7 =14");
	System.out.println("2 X8 =16");
	System.out.println("2 X9 =18");
	
	
	for(int i=1; i<=9; i++) {
		
		System.out.println("2X"+i+"="+(2*i));
	}
}
}
