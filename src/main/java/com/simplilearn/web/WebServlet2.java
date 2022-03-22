package com.simplilearn.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WebServlet2 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		// set response content type
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		// prepare response body
		out.print("<html><body>");
		out.print("<h1>Hello, welcome to Generic servlet program !</h1>");
		out.print("</html></body>");

		System.out.println(" -- Servlet request processing is completed! ---");
	}

}
