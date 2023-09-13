package pack02.variabletype;

public class Ex03_Char {
public static void main(String[] args) {
	//문자. 문자열
	//문자(char) : 하나의 글자만 저장 : 유니코드'문''자'.'문자(x)'
	//'<-싱글 코테이션, 홀 따옴표
	char char1 = 'A';
	char char2 = 'a';
	char char3 = '#';
	System.out.println(char1);
	System.out.println(char2);
	System.out.println(char3);
	//chat 문자를 숫자로 변환하거나 숫자를 문자로 변환하는 등의 용도로 사용함
	//따라서, 문자를 담는 용도가 아니라 숫자를 담아야 할때는 short,int,long사용
	//Android 특수문자 막혔을때 사용\u0041
	
	char char_4 = 65;//10진수
	char char_5='\u0041';//16진수
	System.out.println(char_4);
	
	//문자열 (string) : 하나 이상의 문자들을 의미함. "문자열"
	//"<- 더블 코테이션, 쌍 따옴표
	//String은 기본형 데이터 타입이 아님 ->참조형 데이터타입.
	//첫글자가 대문자로 시작한다.
	String string_v1 = "황승은";
			System.out.println(string_v1);
}
}
