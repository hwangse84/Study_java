package pack03.fieio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_ImageIo {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("img.jpg");//naver ->rgb색상 알수있다
	FileOutputStream fos = new FileOutputStream("imgC.jpg");
	System.out.println(fis.read());
	System.out.println(fis.read());
	System.out.println(fis.read());
	
	int data,cnt =0;
	while((data = fis.read())!=-1) {
		cnt++;
		System.out.println(data);
		fos.write(data);
		
	}
	System.out.println(cnt);
	fos.flush();
}
}
