package com.test.bibliotecabackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.test.bibliotecabackend.model.Livro;
import com.test.bibliotecabackend.repository.LivroRepository;

@SpringBootApplication
public class BibliotecaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaBackendApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(LivroRepository livroRepository) {
		return args -> {
			livroRepository.deleteAll();

			Livro livro = new Livro();
			livro.setTitulo("Flamengo campeão");
			livro.setResumo("História do Flamengo");
			livro.setNumeroPaginas(100);
			livro.setIsbn("123456");
			
			livroRepository.save(livro);
		};
	}

}
