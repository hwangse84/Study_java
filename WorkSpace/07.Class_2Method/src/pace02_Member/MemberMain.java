package pace02_Member;

public class MemberMain {
public static void main(String[] args) {
	
	
	Member member = new Member();
	System.out.println(member.iField);
	member.iMethod();
	member.iMethod(0);
	member.iMethod("A");
	member.iMethod("A",1);
	
	
	
	
	
	
	Member.sField=10;
	System.out.println(Member.sField);
	Member.sMethod();
	
}
}
