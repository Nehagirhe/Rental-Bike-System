package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

@WebServlet("/profileserv")
public class ProfileServ extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("Welcome to profile");
		
	 
		 HttpSession h=request.getSession();
			String uemail=(String) h.getAttribute("uemail");
			String upass=(String) h.getAttribute("upass");
		  //  String urole=(String) h.getAttribute("urole");
		 
		
		out.print("<h3>"+uemail+"</h3>");
		//	  
				RequestDispatcher d=request.getRequestDispatcher("adminNav.html");
				d.include(request, response);

//		
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
