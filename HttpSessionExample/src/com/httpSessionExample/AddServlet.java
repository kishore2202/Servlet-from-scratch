package com.httpSessionExample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/add")
public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		int i=Integer.parseInt((req.getParameter("num1")));
		int j=Integer.parseInt((req.getParameter("num2")));
		int k=i+j;
		HttpSession ses=req.getSession();
		ses.setAttribute("k", k);
		res.sendRedirect("sq?k="+k);
	}

}
