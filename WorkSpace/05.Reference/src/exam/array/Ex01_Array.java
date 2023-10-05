package exam.array;

import java.util.Arrays;

public class Ex01_Array {
public static void main(String[] args) {
	int[]  numbers= {1,2,3,4,6,7,8,0};//비어있는 숫자찾아 더해라
	
	int endpoint=90/2;
	for(int i=0; i<numbers.length; i++) {
		
		endpoint-=numbers[i];
		
	}
	System.out.println(endpoint);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	int[] tempArray=new int[10];
	for(int i=0; i<tempArray.length; i++) {//{1.2.3.4.6.7.8.0}
		for(int j=0; j<numbers.length; j++) {//{1,1,1,1,1,0,1,1,1,0}
		  	
			if(i==numbers[j]) {
				tempArray[i]=1;
				
			}
				
		}
		
		
		
	}
	
	System.out.println(Arrays.toString(tempArray));
int sum =0;
	for(int i=0; i<tempArray.length; i++) {
		if(tempArray[i]==0) {
			sum+=i;
			System.out.print("비어있는 숫자 :" + i +" "+sum);
			
		}
		
		
		
	}
}
}
