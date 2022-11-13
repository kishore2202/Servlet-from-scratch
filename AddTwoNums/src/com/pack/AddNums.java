package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddNums
 */
@WebServlet("/add")
public class AddNums extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
	{
		int i=Integer.parseInt(req.getParameter("name"));
		int j=Integer.parseInt(req.getParameter("pass"));
		int k=i+j;
		
		res.sendRedirect("sq?k="+k);
		
//		req.setAttribute("k",k);
//		PrintWriter out=res.getWriter();
//		out.println("Add result : "+k);
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req, res);
//		PrintWriter out=res.getWriter();
//		out.println("result is "+k);
	}
}
