package pack03.exarray2;

import java.util.Arrays;

public class Test02_Array {
	public static void main(String[] args) {
		// 데이터 타입[] 배열이름=new데이터타입[크기]
		//
		//

//{강아지, 진돗개, 불독, 시츄}
// {페르시안,고양이, 노르웨이} 
	//	String[] dogs = new String[4];
		//String[] cats = new String[3];

		String[] dogs = { "강아지", "진돗개", "불독", "시츄" };
		String[] cats = { "페르시안", "고양이", "노르웨이" };

		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i] + "");

			System.out.println(Arrays.toString(cats));
			String[][] animals = { dogs, cats };
			String[][] animalArr = new String[2][];

			animalArr[0] = dogs;
			animalArr[1] = cats;
			

				for (int j = 0; j < animals.length; j++) {
					System.out.println(animals[i][j] + "");
				}

			}
			System.out.println();
		}
	}

