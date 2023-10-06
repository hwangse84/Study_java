package pack01.exceptioncode;

import java.util.Scanner;

public class Ex01_NullPointer {
public static void main(String[] args) {
	//Ex01_ 프로젝트 실행시,콘솔에 NullPointer오류가 발생하게 코딩해보기
	//참조형 데이터타입은 아직 객체 참조를 시작하지않음(null)상태에서는 모든기능 사용안됨
	String strs=null;
	Scanner scan=null;
	if(scan!=null) {
	scan.nextLine();
	
	}
	//NullPointException은빈번하게  방생한다 -> 회피방법간단
	//객체를 사용할때 null 이 아닌 상태에서만 쓰게끔 만들면 된다.
	//제어문을 활용하면 된다
	if(strs !=null) {
		
	
	System.out.println(strs);
	}
	System.out.println();
}
}
