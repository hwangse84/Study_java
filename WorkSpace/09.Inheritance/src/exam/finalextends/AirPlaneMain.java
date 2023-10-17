package exam.finalextends;

public class AirPlaneMain {
public static void main(String[] args) {
	SuterSonicAirPlane ssa= new SuterSonicAirPlane();
	ssa.takeOff();
	ssa.flyMode = SuterSonicAirPlane.SUPERSONIC;
	ssa.fly();
	ssa.land();
	
	
	
	int intValue = 10;
	double doubleValue =intValue;//자동형변환 : 더 큰 그릇에 작은 그릇 담음,
	                              //어떤 처리 필요없음, Casting!!
	System.out.println(intValue);
	System.out.println(doubleValue);
	
	doubleValue =3.14;
	intValue =(int)doubleValue;// 강제 타입변환 : 더 큰에서 작은그릇으로 갈때 ,
	                            //어떤 처리 필요(데이터 타입명시).데이터 유식!
	System.out.println(intValue);
	
	
}
}
