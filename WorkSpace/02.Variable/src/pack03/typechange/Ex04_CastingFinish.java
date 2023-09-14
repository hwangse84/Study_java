package pack03.typechange;

public class Ex04_CastingFinish {
public static void main(String[] args) {
	String str_v1 ="3.14";
	String str__v2 = "100";
double double1=Double.parseDouble(str_v1);
int int2=Integer.parseInt(str__v2);
System.out.println(double1+1);
System.out.println(int2+100);


int int4=(int)double1+1;
//명시적 형변환, 강제타입변환,DownCasting

short short34=(short)(int2+100);
//명시적 형변환, 강제타입변환,DownCasting

}
}
