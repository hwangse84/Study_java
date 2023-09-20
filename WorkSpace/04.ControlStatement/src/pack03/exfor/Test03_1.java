package pack03.exfor;

public class Test03_1 {
public static void main(String[] args) {
//	int i =0;
//	i=i+1;
//	i=i+3;
//	i=i+5;
//	i=i+7;
//	i=i+9;
//	i=i+2;
//	i=i+4;
//	i=i+6;
//	i=i+8;
	int sum=0, oddsum=0, evensum=0;
	for(int i=0; i<10; i++) {
		if(i%2==1) {
			oddsum+=i;
		}else {
			
			evensum=+i;
		}
		sum =sum+i;
	}
	System.out.println(oddsum);
	System.out.println(evensum);
	
}
}
