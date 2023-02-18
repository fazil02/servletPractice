package com.FirstServelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/AddtionServlet")
public class AddtionServlet extends GenericServlet {
	//private static final long serialVersionUID = 1L;

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		int n1=Integer.parseInt(request.getParameter("num1"));
		int n2 =Integer.parseInt(request.getParameter("num2"));
		int n3 = n1+n2;
		
		PrintWriter out = response.getWriter();
		out.println("the result is "+n3);
			
	}


	

}
