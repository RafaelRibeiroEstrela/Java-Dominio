package com.example.dominio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dominio.services.PaisService;

@SpringBootApplication
public class ApiDominioApplication implements CommandLineRunner{
	
	@Autowired
	private PaisService paisService;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiDominioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(paisService.findByFilter("Brasil", 111L));
	}

	

}
