package exTwitter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sun.rmi.server.Dispatcher;

@SuppressWarnings("serial")
public class Control extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request,
						HttpServletResponse response)
						throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain;charset=UTF-8");
		
		//セッションチェック
		HttpSession session = request.getSession(false);

		Enumeration<String> em = request.getParameterNames();
		ArrayList<String> lst = new ArrayList<String>();
			
		//ページ内のname属性をArrayListに格納
		while(em.hasMoreElements()){
			String name = em.nextElement();
			lst.add(name);
			//System.err.println(name);
		}
			
		PrintWriter out = response.getWriter();
		
		//ログイン
		if(lst.contains("login")){
			User user = new User();
			Boolean auth = false;
			//ユーザ名・パスワード照合
			try{
				String user_name = request.getParameterValues("user_name")[0];
				String password  = request.getParameterValues("password" )[0];
				
				auth=user.checkUser(user_name, password);
			}catch (Exception e){
				System.err.println("ログイン照合できません");
			}
			//ユーザ名とパスワードが一致
			if(auth){
				session = request.getSession(true);
				session.setAttribute("user", "user");
				response.sendRedirect("menuUI.jsp");
			}
			//一致しない
			else{
				request.setAttribute("err","ユーザ名とパスワードが一致しません");
				RequestDispatcher rdisp = request.getRequestDispatcher("loginUI.jsp");
				rdisp.forward(request, response);
			}
		}
		//ログアウト
		else if (lst.contains("ログアウト")){
			response.sendRedirect("Logout");
		}
		//セッション切れ
		else if (null==session || null==session.getAttribute("user")){
			if (null==request.getAttribute("state")){
				response.sendRedirect("redirect.jsp");
			}else{
				response.sendRedirect("loginUI.jsp");
			}
		}
		//画面遷移
		else{
	
			if (lst.contains("メニュー")){
				response.sendRedirect("menuUI.jsp");
			}
			else if (lst.contains("単発")){
				out.println("単発");
			}
			else if (lst.contains("定期")){
				out.println("定期");
			}
		
			
		}
	}
	
	
	
	
		
	//中身はdoPostと一緒
	@Override
	public void doGet(HttpServletRequest request,
						HttpServletResponse response)
						throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain;charset=UTF-8");
		
		//セッションチェック
		HttpSession session = request.getSession(false);

		Enumeration<String> em = request.getParameterNames();
		ArrayList<String> lst = new ArrayList<String>();
			
		//ページ内のname属性をArrayListに格納
		while(em.hasMoreElements()){
			String name = em.nextElement();
			lst.add(name);
			//System.err.println(name);
		}
			
		PrintWriter out = response.getWriter();
		
		//ログイン
		if(lst.contains("login")){
			User user = new User();
			Boolean auth = false;
			//ユーザ名・パスワード照合
			try{
				String user_name = request.getParameterValues("user_name")[0];
				String password  = request.getParameterValues("password" )[0];
				
				auth=user.checkUser(user_name, password);
			}catch (Exception e){
				System.err.println("ログイン照合できません");
			}
			//ユーザ名とパスワードが一致
			if(auth){
				session = request.getSession(true);
				session.setAttribute("user", "user");
				response.sendRedirect("menuUI.jsp");
			}
			//一致しない
			else{
				request.setAttribute("err","ユーザ名とパスワードが一致しません");
				RequestDispatcher rdisp = request.getRequestDispatcher("loginUI.jsp");
				rdisp.forward(request, response);
			}
		}
		//ログアウト
		else if (lst.contains("ログアウト")){
			response.sendRedirect("Logout");
		}
		//セッション切れ
		else if (null==session || null==session.getAttribute("user")){
			response.sendRedirect("loginUI.jsp");
		}
		//画面遷移
		else{
	
			if (lst.contains("メニュー")){
				response.sendRedirect("menuUI.jsp");
			}
			else if (lst.contains("単発")){
				out.println("単発");
			}
			else if (lst.contains("定期")){
				out.println("定期");
			}
		
			
		}
	}
	
}
