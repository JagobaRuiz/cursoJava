package com.amazonia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amazonia.repositorios.ProductoRepository;
import com.amazonia.servicios.AnonimoService;

@SpringBootApplication
public class AmazoniaspringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AmazoniaspringApplication.class, args);
	}

	@Autowired
	private ProductoRepository repo;
	
	@Autowired
	private AnonimoService anonimoService;
	
	@Override
	public void run(String... args) throws Exception {
		// repo.save(Producto.builder().nombre("Prueba").precio(BigDecimal.ZERO).url("prueba").build());
		
		System.out.println(repo.findByUrl("prueba"));
		
		System.out.println(anonimoService.listarProductos());
	}

}