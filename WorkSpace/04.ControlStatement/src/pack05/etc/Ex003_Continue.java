package pack05.etc;

public class Ex003_Continue {
public static void main(String[] args) {
	//계속한다.(to be continue->다음화에 계속)
	//->반복문을 종료x,continue
	
	//break VS continue:
	//break:
	//continue:
	
	int oddSum=0;//  홀수의 누적합
	
	for(int i=1;i<=10;i++) {
		if((i&1)==1) {
			continue;
			
		}
		oddSum+=i;
	}
	System.out.println(oddSum);
	
	}
}
