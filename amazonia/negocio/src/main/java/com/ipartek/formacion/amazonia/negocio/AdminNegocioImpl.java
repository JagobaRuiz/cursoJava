package com.ipartek.formacion.amazonia.negocio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ipartek.formacion.amazonia.accesodatos.ProductoDao;
import com.ipartek.formacion.amazonia.entidades.Producto;
import com.ipartek.formacion.amazonia.fabrica.Fabrica;

import jakarta.validation.Validation;
import jakarta.validation.ValidatorFactory;

public class AdminNegocioImpl extends AnonimoNegocioImpl implements AdminNegocio {
	private static final ProductoDao PRODUCTO_DAO = Fabrica.getProductoDao();
	private static final ValidatorFactory FABRICA_VALIDACION = Validation.buildDefaultValidatorFactory();

	@Override
	public Producto anadirProducto(Producto producto) {
		if(validar(producto)) {
			return PRODUCTO_DAO.insertar(producto);
		} else {
			throw new NegocioException("Producto no válido");
		}
		
	}

	@Override
	public Producto modificarProducto(Producto producto) {
		if(validar(producto)) {
			return PRODUCTO_DAO.modificar(producto);
		} else {
			throw new NegocioException("Producto no válido");
		}
	}
	
	@Override
	public void borrarProducto(Long id) {
		PRODUCTO_DAO.borrar(id);
	}
	
	@Override
	public void borrarProductos(List<Long> ids) {
		PRODUCTO_DAO.borrar(ids);
	}

	
	@Override
	public boolean validar(Producto producto) {
		return errores(producto).isEmpty();
	}
	
	@Override
	public Map<String, String> errores(Producto producto) {
		var validator = FABRICA_VALIDACION.getValidator();
		var constraintViolations = validator.validate(producto);
		var errores = new HashMap<String, String>();

		constraintViolations.stream().forEach(cv -> errores.put(cv.getPropertyPath().toString(), cv.getMessage()));

		return errores;
	}

}
