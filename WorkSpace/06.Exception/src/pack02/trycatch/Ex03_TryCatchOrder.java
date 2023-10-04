package pack02.trycatch;

public class Ex03_TryCatchOrder {
public static void main(String[] args) {
	//아래 오류 각각 처리방법!!!
	//0으로 나눈 경우 예외     //물이 넘친경우
  	//문자열을 숫자로 바꿀때     //물이 없어서 냄비가 타고있는경우..
	//null인 경우
	
	try {
		//try내부에서는 코드가 위에서아래로 순차적으로 실행(정상의 경우)
		//예외 발생시 밑의 코드는 실행하지 않음 ->catch
		
		Double.parseDouble("a");
		System.out.println(0/0);
		String str=null;
		System.out.println(str.length());
		
	}catch(NumberFormatException e) {
		System.out.println("숫자가 아닌갑!!");
	}catch(ArithmeticException e){
		System.out.println("0으로 나눠서 오류");
	}catch(NullPointerException e)	{	
		System.out.println("NULL오류입니다.");
	} catch (Exception e) {   //Exception 모든오류의 기본 처리가
		
		System.out.println("그 외의 오류입니다!!!");
	}finally {
		System.out.println("프로그래ㅁ의 종료(통신종료)");
	}
}
}
