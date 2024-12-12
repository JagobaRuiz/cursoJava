package com.ipartek.almacen.filtros;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import com.ipartek.almacen.pojos.Usuario;

/**
 * Servlet Filter implementation class AdminFilter
 */
@WebFilter("/admin/*")
public class AdminFilter extends HttpFilter implements Filter {
       
	private static final long serialVersionUID = 8783278588804548765L;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		var req = (HttpServletRequest) request;
		var res = (HttpServletResponse) response;
		
		var session = req.getSession();
		var usuario = (Usuario) session.getAttribute("usuario");
		
		if ((usuario == null || !usuario.getRol().getNombre().equals("ADMIN"))) {
			res.sendRedirect(req.getContextPath() + "/login");
			return;
					
		}
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

}
