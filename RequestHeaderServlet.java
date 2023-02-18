package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class RequestHeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			PrintWriter out = response.getWriter();
			out.println("<body>");
			out.println("<center>");
			out.println("<h1 style ='color;red;text-algin:center;'>Request header info..</h1>");
			out.println("<table border = '1'>");
			out.println("<tr><th>header name</tr> <th>header value</th></tr>");
			
			Enumeration<String> headernames=request.getHeaderNames();
			while(headernames.hasMoreElements())
			{
				out.println("<tr>");
				String headername=(String)headernames.nextElement();
				String value=request.getHeader(headername);
				out.println("<td>"+headername+"</td>");
				out.println("<td>"+value+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("</center>");
			out.println("</body>");
			out.close();
			
	}

}
