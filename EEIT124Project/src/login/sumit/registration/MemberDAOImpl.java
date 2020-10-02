package login.sumit.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAOImpl implements MemberDAO {
	
	static Connection con;
	static PreparedStatement pstmt;
	@Override
	public int insertMember(Member m) {
		int status=1;
		try {
			con=MyCp.getCon();
			pstmt=con.prepareStatement("insert into member values(?,?,?,?,?,?,?,?)");
			pstmt.setString(1, m.getMobile());
			pstmt.setString(2,m.getPassword());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getNickname());
			pstmt.setString(5, m.getGender());
			pstmt.setInt(6, m.getBirthday());
			pstmt.setString(7, m.getEmail());
			pstmt.setString(8, m.getAddress());
			status=pstmt.executeUpdate();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return status;
	}

	@Override
	public Member getMember(String mobile,String password) {
		Member m=new Member();
		
		try {
			con=MyCp.getCon();
			pstmt=con.prepareStatement("select* from member where mobile=? and password=?");
			pstmt.setString(1, mobile);
			pstmt.setString(2, password);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
				m.setMobile(rs.getString(1));
				m.setPassword(rs.getString(2));
				m.setName(rs.getString(3));
				m.setNickname(rs.getString(4));
				m.setGender(rs.getString(5));
				m.setBirthday(rs.getInt(6));
				m.setEmail(rs.getString(7));
				m.setAddress(rs.getString(8));
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return m;
	}

}
