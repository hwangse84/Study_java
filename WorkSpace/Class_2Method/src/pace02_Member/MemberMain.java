package pace02_Member;

public class MemberMain {
public static void main(String[] args) {
	Member.sField=10;
	System.out.println(Member.sField);
	Member.sMethod();
	
	Member member = new Member();
	System.out.println(member.iField);
	member.iMethod();
}
}
