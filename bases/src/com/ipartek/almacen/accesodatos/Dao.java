package com.ipartek.almacen.accesodatos;

public interface Dao<T> {
	/*
	 * El patrón DAO propone separar por completo la lógica de negocio de la lógica para acceder a los datos,
	 * de esta forma, el DAO proporcionará los métodos necesarios para insertar, actualizar, borrar y consultar la información; 
	 * por otra parte, la capa de negocio solo se preocupa por lógica de negocio y utiliza el DAO para interactuar con la fuente de datos.

*/
	
	Iterable<T> obtenerTodos();
	T obtenerPorId(Long id);
	
	T insertar(T objeto);
	T modificar(T objeto);
	void borrar(Long id);
	
	

}
