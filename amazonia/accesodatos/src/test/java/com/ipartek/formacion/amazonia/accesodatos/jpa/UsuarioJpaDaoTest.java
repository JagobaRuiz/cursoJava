package com.ipartek.formacion.amazonia.accesodatos.jpa;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.DriverManager;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.ipartek.formacion.amazonia.accesodatos.UsuarioDao;

import com.ipartek.formacion.amazonia.entidades.Usuario;

class UsuarioJpaDaoTest {
	UsuarioDao dao = new UsuarioJpaDao("com.ipartek.formacion.amazonia.entidades.test", null, null);
	static String url = "jdbc:sqlite:amazonia-test.db?foreign_keys=on";
	static Usuario USUARIO1 = Usuario.builder().id(1L).nombre("Jagoba").email("jagoba@email.com").password("admin").build();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		String sql = """
				DELETE FROM usuarios;
								""";

		var con = DriverManager.getConnection(url);
		var st = con.createStatement();

		st.execute(sql);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}


	@BeforeEach
	void setUp() throws Exception {
		String sql = """
				INSERT INTO usuarios (cliente_id,id,password,email,nombre) VALUES
	 (NULL,1,'admin','jagoba@email.com','Jagoba'),
	 (NULL,2,'pepe','pepe@email.net','Pepe'),
	 (NULL,3,'juan','juan@email.net','Juan');
				""";

		var con = DriverManager.getConnection(url);
		var st = con.createStatement();

		st.execute(sql);
	}

	@AfterEach
	void tearDown() throws Exception {
		setUpBeforeClass();
	}

	@Test
	void testObtenerPorEmail() {
		var usuarioOk = dao.obtenerPorEmail("jagoba@email.com");

		assertNotNull(usuarioOk);
		assertEquals(USUARIO1, usuarioOk);

		var usuarioNoOk = dao.obtenerPorEmail("pedro@email.net");

		assertNull(usuarioNoOk);
	}

}