package com.ipartek.almacen.accesodatos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collection;
import java.util.TreeMap;

import com.ipartek.almacen.pojos.Producto;

public class DaoProductoTreeMap implements DaoProducto {
	/*
	 * TreeMap es para almacenar en memoria
	 * */
	protected TreeMap<Long, Producto> productos = new TreeMap<>();

	// SINGLETON
	/*
	 * Singleton es un patrón de diseño creacional que garantiza que tan solo exista un objeto de su tipo y
	 * proporciona un único punto de acceso a él para cualquier otro código.*/
	
		/*public static DaoProductoTreeMap getInstancia() {
			return INSTANCIA;
		}

		private static final DaoProductoTreeMap INSTANCIA = new DaoProductoTreeMap();*/
		
		protected DaoProductoTreeMap() {
			for (long i = 1; i <= 10; i++) {
				productos.put(i, Producto.builder().id(i).nombre("Producto " + i).precio(new BigDecimal(i * 10))
						.fechaCaducidad(LocalDate.of(2024, (int) i, (int) i * 2)).build());
			}
		}
		// FIN SINGLETON
		
		public DaoProductoTreeMap(String url, String user, String pass) {
			this();
		}


	@Override
	public Collection<Producto> obtenerTodos() {
		return productos.values();
	}

	@Override
	public Producto obtenerPorId(Long id) {
		return productos.get(id);
	}

	@Override
	public Producto insertar(Producto producto) {
		Long id = productos.size() > 0 ? productos.lastKey() + 1L: 1L;
		producto.setId(id);
		productos.put(id, producto);
		
		return producto;
	}

	@Override
	public Producto modificar(Producto producto) {
		productos.put(producto.getId(), producto);
		return producto;
	}

	@Override
	public void borrar(Long id) {
		productos.remove(id);
		
		
	}

	@Override
	public Iterable<Producto> obtenerPorNombreParcial(String nombre) {
		return productos.values().stream().filter(p -> p.getNombre().contains(nombre)).toList();
	}

	@Override
	public Iterable<Producto> obtenerPorPrecio(BigDecimal minimo, BigDecimal maximo) {
		return productos.values().stream().filter(p -> p.getPrecio().compareTo(minimo) >= 0 && p.getPrecio().compareTo(maximo) <=0).toList();
		//El 0 es para comparar entre BigDecimal
	}
	
	
}
