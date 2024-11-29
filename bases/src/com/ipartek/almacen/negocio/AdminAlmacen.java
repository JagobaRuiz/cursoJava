package com.ipartek.almacen.negocio;

import com.ipartek.almacen.pojos.Producto;

public interface AdminAlmacen extends UsuarioNegocio {
	Producto altaProducto(Producto producto);

}
