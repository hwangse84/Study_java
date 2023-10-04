package exam.array;

import java.util.Arrays;

public class Ex02_Array {
	public static void main(String[] args) {
		int[] array = { 3, 5, 7, 9, 1, 2, 4, 10 };
		
                     //어떤 데이터  sorting(정렬)==>database asc,desc
		Arrays.sort(array);//java8버전 이상만 가능하면 java외에 언어에서는 없는 경우있음
		System.out.println("정렬:"+ Arrays.toString(array));
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] > array[j]) {      //>오름차순, <내림차순
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}
		}System.out.println(Arrays.toString(array));
		
	}
}
