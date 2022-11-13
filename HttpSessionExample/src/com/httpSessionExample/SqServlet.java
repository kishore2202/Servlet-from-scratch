package com.httpSessionExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SqServlet
 */
@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		HttpSession ses=req.getSession();
		int k=(int)ses.getAttribute("k");
		k=k*k;
		PrintWriter out=res.getWriter();
		out.println("Result : "+k);
	}
}
