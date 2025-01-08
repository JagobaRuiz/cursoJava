package com.ipartex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class IpartexApplication implements CommandLineRunner{
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(IpartexApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Contraseña encriptada: " + passwordEncoder.encode("admin"));
		
	}

}
