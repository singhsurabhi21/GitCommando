package com.sg.training.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class login
 */

@WebServlet("/login")
public class login extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("admin");
		String pass = request.getParameter("admin");
		if (uname.equals("admin") && pass.equals("admin")) {
			//HttpSession session = request.getSession();
			response.sendRedirect("welcome.jsp");
			
		} else {
			response.sendRedirect("login.jsp");
		}
		response.getWriter().append("Served at:").append(request.getContextPath());

	}
}
