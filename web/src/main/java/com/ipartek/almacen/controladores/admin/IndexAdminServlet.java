package com.ipartek.almacen.controladores.admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.ipartek.almacen.fabrica.Fabrica;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/admin/index")
public class IndexAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * Recibir datos de petición
		 * Convertir los datos
		 * Empaquetarlos en objetos
		 * Ejecutar la lógica de negocio
		 * */

		var productos = Fabrica.getAdminNegocio().verProductos();
		
		// Empaquetar datos para pantalla
		
		request.setAttribute("productos", productos);
		
		// Mostrar la siguiente pantalla
		
		request.getRequestDispatcher("/WEB-INF/vistas/admin/index.jsp").forward(request, response);
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
