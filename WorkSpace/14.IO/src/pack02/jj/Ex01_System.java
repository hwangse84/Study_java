package pack02.jj;

public class Ex01_System {
public static void main(String[] args) {
	//[a][b][c] read,read....
	//System.out<=OutPutStream의 노드 스트림
	System.out.write(65);
	System.out.write(65);
	System.out.write(65);
	System.out.write(65);
	
	
	System.out.flush();//꼭 써야 비울수 있다!!!
	//스트림 버퍼에 저장되어 있는데이터를 강제로 출력(flush)
	//기본적으로 출력(out)스트림은 버퍼(저장공간)데이턱ㅏ 가득차면 그때 데이터를 출력시킴
	//이 메소드로 강제로 출력을 명한다.(잔여 데이터가 있는 경우 확실하게 비워줌)
	//데이터 공간을 채우고 출력을 하더라도 캐시(임시테이터, 찌꺼기(데이터))가 쌓이기 때문에 flush
	
}
}
