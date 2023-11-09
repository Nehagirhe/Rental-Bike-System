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

import model.BrandUser;
import model.UserDao;
import model.VehicleUser;

@WebServlet("/bikeinform")
public class bikeinform extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out =response.getWriter();
	
	RequestDispatcher d=request.getRequestDispatcher("adminNav.html");
	d.include(request, response);
	//BrandUser b=request.getParameter();
	//BrandUser bu=new BrandUser(b);
	
	out.print("<html>");
	out.print("<head>");
	out.print("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>");
	out.print("</head>");
	out.print("<body>");
	out.print("<div class='container mt-5 bg-warning p-3'>");
	out.print("<form action='addvinfo'>");
	out.print("<h2>Bike Info</h2>");
	out.print("<hr>");
	out.print("<br>");
	out.print("<div class='form-group'>");
	out.print("<label for='vbrand'>Brand:</label>");
	
	try {
		ArrayList<BrandUser> bl = new UserDao().Brand();
		out.print("<select class='form-control' id='vbrand' name='vbrand'>");
		
		for(BrandUser b:bl){
//			out.print("<tr><td>"+b.getNo()+"</td><td>"+b.getBname()+"</td></tr>");
			out.print("<option value='Brand1'>"+b.getBname()+"</option>");
			
		}
	} 
	catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
//	out.print("<option value='Brand2'>Brand 2</option>");
//	out.print("<option value='Brand3'>Brand 3</option>");
//	out.print("<option value='Brand4'>Brand 4</option>");
	out.print("</select>");
	out.print("</div>");
	out.print("<div class='form-group'>");
	out.print(" <label for='vprice'>Price:</label>");
	out.print("<input type='text' class='form-control' id='vprice' name='vprice' placeholder='Enter Price'>");
	out.print("</div>");
	out.print("<div class='form-group'>");
	out.print("<label for='vname'>Bike Name:</label>");
	out.print("<input type='text' class='form-control' id='vname' name='vname' placeholder='Enter Bike Name'>");
	out.print("</div>");
	out.print("  <div class='form-group'>");
	out.print(" <label for='mno'>Model No.:</label>");
	out.print("  <input type='text' class='form-control' id='mno' name='mno' placeholder='Enter Model Number'>");
	out.print(" </div>");
	out.print(" <div class='form-group'>");
	out.print(" <label for='descript'>Description:</label>");
	out.print(" <textarea class='form-control' id='descript' rows='2' name='descript' value=''></textarea>");
out.print(" </div>");
	out.print(" <br><hr><br>");
	out.print(" <button type='submit' class='btn btn-primary'>Submit</button>");
	out.print("</form>");
	out.print("</div>");
	//out.print("</div>");
	out.print("<script src='https://code.jquery.com/jquery-3.5.1.slim.min.js'></script>");
	out.print("<script src='https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js'></script>");
	out.print("<script src='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js'></script>");
	out.print("</body>");
	out.print("</html>");
	

	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
