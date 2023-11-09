package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ContactUser;
import model.UserDao;

@WebServlet("/contactdata")
public class ContactData extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.setContentType("text/html");
     PrintWriter out=response.getWriter();
     
     String cname=request.getParameter("cname");
     String cemail=request.getParameter("cemail");
     String csub=request.getParameter("csub");
     String cmsg=request.getParameter("cmsg");
     
     ContactUser c=new ContactUser(cname,cemail,csub,cmsg);
	 UserDao db3=new UserDao();
	try {
		int a= db3.addcontactdata(c);
		
		if(a>0)
		out.print("<h3>Details Submitted</h3>");
		else
		out.print("<h3>Details Not Submitted</h3>");		
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
