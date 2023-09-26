package pack02.exarray1;

public class Ex02_1ex {
	public static void main(String[] args) {

		int[] as = new int[9];

		// as[0]=2;
		// as[1]=4;
		// as[2]=6;
		// as[3]=8;
		// as[4]=10;
		// as[5]=12;
		// System.ㅇout.println(as.length);
		for (int i = 0; i < as.length; i++) {
			as[i] = (i + 1) * 2;
			System.out.println(as[i]);

		}

		String[] starArr = new String[5];
		for (int i = 0; i < starArr.length; i++) {

			if (i == 0) {

				starArr[i] = "★";
			} else {
				starArr[i] = starArr[i - 1] + "★";

			}
		}
		System.out.println("★");
		for (int i = 0; i < starArr.length; i++) {
			String star = "";
			for (int j = 1; j < starArr.length; j++) {
				star += "★";
			}
			starArr[i-1] = star;
		}
	}
}