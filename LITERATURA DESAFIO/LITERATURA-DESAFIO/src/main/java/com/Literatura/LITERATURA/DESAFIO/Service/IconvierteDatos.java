package com.Literatura.LITERATURA.DESAFIO.Service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import java.security.Principal;package com.aluracursos.desafio.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
// IMPORTANTE nunca olvidar hacer la implementación de la interface CommandLineRunner
@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DesafioApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Principal principal = new Principal();
        principal.muestraElMenu();

    }
}