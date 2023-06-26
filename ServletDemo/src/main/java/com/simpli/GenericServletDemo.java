package com.simpli;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

public class GenericServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();

		out.println("Hello , from GenericServlet !!");
		int appleCount = (int) getServletContext().getAttribute("no_of_apples");
		out.println("No of apples = " + appleCount);
	}
}
