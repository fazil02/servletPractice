package com.FirstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	System.out.println("doget is called");	
	String parameter = request.getParameter("text");
	
	PrintWriter writer = response.getWriter();
	writer.println("welcome "+ parameter);
    
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	System.out.println("dopost is called..");
	String parameter = request.getParameter("text");
	PrintWriter writer = response.getWriter();
	writer.println("welcome "+ parameter);
	}

}
