
public class Ex07_Oper {
public static void main(String[] args) {
	// 삼항 연산자 : 4장에서 배우는 조건문을 많이 이용한다(if)
	//조건식을 연산하여 true가 나올떄, false가 나올떄의 결과를 어떤 값으로 받고싶음
	//ex)1과 2를 비교 후 참이 나오면 "참입니다", 거짓이면"참이 아닙니다!"
	// 조건식 (비교 연산자)?"참":"거짓"
	int age=10;
	String result = age==10?"참" : "거짓";
	System.out.println(result);
	
	int score =70; //A~...등급
					// 사용빈도가 낮다.
	String grade = score >90?"A" : score > 80?"B" : score >=70?"c" :"E";
	System.out.println(grade);
}
}
