package pack06.game;

import java.util.Random;
import java.util.Scanner;

public class e {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	

int on =0;
System.out.println("단계를 선택하세요");

System.out.println("하이로게임입니다.랜덤한 숫자를 맞춰주세요.");
while (true) {

	System.out.println("이 프로그램은 무한반복하는 프로그램입니다");
	String str = sc.nextLine();
	
	on = Integer.parseInt(str);

	if (on == 1) {
		System.out.println("Game Start");

		break;
	} else {
		System.out.println("Game over");
		break;	
	}

    while(on==1){
    	
    
	
	
    }
}
//for(int i=1; i<=10;i--) {//횟수제한
//		System.out.println("기회는10번입니다");
//		System.out.println("숫자를 입력해주세요");
//		String str = sc.nextLine();
//		int userNum = Integer.parseInt(str);
//	
//     if (randomNumber1 == userNum) {
//			System.out.println("정답!축하");
//			break;
//		} else if (randomNumber1> userNum) {
//			System.out.println("High");
//
//		} else if (randomNumber1< userNum) {
//			System.out.println("Low");
//		}
//
//if (randomNumber2 == userNum) {
//			System.out.println("정답!축하");
//			break;
//		} else if (randomNumber2 > userNum) {
//			System.out.println("High");
//
//		} else if (randomNumber2 < userNum) {
//			System.out.println("Low");
//		}
//	
//if (randomNumber3 == userNum) {
//			System.out.println("정답!축하");
//			break;
//		} else if (randomNumber3 > userNum) {
//			System.out.println("High");
//
//		} else if (randomNumber3 < userNum) {
//			System.out.println("Low");
		

