package pack02.exarray1;

public class Ex02_Array {
	public static void main(String[] args) {
		// [] <- 자료구조 : 배열, 데이터가 하나이상이 있다(==같은 구조로, 타입)
		// 데이터타입[]: <=1차원 배열 : 한가지 데이터 타입을 요소로 가지는 자료구조(외우기)
		// 내가 알고잇는 대부분의 데이터타입은 배열ㄹ로 표현가능.
		// 데이터타입[] 배열이름=new 데이터타입[int크기];
		// 배열의 크기를 정확히 모르지만 배열의 이름을 예약해두고싶을 떄는(추후 사용예정) null
		// int[] intArr = null; //null로 데이터를 초기화함!!
		// if(intArr !=null) {
		// System.out.println(intArr.length);
		// }
		// System.out.println(intArr.length);
		//

		String[] sArr = new String[10];
		// String name ="이름1"; => sArr[0]
//	SArr[0]="이름1";
//	SArr[1]="이름2";
//	SArr[2]="이름3";
//	SArr[3]="이름4";
//	

		System.out.println(sArr.length);
		for (int i = 0; i < sArr.length; i++) {
			sArr[i] = "이름" + (i + 1);
			System.out.println(1 + sArr[i]);

		}
		int[] intArray = { 1, 2, 3, };
		// 값 두개를 가지는 String배열 만들어보기
		// -->>>String[] strArrays={"스트링1","스트링2"};
		System.out.println(intArray.length);
	}
}
