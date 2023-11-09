package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserDao;

@WebServlet("/loginserv")
public class LoginServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		String upass=request.getParameter("upass");
		String uemail=request.getParameter("uemail");
		//String urole=request.getParameter("urole");
		
		HttpSession h=request.getSession();
		h.setAttribute("uemail", uemail);
		h.setAttribute("upass", upass);
		

//		boolean a;
//		
//		try {
//			a=new UserDao().checkuser(uemail,upass);
//			if(a)
//			{
//
//				out.print("Visit Profile");
//				request.getRequestDispatcher("profileserv").forward(request, response);
//				}
//				else{
//				out.print("visit register");
//				request.getRequestDispatcher("regserv").forward(request,response);
//				
//				}
		        
		        //request.getRequestDispatcher("regserv").include(request,response);
		    	

		String urole;
		

		try {
			
			urole=new UserDao().checkuser(request.getParameter("uemail"),request.getParameter("upass"));
			System.out.print("Role="+urole);
			if(urole != null)
			{
				
				if(urole.equals("Admin")){
				out.print("Visit Profile");
//				RequestDispatcher d=request.getRequestDispatcher("home.html");
//				d.include(request, response);
				
				request.getRequestDispatcher("home.html").forward(request, response);
				
				
				}
				else if(urole != null && urole.equals("User")){
				//  RequestDispatcher d=request.getRequestDispatcher("userhome.html");
//					d.include(request, response);

					request.getRequestDispatcher("userhome.html").forward(request, response);
					
				}
		
			}
				else{
					out.print("Please check your Email And Password");
				}
		
		
		
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
					
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
