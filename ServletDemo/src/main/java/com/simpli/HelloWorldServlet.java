package com.simpli;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = { "/HelloWorldservlet", "/abc", "/xyz" })

public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Hello World, from Servlet [GET]!!");
		out.println("I am running on :" + getServletContext().getServerInfo());
		out.println("I am running on port number :" + request.getServerPort());
		out.println("My name is :" + getServletName());
		getServletContext().setAttribute("no_of_apples",10);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Hello World, from Servlet!! [POST]");
		out.println("I am running on :" + getServletContext().getServerInfo());
		out.println("I am running on port number :" + request.getServerPort());

		out.println("My name is :" + getServletName());	
		getServletContext().setAttribute("no_of_apples",10);

	}

}
