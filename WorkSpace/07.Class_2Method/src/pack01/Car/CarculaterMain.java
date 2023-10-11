package pack01.Car;

public class CarculaterMain {
	public static void main(String[] args) {
		Calculater cal =new Calculater();
		cal.plus(1, 2);//void:결과호출한 부분에서 받아올수 x
		cal.plus(3, 76);
	   cal.minus(10,20);
	   //int result = cal.mul(1, 2);
	   System.out.println(cal.mul(1, 2));
	   System.out.println(cal.div(5,2));
	}
}
