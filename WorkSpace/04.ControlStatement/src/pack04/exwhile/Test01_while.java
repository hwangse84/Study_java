package pack04.exwhile;

public class Test01_while {
	public static void main(String[] args) {
		int i = 1;
		while (i<10) {
			System.out.println("2x" + i + "=" + (2 * i));
			i++;

		}
		i = 2;
		while(i<10) {
			int j=1;
			
				while (j<10) {
			    System.out.println(i*j);
			    j++;

		}
	
		}
}
}