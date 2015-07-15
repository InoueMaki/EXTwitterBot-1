package exTwitter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class Logout extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
				throws ServletException,IOException{
		
		HttpSession session = request.getSession(false);
		//session削除
		if(null != session){
			session.invalidate();
		}
		request.setAttribute("state", "close");
		response.sendRedirect("Control");
		//response.sendRedirect("Control");
	}

}
