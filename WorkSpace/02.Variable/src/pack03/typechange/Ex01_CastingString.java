package pack03.typechange;

public class Ex01_CastingString {
public static void main(String[] args) {
	// String 변수 str1,str2를 각각 10과 20의 값을 담아 초기화시키고
	//출력문에서 str1과 str2의 합을 출력해보자.
	
	//연산결과 : 1.30, 2.1020
	
	String str1="10";
	String str2="20";
	
	System.out.println(str1+str2);

	int intv1 = 10;
	int intv2 = 20;
	System.out.println(intv1+intv2);
	//String의 연산 법칠 : Concatenation(연결)
	//String의 +는 문자열의 연결을 의미
	//어떤 변수를  String에 더해도 그 변수의 타입은 자동으로 String 이된다.
	
System.out.println("10"+(10+20));//출력된 결과의 타입은 무엇일까?
	
	// tntwk -> String : +String 해주면 끝
	//WrapperClass(포장) : Sting을 WrapperClass로 감싸주면 해당 타입으로 변한다.
	//double->Double, byte->Byte,


	int number1= Integer.parseInt(str1);
	System.out.println(number1+20);
	int number2 =  Integer.parseInt("30");
	System.out.println(number2);
	
	String numberString = 10+"";//="10"
	System.out.println(numberString +10);
	

}
}
