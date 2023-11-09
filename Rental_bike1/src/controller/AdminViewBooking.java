package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BookUser;
import model.User;
import model.UserDao;


@WebServlet("/adminViewBooking")
public class AdminViewBooking extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		

		RequestDispatcher d=request.getRequestDispatcher("adminNav.html");
		d.include(request, response);
		
		
		HttpSession h=request.getSession();
		String uemail=(String) h.getAttribute("uemail");
		String upass=(String) h.getAttribute("upass");
		
		
		
		out.print("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css'>");
		out.print("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js'></script>");
		out.print("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js'></script>");
		
		//Pagination start
		int pId=Integer.parseInt(request.getParameter("pId"));//2
		int total=10;
		
		if(pId==1){}
		else
		{
			pId=pId-1;
			pId=pId*total+1; 
		}
//Pagination end
		
		
		
		
		try {
			ArrayList<BookUser> al2 = new UserDao().getLimitHistory(pId, total);//viewbooking();
			out.print("<table class='table table-bordered'>");
			out.print("<thead>");
			out.print("<tr><th>Sno</th><th>Email</th><th>Bike</th><th>Name</th><th>Date</th><th>Time</th></tr>");
			out.print("</thead>");
			out.print("<tbody>");
			for(BookUser b:al2){
			out.print("<tr><td>"+b.getSno()+"</td><td>"+b.getEmail()+"</td><td>"+b.getBike()+"</td><td>"+b.getName()+"</td><td>"+b.getDate()+"</td><td>"+b.getTime()+"</td></tr>");
			}
			out.print("</tbody>");                                                                                                                                     //<a href='editserv?id="+u.getUid()+"' class='btn btn-primary'>Edit </a>                                                                                                                   
		
		
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		out.print("<a href='adminViewBooking?pId=1'>1</a>&emsp;");
		out.print("<a href='adminViewBooking?pId=2'>2</a>&emsp; ");
		out.print("<a href='adminViewBooking?pId=3'>3</a>&emsp; ");
		out.print("<a href='adminViewBooking?pId=4'>4</a>&emsp; ");
		out.print("<a href='adminViewBooking?pId=5'>5</a>&emsp; ");
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
