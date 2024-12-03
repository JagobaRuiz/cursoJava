package com.ipartek.web.servlets;

import java.io.*;
import java.time.LocalTime;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/hola")
public class HolaServlet extends HttpServlet {
	private static final long serialVersionUID = 7928697258329206007L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.printf("""
				<!DOCTYPE html>
					<html>
						<head>
							<title>Saludo</title>
						</head>
						<body>
							<h1>HOLA MUNDO</h1>
							<p>Ejemplo</p>
							<p> Son las %s</p>	
						</body>
					</html>
							
				""", LocalTime.now());
    }
}