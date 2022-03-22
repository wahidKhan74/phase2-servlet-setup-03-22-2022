package com.simplilearn.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WebServlet implements Servlet{

	
	ServletConfig config = null;
	
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println(" -- Servlet is initialized ---");		
	}

	public ServletConfig getServletConfig() {
		return config;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//set response content type
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		// prepare response body
		out.print("<html><body>");
		out.print("<h1>Hello, welcome to servlet program !</h1>");
		out.print("</html></body>");
		
		System.out.println(" -- Servlet request processing is completed! ---");
	}

	public String getServletInfo() {
		return "This is a servlet interfce implementated class";
	}

	public void destroy() {
		System.out.println("-- servlet is destroyed ---");		
	}

}
