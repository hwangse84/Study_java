package pack01.list;

import java.util.ArrayList;

public class Ex02_ArrayList {
public static void main(String[] args) {
	ArrayList<Integer>iList =new ArrayList<>();
	boolean isAdd=iList.add(1);//
	iList.add(2);
	iList.add(3);
	iList.add(4);
	iList.add(5);
	iList.add(1,9);//1번을 9로 바꿈.
	
	iList.remove(0);//삭제할때 사용
	System.out.println(iList.get(0)+" "+isAdd);
	System.out.println(iList.contains(1)+"1이 있음.List요소로");
	System.out.println(iList.contains(6)+"6이 없음.List요소로");
//	iList.contains(1);
//	iList.contains(6);
	iList.clear();
	System.out.println(iList.isEmpty()+"isEmpty비어있는지 확인 NULL X");
}
}
