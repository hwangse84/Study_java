package pack01_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex05_Buffer {
public static void main(String[] args) throws IOException {
	//여러 글자 출력 BufferReader(권장!)
	//BufferReader vs InputStreamReader
	//실제 처리를 Ins(Scanner)는 한글자씩(byte,int) 처리!
	//입력한 글자수만큼 접근이 이루어짐 ->  메모리 소모가 많고 속도 저하, 버그등!
	//이러한 비효율성을 개선해서 여러 글자를 입력하더라도, Buffer라는 
	//공간에 입력을 해놀고 한번에 출력할 수 있는 처리를 지원 ->BufferReader
	//BufferReader는 1024바이틀ㅡㄹ 한번에 처리가 가능하다
	//BufferReader>InputStreamReader>InputStream(노드 스트림)
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String data = br.readLine();
		System.out.println(data);
		br.close();
		Scanner sc =new Scanner(System.in);
		sc.nextLine();
}
}
