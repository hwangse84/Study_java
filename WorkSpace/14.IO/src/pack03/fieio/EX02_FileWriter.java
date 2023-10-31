package pack03.fieio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class EX02_FileWriter {
public static void main(String[] args) throws IOException {
	//텍스트 파일을 쓰는 경우
	//DB가 끊겨서 오류가 날경우, 업로드 해야하는 데이터를 텍스트나 로그로 남겨둠. ,csv
	//java변수 => 텍스트파일로 만들어냄(Out, flush)
	//File 객체를 이용해서 임시로 폴더만 만들고, FileWriter통해 데이터를 쓰는 경우
	//File 객체를 이용해서 임시파일을 만들고, FileWriter를 이용해 쓰는 경우
	//File 객체를 이용해 새 파일을 만들고,...
	
	
	File directory =new File("Ex02_FileWriter");
	if(!directory.exists()) {
		directory.mkdir();
	}
	
//	File directory =new File("Ex02_FileWriter\\file.txt");-다른 방법!!!
//	if(!directory.isFile()) {
//		directory.createNewFile();
//	}
	
	
//	if(!file.exists()) {
//		file.mkdir();//파일이 아니라 디렉토리만 만든다.
//	}
	Writer writer = new FileWriter("Ex02_FileWriter\\file.txt");
	
	//텍스트파일 file.txt에 구구단 2단부터 9단까지 저장시켜보기
	for (int i = 2; i < 10; i++) {
		for (int j = 1; j <10; j++) {
			writer.write(i+"x"+j+"="+(i*j));
		}
		writer.write("\r\n");
	}
	
	
	writer.flush();
	
	
}
}
