package pack03.test;

import java.util.Scanner;

public class FileDownMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(true){
		System.out.println("다운받으실걸 입력하세요 -1누를시 중단");
		String inputData =sc.nextLine();
		if(inputData.equals("-1")) {
			System.out.println("중단");
			break;
		}
	FileDownTask task= new FileDownTask(inputData);
	task.start();
	
	}
	sc.close();
}
}
