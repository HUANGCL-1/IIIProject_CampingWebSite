package login.sumit.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginRegister() {
    
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");  //setup response character encoding type
		response.setContentType("text/html");   //setup response content type
		response.setCharacterEncoding("UTF-8");	
		
	MemberDAO md=new MemberDAOImpl();	
	String mobile=request.getParameter("mobile");
	String password=request.getParameter("password");
//	String name=request.getParameter("name");
//	String nickname=request.getParameter("nickname");
//	String gender=request.getParameter("gender");
//	int birthday=Integer.parseInt(request.getParameter("birthday"));
//	String email=request.getParameter("email");
//	String address=request.getParameter("address");
	
	String submitType=request.getParameter("submit");
	Member m=md.getMember(mobile, password);
	if(submitType.equals("login") && m!=null && m.getMobile()!=null) {
		request.setAttribute("message", m.getMobile());
		request.getRequestDispatcher("welcome.jsp").forward(request, response);
	}else if(submitType.equals("register")) {
		m.setMobile(request.getParameter("mobile"));
		m.setPassword(request.getParameter("password"));
		m.setName(request.getParameter("name"));
		m.setNickname(request.getParameter("nickname"));
		m.setGender(request.getParameter("gender"));
		m.setBirthday(Integer.parseInt(request.getParameter("birthday")));
		m.setEmail(request.getParameter("email"));
		m.setAddress(request.getParameter("address"));	
		md.insertMember(m);
		request.setAttribute("smessage","註冊成功,請登入" );
		request.getRequestDispatcher("login.jsp").forward(request, response);
		
		
		request.setAttribute("message","查無帳號123" );
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}else {
		request.setAttribute("message","帳號密碼有誤 請重新輸入" );
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
		
	
	}

}

