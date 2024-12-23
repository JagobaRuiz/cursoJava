package com.ipartek.formacion.amazonia.presentacionweb.controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import static com.ipartek.formacion.amazonia.presentacionweb.controladores.Globales.anonimoNegocio;

import java.io.IOException;

public class AdminControllerServlet extends FrontControllerServlet {
	private static final long serialVersionUID = 1L;

	public void admin() {
		if (partes.length < 3) {
			listadoProductos();
			return;

		}
		switch (partes[2]) {
		case "":
		//default -> notFound();
		}
	}
	
	private void listadoProductos() {
		var productos = anonimoNegocio.listarProductos();

		request.setAttribute("productos", productos);
		//reenviar("/index.jsp");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
