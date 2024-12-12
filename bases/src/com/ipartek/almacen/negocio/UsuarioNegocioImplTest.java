package com.ipartek.almacen.negocio;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ipartek.almacen.fabrica.Fabrica;
import com.ipartek.almacen.pojos.Producto;
import com.ipartek.almacen.pojos.Rol;
import com.ipartek.almacen.pojos.Usuario;

class UsuarioNegocioImplTest {
	private static final Producto PRODUCTO1 = Producto.builder().id(1L).nombre("Cafetera Nespresso")
			.precio(new BigDecimal("50.24")).build();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	UsuarioNegocio negocio = Fabrica.getUsuarioNegocio();

//	@Test
//	void testVerProductos() {
//		fail("Not yet implemented");
//	}

	@Test
	void testBuscarProductosPorId() {
		var producto = negocio.buscarProductosPorId(1L);
		assertNotNull(producto);
		assertEquals(PRODUCTO1, producto);
		
		producto = negocio.buscarProductosPorId(100L);
		assertNull(producto);
		
		assertThrows(NegocioException.class, () -> negocio.buscarProductosPorId(null));
	}
	
	@Test
	void testAutenticar() {
		var usuarioCorrecto = Usuario.builder().email("jagoba@email.com").password("admin").build();

		var jagoba = Usuario.builder().id(1L).email("jagoba@email.com").password("admin").nombre("Jagoba")
				.rol(Rol.builder().id(1L).nombre("ADMIN").descripcion("Administrador").build()).build();

		var resultado = negocio.autenticar(usuarioCorrecto);

		assertNotNull(resultado);
		assertEquals(jagoba, resultado);

		var usuarioPasswordIncorrecto = Usuario.builder().email("jagoba@email.com").password("incorrecta").build();

		resultado = negocio.autenticar(usuarioPasswordIncorrecto);

		assertNull(resultado);

		var usuarioEmailIncorrecto = Usuario.builder().email("email@incorrecto.net").password("incorrecta").build();

		resultado = negocio.autenticar(usuarioEmailIncorrecto);

		assertNull(resultado);
	}

//	@Test
//	void testBuscarProductosPorNombre() {
//		fail("Not yet implemented");
//	}

}
