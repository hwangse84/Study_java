package pack03.exarray2;

public class Test01_Array {
public static void main(String[] args) {
	//2차원 배열을 만들고, 2차원 배열 내부에 2-9단의 결과를 모두 담고 출력하기!
	
	int[][] arr = new int[8][9];
	arr[0][0]=2;
	arr[0][1]=4;
	arr[0][2]=6;
	arr[0][3]=8;
	arr[0][4]=10;
	arr[0][5]=12;
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j] = (i+2) * (j+1);
			System.out.println(arr[i][j] );
		}
	}
}
}
