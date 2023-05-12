package com.demoservelet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/add")
public class AddServelet extends HttpServlet {
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
{
	int i=Integer.parseInt(req.getParameter("num1"));
	int j=Integer.parseInt(req.getParameter("num2"));
	int k=i+j;
	System.out.println("result is "+k);
	req.setAttribute("k", k);
	PrintWriter out =res.getWriter();
	out.println("result is "+ k);
	
	HttpSession session=req.getSession();
	session.setAttribute("k", k);	 
	
	Cookie cookie=new Cookie("k",k+"");
	res.addCookie(cookie);
	
	res.sendRedirect("sq");
	res.sendRedirect("sq?k="+k);  //url rewritting
//	
	
	RequestDispatcher rd=req.getRequestDispatcher("sq");
	rd.forward(req, res);
//	
//	
	
}
}
