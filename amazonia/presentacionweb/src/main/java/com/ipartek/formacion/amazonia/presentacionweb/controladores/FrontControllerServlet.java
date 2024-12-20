package com.ipartek.formacion.amazonia.presentacionweb.controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.java.Log;

import java.io.IOException;
import java.util.Arrays;

import com.ipartek.formacion.amazonia.entidades.Producto;
import com.ipartek.formacion.amazonia.entidades.Usuario;

import static com.ipartek.formacion.amazonia.presentacionweb.controladores.Globales.*;

@Log
@WebServlet("/fc/*")
public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;
	
	protected String[] partes;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.request = request;
		this.response = response;
		this.session = request.getSession();

		String pathInfo = request.getPathInfo() == null ? "/" : request.getPathInfo();
		partes = pathInfo.split("/");
		log.info(Arrays.toString(partes));


		// response.getWriter().println(Arrays.toString(partes));

		if (partes.length == 0) {
			index();
			return;
		}

		switch (partes[1]) {
		case "detalle" -> detalle();
		case "login" -> login();
		case "logout" -> logout();
		case "admin" -> admin();
		default -> response.setStatus(HttpServletResponse.SC_NOT_FOUND);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private void index() throws ServletException, IOException {
		var productos = anonimoNegocio.listarProductos();

		request.setAttribute("productos", productos);
		reenviar("/index.jsp");
	}

	protected void reenviar(String vista) throws ServletException, IOException {
		request.getRequestDispatcher(VISTAS + vista).forward(request, response);
	}
	
	private void detalle() throws ServletException, IOException {
		// Recibir información de la petición
		String sId = request.getParameter("id");
		Producto producto;

		// Convertir
		// Empaquetar en modelo
		// Lógica de negocio
		if (sId != null) {
			// Convertir
			Long id = Long.parseLong(sId);
			// Empaquetar en modelo
			// Lógica de negocio
			producto = anonimoNegocio.detalleProducto(id);
		} else {
			producto = anonimoNegocio.detalleProducto(partes[2]);
		}

		// Empaquetar información para la vista
		request.setAttribute("producto", producto);

		// Ir a la vista
		reenviar("/detalle.jsp");
	}
	
	private void login() throws ServletException, IOException {
		if ("POST".equals(request.getMethod())) {
			String email = request.getParameter("email");
			String password = request.getParameter("password");

			var usuario = Usuario.builder().email(email).password(password).build();

			var usuarioAutenticado = anonimoNegocio.iniciarSesion(usuario);

			if (usuarioAutenticado != null) {
				session.setAttribute("usuario", usuarioAutenticado);

				redirigir("/");
				return;
			} else {
				request.setAttribute("usuario", usuario);
			}

		}

		request.setAttribute("login", "");

		reenviar("/index.jsp");
	}

	private void logout() throws IOException {
		session.invalidate();

		redirigir("/");
	}

	protected void redirigir(String ruta) throws IOException {
		response.sendRedirect(request.getContextPath() + "/fc" + ruta);
	}
	
	private void admin() throws ServletException, IOException {
		if (partes.length < 3) {
			adminProductos();
			return;
		}

		switch (partes[2]) {
		default -> notFound();
		}
	}

	private void adminProductos() throws ServletException, IOException {
		var productos = adminNegocio.listarProductos();

		request.setAttribute("productos", productos);
		reenviar("/admin/productos.jsp");
	}
	
	private void notFound() {
		response.setStatus(HttpServletResponse.SC_NOT_FOUND);
	}
}