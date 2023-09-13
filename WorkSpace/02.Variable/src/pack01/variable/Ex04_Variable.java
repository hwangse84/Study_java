package pack01.variable;

public class Ex04_Variable {
public static void main(String[] args) {
	//변수를 왜 꼭 사용해야할까?
	//=>이유 : 1.재사용이 가능하다.(
		//	2. 한번에 수정이 가능하다(일괄)
		//3. -->아직 배우지않은 개념.
	int num=20;//어떤 물건의 개념
	int numUp20 = num + 20;
	System.out.println(num-1);
	System.out.println(num*3);
	System.out.println(num);
	
	System.out.println(20-1);
	System.out.println(20*3);
	System.out.println(20);
	
	System.out.println(num);//변수에 20이라는 숫자를 담아서 출력한 경우
	System.out.println(20);//그냥 숫자 20을 출력한 경우
}
}
