package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test")
public class MyFirstServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
	ServletException, IOException {
	 
		
		PrintWriter writer = response.getWriter();
		LocalDateTime now = LocalDateTime.now();
		int hour = now.getHour();
		System.out.println(hour);
		
		String msg = "";
		
		if(hour<12)
		{
			msg=msg+"GoodMoring";
		}
		else if(hour<16)
		{
			msg=msg+"GoodAfterNoon";
		}
		else if(hour>20)
		{
			msg=msg+"GoodNight";
		}
		writer.println("<h1> welcome..!!</h1>");
		writer.println("<h1> the cuurent date and time is :" +now+"</h1>");
		writer.println("<h1>the cuurent date and time is :" + hour+"</h1>");
		writer.println("<h1>grettings from user"+msg+"</h1>");
		writer.close();
		
	}

}
