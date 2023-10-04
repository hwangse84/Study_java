package pack01.exsting;

import java.util.Scanner;

public class Ex01_String {
public static void main(String[] args) {
	//String <- 일반 변수와 다룸, 대문자로 시작함,(Class, =>우리가 계속 만들고 있는것)
	//참조형 데이터타입(열거, 클래스 String, 인터페이스, 배열)
	//stack 메모리에 값을 바로 담는 경우(기본형 데이터 타입)
	// heap 메모리에 데이를 담고 stack 메모리에 heap메모리의 주소부를 저장하는경우(참조형 데이터 타입)
	//== <= 비교연산자는 stack메모의 값을 비교
	//stack : int 1=10,num2=10 : num1[10],num2[10] : 값 비교를 하기 때문에 정확한 비교 결과를 얻을 수 있음 10==10
	// stack : String str1"A", str2="B" :str1[100],str2[100]: 번지수 비교를 하기 때문에 정확한 비교 결과x
	Scanner sc=new Scanner(System.in);
	String str1="hse";
	String str2="hse";
	String str3=sc.nextLine(); // stack과 heap에 새로운 메모리 번지수를 만들고 값을 저장함
	System.out.println("str1:"+System.identityHashCode(str1));
	System.out.println("str2:"+System.identityHashCode(str2));
	System.out.println("str3:"+System.identityHashCode(str3));
			if(str1==str2) {
				System.out.println("같음");
				
			}else {
				
				System.out.println("다름");
			}
			if(str1.equals(str3)) {// string은 값비교를 equals를 통해서 한다.
System.out.println("==는stack메모리 참조번지수를 비교한다");
}
}}
