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

import model.User;
import model.UserDao;

@WebServlet("/regserv")
public class RegServ extends HttpServlet {
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();

			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			String uemail=request.getParameter("uemail");
			String upass=request.getParameter("upass");
			String ugender=request.getParameter("ugender");
			String urole=request.getParameter("urole");

//			HttpSession h=request.getSession();
//			h.setAttribute("uemail", uemail);
//			h.setAttribute("upass", upass);
//			
			
			
			
			
			
			out.print("<br>Welcome To regserv <br><br><h3>"+uemail+"</h3>");
			
			
			User u=new User(fname,lname,uemail,upass,ugender,urole);		
		
			UserDao db=new UserDao();
		    try {
				int a = db.insert(u);
				
				if(a>0)
				{
					System.out.print("Data Inserted!");
					response.sendRedirect("login.html");
				}
				else
				{
					out.print("Error: Data Not Inserted!");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
