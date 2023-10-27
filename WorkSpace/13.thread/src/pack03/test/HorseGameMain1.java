package pack03.test;

import java.util.Scanner;
public class HorseGameMain1{
	
public static void main(String[] args) {
	HorseDAO dao = new HorseDAO(3);//3-> Scanner 이용 2~5 체크
//	new Thread(()->{
//		//slide하는 메소드
//	}).start();;
//dao.hseThread();

	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("2~5까지의 수 입력: 경기하는 말 개수");
		int inputNum = Integer.parseInt(sc.nextLine());
		if(inputNum >= 2 && inputNum <= 5) {
			HorseDAO dto = new HorseDAO(inputNum);//3-> Scanner 이용 2~5 체크
			break;
		}
	}
	sc.close();
	}

}
