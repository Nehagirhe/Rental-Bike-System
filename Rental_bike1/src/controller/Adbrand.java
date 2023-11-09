package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BrandUser;
import model.User;
import model.UserDao;

@WebServlet("/adbrand")
public class Adbrand extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//String uemail=request.getParameter("uemail");
		//String upass=request.getParameter("upass");
		
		//int no = request.getParameter("no");
		String bname=request.getParameter("bname");
		
		BrandUser b=new BrandUser(bname);
		UserDao db1=new UserDao();
		
		try {
			//int no = Integer.parseInt(no2);

			int a=db1.addbrand(b);
			

			if(a>0){
//				out.print("Bike Brand Added");
//		    	response.sendRedirect("adbrand");
				//request.setAttribute("Bike Brand Added", a);
				request.getRequestDispatcher("brandlist").forward(request, response);

		    	
			}
			else
			{
				out.print("Error!! Bike Brand Not Added");
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
