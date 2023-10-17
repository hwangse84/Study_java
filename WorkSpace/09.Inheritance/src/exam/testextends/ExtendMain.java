package exam.testextends;

public class ExtendMain {
public static void main(String[] args) {
	//parent_Class의 모든 멤버에 접근해서 출력 또는  호출 해보기
	Prent_Class parent = new Prent_Class();//인스턴스화:
	               //인스턴스 멤버가 모두 메모리에 올라가야 사용할수 있다
	System.out.println(parent.parent_field1);
	System.out.println(parent.parent_field2);
	    //System.out.println(parent.parent_field3); private: 접근제한(외부로부터 접근할수x)
	parent.parentMethod();

	
	Child_Class child = new Child_Class();
	System.out.println(child.child_field);
	System.out.println(child.parent_field1);
	System.out.println(child.parent_field2);
	child.parentMethod();

	child.childMethod();
}
}