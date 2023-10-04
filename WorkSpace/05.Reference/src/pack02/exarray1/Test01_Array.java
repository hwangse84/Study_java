package pack02.exarray1;

public class Test01_Array {
public static void main(String[] args) {
	//int형 데이터 타입을 묶어놓을 배열 intArray를선언!
	// 데이터타입[]변수명=new데이터타입[크기]
	// intArray를 크기 10을 주고  초기화한다.
	int[] intArray= new int[10];//int형 변수가 10개있음, [0]~[9]
//	intArray[0]=10;
//	intArray[1]=20;
//	intArray[2]=30;
//	intArray[3]=40;
//	intArray[4]=50;
	System.out.println("변수크기:"+intArray.length);
	int sum=0;
	for(int i=0; i<intArray.length;i++) {
		//num0=i;
		intArray[i] =i;  // inta 0-> 0
		//in 0 0 in 1 1 in 2 2 in3 3
	
		//syso(num0);
		sum+=intArray[i];
		System.out.println(intArray[i]);
	}
	System.out.println(sum/intArray.length);
	//
	//for문을 이용해서 전체배열에 값을 할당한다
	
	//for물을 이용해서 전체배열에 값을 출력한다
	//for물을 이용해서 전체배열에 평균값을 출력한다
	
	
	
	
}
}
