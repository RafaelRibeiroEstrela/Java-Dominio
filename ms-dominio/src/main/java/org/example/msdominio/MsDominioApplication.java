package org.example.msdominio;

import org.example.msdominio.services.IAreaConhecimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsDominioApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MsDominioApplication.class, args);
    }

    @Autowired
    private IAreaConhecimentoService areaConhecimentoService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(areaConhecimentoService.findAll());
    }
}
