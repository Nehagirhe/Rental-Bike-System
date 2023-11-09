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

import model.UserDao;
import model.VehicleUser;

@WebServlet("/userviewbike")
public class UserViewBike extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out= response.getWriter();
	
	HttpSession h=request.getSession();
	String uemail=(String) h.getAttribute("uemail");
	String upass=(String) h.getAttribute("upass");
	
	
	RequestDispatcher d=request.getRequestDispatcher("userNav.html");
	d.include(request, response);
	
	out.print("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css'>");
	out.print(" <script src='https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js'></script>");
	out.print("<script src='https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js'></script>");
	out.print("<script src='https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js'></script>");

	try {
		ArrayList<VehicleUser> al2 = new UserDao().ViewAllVehicle();
		for( VehicleUser v1 : al2) {
	    	out.print("<div class='container p-3 my-3 bg-dark text-white'>");
	        out.print("<div class='vehicle-info'>");
	        out.print("<p><strong>Brand:</strong> " + v1.getVbrand() + "</p>");
	        out.print("<p><strong>Price:</strong> " + v1.getVprice() + "</p>");
	        out.print("<p><strong>Bike Name:</strong> " + v1.getVname() + "</p>");
	        out.print("<p><strong>Model No:</strong> " + v1.getMno() + "</p>");
	        out.print("<p><strong>Description:</strong> " + v1.getDescript() + "</p>");
	      //out.print("<button type='button' class='btn btn-dark' action='brandvehicle'>Book</button>");
	        out.print("<p><a href='userbookform?id="+v1.getVname()+"' class='btn btn-primary'>"+"Book"+"</a></p>");
	        out.print("</div>");//
	        out.print("</div>");
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
