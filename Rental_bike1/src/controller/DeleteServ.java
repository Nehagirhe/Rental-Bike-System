package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserDao;

@WebServlet("/deleteserv")
public class DeleteServ extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		//HttpSession h=request.getSession();
		//String uemail= (String) h.getAttribute("uemail");
		//String upass= (String) h.getAttribute("upass");
		
		int uid=Integer.parseInt(request.getParameter("id"));
		int a;
		try {
			a =new UserDao().DeleteUser(uid);
			if(a>0)
			{
				request.setAttribute("message", "User Deleted!");
				
				
				request.getRequestDispatcher("userlist").forward(request,response);
			
			
			}
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
