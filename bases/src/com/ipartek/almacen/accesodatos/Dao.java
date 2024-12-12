package com.ipartek.almacen.accesodatos;

import java.util.Collection;

public interface Dao<T> {
	/*
	 * El patrón DAO propone separar por completo la lógica de negocio de la lógica para acceder a los datos,
	 * de esta forma, el DAO proporcionará los métodos necesarios para insertar, actualizar, borrar y consultar la información; 
	 * por otra parte, la capa de negocio solo se preocupa por lógica de negocio y utiliza el DAO para interactuar con la fuente de datos.

*/
	
	default Collection<T> obtenerTodos() {
		throw new AccesoDatosException("NO IMPLEMENTADO");
	}

	default T obtenerPorId(Long id) {
		throw new AccesoDatosException("NO IMPLEMENTADO");
	}

	default T insertar(T objeto) {
		throw new AccesoDatosException("NO IMPLEMENTADO");
	}

	default T modificar(T objeto) {
		throw new AccesoDatosException("NO IMPLEMENTADO");
	}

	default void borrar(Long id) {
		throw new AccesoDatosException("NO IMPLEMENTADO");
	}
	
	

}
