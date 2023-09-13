package pack02.variabletype;

public class Ex05_Escape {
public static void main(String[] args) {
	//Escape문자 왜쓸까?
	//문자열 내부에 더블 코테이션을 콘솔에 출력하고싶음. "<-불가능함.
	//출력을 할 수 없느 문자나 명령어르 통해서 문자열 정리등의 기능이 가능한것
 String str_v="\"자바\"를 좋아합니다..";//(\로 구분하여 가능하게함)
 	System.out.println(str_v);///////
 	//tab 	
 	System.out.println("번호\t이름\t직업  혈액형");
	System.out.println("d:\\folder\\..");
	//ln : line new(새글에 글을 출력)
	System.out.print("프린트?n");
	System.out.println("프린트라 뭘까?In은뭐고");
	
	
	System.out.println("\\\t/\\");
	System.out.println(" )\t( ')");
	System.out.println(" (\t/)");
	System.out.println(" \\   (__)|");
}
}
