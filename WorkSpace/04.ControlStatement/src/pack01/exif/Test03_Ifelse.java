package pack01.exif;

public class Test03_Ifelse {
public static void main(String[] args) {
	// else : 단독으로는 쓸수 없음,(문법이  if{}else{})
	//       : else문도 블럭킹이 있기 때문에 독립적인 지역을 가진다.
	int number=10;
	if(number%2==1)
	{
		
		System.out.println("홀수");
	}else{
		System.out.println("짝수");
	}
// 해당수가 3의 배수인지, 아닌지를 if-else문으로 풀어보기
	if(number%3==0) {
		System.out.println("3의배수");
	}else
System.out.println("3의 배수가 아닙니다");
}
}
