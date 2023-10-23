package hss;

public class hs1 {
	  public void show() {
	    System.out.println("OuterClass의 show() 메서드 호출");

	    // 외부 클래스의 메서드에서 내부 클래스를 정의합니다.
	    class InnerClass {
	      public void show() {
	        System.out.println("InnerClass의 show() 메서드 호출");
	      }
	    }

	    // 외부 클래스의 메서드에서 내부 클래스를 인스턴스화 합니다.
	    InnerClass innerObj = new InnerClass();

	    innerObj.show();
	  }
	//}

	//public class  main{
	  public static void main(String args[]) {
	    hs1 outerObj = new hs1();

	    outerObj.show();
	  }

}
