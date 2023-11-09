//package controller;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//@WebServlet("/adminProfile")
//public class AdminProfile extends HttpServlet {
//	
//  
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		
//		HttpSession h=request.getSession();
//		String uemail=(String) h.getAttribute("uemail");
//		String upass=(String) h.getAttribute("upass");
//
//		out.print("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css' rel='stylesheet'>");
//		out.print("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js'></script>");
//
//		out.print("	<nav class='navbar navbar-expand-sm bg-dark navbar-dark'>");
//		out.print("	  <div class='container-fluid'>");
//		out.print("	    <button class='navbar-toggler' type='button' data-bs-toggle='collapse' data-bs-target='#collapsibleNavbar'>");
//		out.print("	  <span class='navbar-toggler-icon'></span>");
//		out.print("	    </button>");
//		out.print("	    <div class='collapse navbar-collapse' id='collapsibleNavbar'>");
//		out.print("	      <ul class='navbar-nav'>");
//		out.print("<li class='nav-item'>");
//		out.print(" <a class='nav-link' href='home.html'>Home</a>");
//		out.print("</li>");
//		out.print("<li class='nav-item'>");
//		out.print("<a class='nav-link' href='#'>About</a>");
//		out.print("</li>");
//		out.print("<li class='nav-item'>");
//		out.print("<a class='nav-link' href='userlist?pId=1'>UserList</a>");
//		out.print("</li> ");
//		out.print("<li class='nav-item'>");
//		out.print("<a class='nav-link' href='adminViewBooking'>Booking History</a>");
//		out.print("</li> ");
//		out.print("<li class='nav-item dropdown'>");
//		out.print("<a class='nav-link dropdown-toggle' href='#' role='button' data-bs-toggle='dropdown'>Brand</a>");
//		out.print("	<ul class='dropdown-menu'>");
//		out.print("<li><a class='dropdown-item' href='brandform.html'>Brand ADD</a></li>");
//		out.print("<li><a class='dropdown-item' href='brandlist'>View Brand</a></li>");
//		out.print("</ul>");
//		out.print("</li>");
//		out.print("<li class='nav-item'>");
//		out.print("<a class='nav-link' href='bikeinfo.html'>Add Vehicle</a>");
//		out.print("</li>");
//		out.print("<li class='nav-item'>");
//		out.print("<a class='nav-link' href='viewvinfo'>View Bike Info</a>");
//		out.print("</li>");
//		out.print("	       ");
//		out.print("</ul>");
//		
//		out.print("<ul class='navbar-nav ms-auto'>");
//		out.print("<li class='nav-item dropdown'>");
//		out.print("<a class='nav-link dropdown-toggle' href='#' role='button' data-bs-toggle='dropdown'>Guest</a>");
//		out.print("<ul class='dropdown-menu'>");
//		out.print("<li><a class='dropdown-item' href='adminlogout'>logout</a></li>");
//		out.print("</ul>");
//		out.print("</li>");
//		out.print("</ul>   ");
//		out.print("</div>");
//		out.print("</div>");
//		out.print("	</nav>");
//		out.print("<img src='bike.jpg' style='width: 100%; height: 60%'>");
//		out.print("");
//
//	
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
