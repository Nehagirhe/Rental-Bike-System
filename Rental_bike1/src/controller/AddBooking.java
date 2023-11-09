//package controller;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.SQLException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import model.BookUser;
//import model.UserDao;
//
//@WebServlet("/addbook")
//public class AddBooking extends HttpServlet {
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
////		RequestDispatcher d=request.getRequestDispatcher("adminNav.html");
////		d.include(request, response);
////		
//		
//		response.setContentType("text/html");
//        PrintWriter out=response.getWriter();
//
//        RequestDispatcher d=request.getRequestDispatcher("userNav.html");
//		d.include(request, response);
//
//        
//        HttpSession h=request.getSession();
//        String uemail=(String) h.getAttribute("uemail");
//        String upass=(String) h.getAttribute("upass");
////
////      RequestDispatcher d=request.getRequestDispatcher("AdminNav.html");
////      d.include(request, response);
//
//
////RequestDispatcher d=request.getRequestDispatcher("adminNav.html");
////d.include(request, response);
////int sno=Integer.parseInt(request.getParameter("sno"));
//    String email=request.getParameter("vemail");
//    String bike=request.getParameter("vname");
//    String name=request.getParameter("uname");
//    String date=request.getParameter("udate");
//    String time=request.getParameter("utime");
//    
//    out.print("Email : "+email);
//    out.println("name :"+name);
//    out.println("Date :"+date);
//    out.println("Time :"+time);
//    
////BookUser b=new BookUser(name,date,time);
//    BookUser b=new BookUser(email,bike,name,date,time);
//    UserDao db4=new UserDao();
//
//
//
//	try {
//		int a=db4.adbooking(b);
//		if(a>0)
//		{
//			System.out.println("data added");//
//			out.print("data added");
//		}
//		else{
//			out.print("data not added");
//		}
//	} 
//	catch (ClassNotFoundException | SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//} 
//
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
