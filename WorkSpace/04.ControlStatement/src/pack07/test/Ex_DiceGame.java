package pack07.test;

import java.util.Random;
import java.util.Scanner;

public class Ex_DiceGame {
public static void main(String[] args) {
	while(true){Random random=new Random();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter key를 누르면 pc가 주사위를 굴립니다.");
	sc.nextLine();
	
	
	
	int pcNum=random.nextInt(6)+1;
	System.out.println("enter key를 누르면 사용자가 주사위를 굴립니다.");
	sc.nextLine();
	int userNum=random.nextInt(6)+1;
	if(pcNum>userNum) {
		System.out.println(pcNum+">"+userNum+"pc 승!!");
	}else if(pcNum<userNum){
		System.out.println(pcNum+"<"+userNum+"user승!!");
		
	}else {
		System.out.println(pcNum+"="+userNum+"무승부!!");
	}
}
}
}