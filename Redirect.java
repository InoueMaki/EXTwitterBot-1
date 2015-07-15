package exTwitter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Redirect extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)
						throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain;charset=UTF-8");
		System.out.println("Redirect");
		PrintWriter out = response.getWriter();
		out.println("五秒後にログイン画面に移動します");
		try{
			Thread.sleep(5*1000);
		}catch (InterruptedException e){
			System.err.println("スリープできません");
		}
		
		response.sendRedirect("loginUI.jsp");

	}

}
