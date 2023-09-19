package pack01.exif;

public class Ex03_ifElseifElse {
public static void main(String[] args) {
	//if(조건식){
		//조건식 A가 true일때 실행되며 스외에 연결된 else if,else는 실행x
		//}elseif(조건식B) {
		// 조건식 A가 false일때 조건식 B를 실행하며, 조선식B가 true...
		//}else if(조건식c){
		//}else if{
		//}else{
		//}

int score=85;
	if(score>=90) {
		System.out.println("A학점");
	
	}else if(score>=80){
		System.out.println("B학점");
		
	}else if(score>=70) {
		
		System.out.println("C");
		
	}else if(score>=60) {
		System.out.println("D");
		
	}else {
	System.out.println("E");
	
	
}
}
}
