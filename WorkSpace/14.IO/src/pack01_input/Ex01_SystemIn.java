package pack01_input;
import java.io.IOException;
import java.io.InputStream;

public class Ex01_SystemIn {
	//IO 사용 필수 주의점 : IoException처리 해야함 ↓
	//API는 만들어진 형태로 사용을 해야함(사용설명서대로 해야함)
	//API는 Application Programming Interface(애플리케이션 프로그램 인터케이스)의 줄임말
public static void main(String[] args) throws IOException {
	//Scanner sc=new Scanner(System.in);//inputStream :키보드를 통해 들어오는 정보 받아옴.
	//System.in :NodeStream :가장 먼저 연결되는 스트림, 외부에서 들어오는 데이터를 받기위한 용도.
	InputStream in =System.in;
	int inData = in.read();//in.read();하면 IoException처리 해야함
	System.out.println((char)inData);
	System.out.println(in.read());
	System.out.println(in.read());
	System.out.println(in.read());
	System.out.println(in.read());
	System.out.println(in.read());
	//inputstream 전체 데이터에 byte 로 저장
	//CR(Carriage Return): 커서를 줄을 맨 앞으로 이동시킴 ==13
	//LF(Line Feed): 커서를 한줄 아래로 이동시킴==10
	
}
}
