package pack02.trycatch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01_Lotto {
	public static void main(String[] args) {
		Random random = new Random(); 
		Scanner sc = new Scanner(System.in); //사용자!userNums
		 int[] userNums = new int[6];
	      int[] comNums = new int[6];

	      for (int i = 0; i < userNums.length; i++) {
	         userNums[i] = Integer.parseInt(sc.nextLine());
	                 //nextLine은 String 형태로 받기때문에 숫자로 바꾸는 작없을 해준다

	         if (userNums[i] < 1 && userNums[i] > 45) {
	            System.out.println("숫자 다시 입력");
	            i--;
	            continue;
	         }
	         for (int j = 0; j < i; j++) {   //사용자 중복 처리!
	            if (userNums[i] == userNums[j]) {
	               System.out.println("중복");
	               i--;
	               break;
	            }
	         }
	      }
	      for (int i = 0; i < comNums.length; i++) {//컴퓨터 배열속 중복 처리!
	         comNums[i] = random.nextInt(45)+1;

	         for (int j = 0; j < i; j++) {
	            if (comNums[i] == comNums[j]) {
	               System.out.println("중복");
	               i--;
	               break;
	            }
	         }
	      }

	         
	      

	      System.out.println(Arrays.toString(userNums));
	      System.out.println(Arrays.toString(comNums));
	   }
	}