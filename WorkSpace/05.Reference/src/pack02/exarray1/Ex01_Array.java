package pack02.exarray1;

public class Ex01_Array {
public static void main(String[] args) {
//	int score1=1;
//	int score2=2;
//	int score3=3;
//	int score4=4;
//	int score5=5;
//각각을 변수 이름을 주고 저장을 하는 것은 매우 비합리적!(변수이름의 오류, 갑 할당 오류, 사용시 불편)
	
	//배열 : 자료형 변수를 생성하고 사용할때 주로 사용하며
	//1)동일한 자료형(데이터타임)을 2)"정해지 수"만큼 저장하고 사용하는 3)"객체"
	//4) 각각의 데이터는 "index라는 주소"로 구분한다.  5) 중간에 크기 변경이 불가능하다.
	//해당 데이터를 알아볼 수 있는 단어 뒤에 s붙이기. Arr 붙이기
	//int[] intArr;  <= 변수의 선언
	//int Arr= new int[4]; <=초기화
	
	
	int[] intArr;
	intArr=new int[4];//stack[intArr,memoryNum] -->heap memoryNum"0[]1[]2[]3[]
	
	//배열에 데이터타입이 주어지면 한칸은 해당하는 타입의 변수와 같다.
	//배열은 0부터 ~
	//배열의 크기가 n이 주어졌을떄 배열의 인덱스는 0~n-1까지를 의미함(4...0~3(4-1)
	System.out.println(intArr);//[]I@3D012DDD <=힙의 어드레스주소[우리한테 없는것]
	int num=1;
	intArr[0]=num;//intArr[]index]==배열의 타입 변수와 같다.
	intArr[1]=2;
	intArr[2]=3;
	intArr[3]=4;
	//출력 (배열의 값 출력해보기)
//	System.out.println(intArr[0]);
//	System.out.println(intArr[1]);
//	System.out.println(intArr[2]);
//	System.out.println(intArr[3]);
//	
//	for(int i=0;i<=3;i++) {
//		//System.out.println(intArr[i]);
//		System.out.println("배열의 크기:"+intArr.length);
		for(int i=0; i<=intArr.length; i++) {//<,<=차이.(6을 포함할지 말지에ㄸㅏ라 달라진다.)
			
			System.out.println(intArr[i]);
		}
		
}}
