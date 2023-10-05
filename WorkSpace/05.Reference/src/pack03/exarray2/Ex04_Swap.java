package pack03.exarray2;

public class Ex04_Swap {
	public static void main(String[] args) {

//	int num1=10,num2=20;
//	System.out.println("num1:"+num1+"num2:"+num2);
//	//코드로 두 변수를 바꿔치기 해보기
//	int tempNum=num1;
//	num1=num2;
//	num2=tempNum;

		// swap의 개념을 이용하여 오름차순 또는 내림차순으로 바꿔보기
		// int[] arr= {3,5,7,9,1,2,4,10};
		// 배열 내부에서 가장 작은 수를 왼쪽으로 이동시킴
		// 코딩은 여기서부터하기(정렬 알고리즘)
		// 1.비교가 필요함.
		// 2.비교 후 인덱스이 값끼리의 변경 시 임시로 저장할변수나 어떤 공간이 필요함

		int[] arr = { 3, 5, 7, 9, 1, 2, 4, 10 };

		int tempNum = 0;
		for (int i = 0; i < arr.length; i++) {
			{
				System.out.print(arr[i]);

				for (int j = 0; j < arr.length - i - 1; j++) {
					System.out.println(arr[j]);

					if (arr[j] > arr[j + 1]) {
						tempNum = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = tempNum;

					}
				}
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}//
}
