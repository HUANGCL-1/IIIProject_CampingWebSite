package login.sumit.registration;

public interface MemberDAO {
	
	public int insertMember(Member m);
	public Member getMember(String mobile,String password);
//	public Member getMember1(String mobile,String password,String name,String nickname,String gender,int birthday,String email,String address);

}