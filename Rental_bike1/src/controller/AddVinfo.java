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

import model.UserDao;
import model.VehicleUser;

@WebServlet("/addvinfo")
public class AddVinfo extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	String vbrand=request.getParameter("vbrand");
	int vprice=Integer.parseInt(request.getParameter("vprice"));
	String vname=request.getParameter("vname");
	String mno=request.getParameter("mno");
	String descript=request.getParameter("descript");
	
	VehicleUser v=new VehicleUser(vbrand,vprice,vname,mno,descript);
	UserDao db2 = new UserDao();
	
	try {
		int a=db2.addvehicle(v);
		if(a>0){
			out.print("Vehicle Info Added Successfully!!!");
		//	request.getRequestDispatcher("brandlist").forward(request, response);
			RequestDispatcher d=request.getRequestDispatcher("adminNav.html");
			d.include(request, response);
			out.print("<br>");
					//out.print("<button type='button' class='btn btn-dark'>Dark</button>");
			//out.print("<button type='button' class='btn btn-dark'>Dark</button>");			
			request.getRequestDispatcher("viewvinfo").forward(request, response);
		}
		else{
			out.print("Error!!! Vehicle Info Not Added ");
		}
	} 
	catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

}
