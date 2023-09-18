package exam.operator;

public class Ex01 {
public static void main(String[] args) {
	int num1=2,  num2=4;
	// num1과 num2의 사칙연산과 나머지를 구하기 (연산식으로 결과 출력_)
	
	// 변수는 대입 연산자 또는 증감시글 제외하고 내용이 절대 안바뀜
	System.out.println("num1+num2="+(num1+num2));
	System.out.println("num1-num2="+(num1-num2));
	System.out.println("num1*num2="+(num1*num2));
	System.out.println("num1/num2="+(num1/num2));
	System.out.println("num1%num2="+(num1%num2));
	
	//(출력결과)
	
	// num1과num2의 더하기 결과 :
	
	System.out.println(num1+num2);//6
	
	//2. num1을 마이너스로 반전시키고 출력하기. 출력후에는 다시 양수 2로 반전시키기.
	num1=-num1;
	num2=num2*-1;//(가독성좋음)
	System.out.println("num:"+num1+"num2:"+num2);
	num1=-num1;
	num2=-num2;
	
	//3. num1을 증감식을 이용하여 1증가 시키고 num2는 증감식을 이용하여 1마이너스 시키기.
	System.out.println(++num1);
	System.out.println(--num2);
	
	//4. 비교 연산자 3가지를 이용하여 두 변수를 비교하고 결과를 출력하기.
	System.out.println(num1<num2);
	System.out.println(num1==num2);
	System.out.println(num1<=num2);
	//5 비교 연산자 1개를 사용하는데, AND ,OR연산자를 이용하여 비교 연산자1개를 더 연결 시키고 결과 출력
	
	boolean bool1;
	bool1=(num1>=5&&num2<7);
	System.out.println(bool1);
	
	boolean boo2;
	boo2=num1<1||num2<5;
	System.out.println(boo2);
	
	//6. 복합 대입연산자 또는 변수의 현재값에 1을 더하기(num1,num2둘다적용)
	num1=num1+1;
	
	num2=+2;
	
	
	// 7. 삼항 연산자 하나를 이용하여 비교하고 그 결과를  String 형태로 받아서 결과 출력
	String String1;
	String1=num1>num2? "true" : "false"; 
	System.out.println(String1);
	
	String string2;
	string2=(num1<=num2)?"참":"거짓";
	System.out.println(string2);
	
	String string3;
	string3=num1==num2?"true":"false";
	System.out.println(string3);
}
}
