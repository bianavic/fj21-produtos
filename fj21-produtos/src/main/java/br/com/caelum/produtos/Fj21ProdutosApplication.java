package br.com.caelum.produtos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class Fj21ProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Fj21ProdutosApplication.class, args);
	}

}
