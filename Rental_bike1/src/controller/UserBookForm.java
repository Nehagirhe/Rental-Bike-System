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

import model.BookUser;
import model.UserDao;
import model.VehicleUser;

@WebServlet("/userbookform")
public class UserBookForm extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	HttpSession h=request.getSession();
	String uemail=(String) h.getAttribute("uemail");
	String upass=(String) h.getAttribute("upass");

	String vname=request.getParameter("id");
//	VehicleUser v=new VehicleUser(vname);
//	UserDao d=new UserDao();
//	try {
//		d.readonly(v);
//	} 
//	catch (ClassNotFoundException | SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	
	 out.print("<head>");
	out.print("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css'>");
	out.print("<script src='https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js'></script>");
	out.print("<script src='https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js'></script>");
	out.print("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css' rel='stylesheet'>");
	out.print("<script src='https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js'></script>");
out.print("</head>");

out.print("<body>");
    out.print("<h4 style='text-align: center;'>Booking Details</h4>");
    out.print("<div class='container' style='background-color: #e7c34d; padding: 15px'>");
	out.print("<form action='userviewbooking1' method='get' enctype='multipart/form-data'>");
	out.print("<div class='form-group'>");
	out.print("<label for='vemail'>Email-Id</label>");
	out.print("<input type='text' class='form-control' id='vemail'  name='vemail' value='"+h.getAttribute("uemail")+"'readonly>");
	out.print("</div>");
	out.print("<div class='form-group'>");
	out.print("<label for='vname'>Bike</label>");	
     out.print("<input type='text' class='form-control' id='vname'  name='vname' value='"+vname+"'readonly>");  
	out.print("</div>");
	
	
	out.print("<div class='form-group'>");
	out.print(" <label for='uname'>Name</label>");
	out.print("<input type='text' class='form-control' id='uname'  name='uname'>");
	out.print("</div>");
	out.print("<div class='form-group'>");
	out.print("<label for='bookDate'>Booking Date</label>");
	out.print("<input type='date' class='form-control' id='bookDate' name='udate'>");
	out.print("</div>");
	out.print("<div class='form-group'>");
	out.print("<label for='pickTime'>PickUp</label>");
	out.print("<input type='time' class='form-control' id='pickTime' name='utime'>");
	out.print("</div>");
	out.print(" <button type='submit' class='btn btn-primary'>Book</button>");
	out.print(" </form>");
	out.print("</div>");
	out.print("</body>");
	out.print("</html>");
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


//System.out.println(vname);
	//VehicleUser v = new VehicleUser(vname);
//	UserDao d = new UserDao();

//	try {
//	    d.readonly(v);
//	} 
//	catch (ClassNotFoundException | SQLException e) {
//	    e.printStackTrace();
//	}
	//String a;
//	VehicleUser v=new VehicleUser(vname);
//	UserDao d=new UserDao();
//	try {
//		d.readonly(v);
//		v.setVname(vname);
//		
//		
//	} catch (ClassNotFoundException | SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	