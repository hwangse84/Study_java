package pack02.trycatch;

import java.util.Scanner;

public class Test01_TryCatch {
public static void main(String[] args) {
	//try{
    //예외발생코드
//}catch(Exception e){
     //오류발생시 실행
//}
	
	//Scanner를 사용하여 -1의 값이 입력되기 전까지 계속해서 숫자를 입력받음
	//Scanner의 nextLine()기능을 이용하기
	//입력된 숫자를 계속해서 누적합을 구함(누적시킴)
	//+단, 숫자 외에 값이 입력되면 잘못된 입력!!!이라고 표시하고 다시 입력을 받음
	//이 프로그램을 -1입력 전까지 비정상 종료가 없는 프로그램
	
	
//	
	Scanner sc = new Scanner(System.in);
	int sum=0;
	while(true) {
				String inputData =sc.nextLine();
				if(inputData.equals("-1")) {
					break;
				}
	try {
		int num=Integer.parseInt(inputData);
		sum += num;
		System.out.println(sum);
	} catch (Exception e) {
		System.out.println("숫자 외 값 오류");
	}
		
	}	

}
}

