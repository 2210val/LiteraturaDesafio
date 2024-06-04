package com.Literatura.LITERATURA.DESAFIO;

import java.security.Principal;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner{

	@Autowired
	private AutorRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository);
		principal.mostrarMenu();
	}
}