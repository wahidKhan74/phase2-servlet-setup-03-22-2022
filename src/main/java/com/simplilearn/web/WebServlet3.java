package com.simplilearn.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebServlet3 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// prepare response body
		out.print("<html><body>");
		out.print("<h1>Hello, welcome to Http servlet program !</h1>");
		out.print("</html></body>");

		System.out.println(" -- Servlet request processing is completed! ---");
	}
}
