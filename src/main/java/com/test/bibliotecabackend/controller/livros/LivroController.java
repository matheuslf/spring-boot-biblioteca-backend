package com.test.bibliotecabackend.controller.livros;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.bibliotecabackend.model.Livro;
import com.test.bibliotecabackend.repository.LivroRepository;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/livro")
public class LivroController {

    private final LivroRepository livroRepository;
	
	@ApiOperation(value = "Retorna uma lista de livros")
	@ApiResponses(value = {
        @ApiResponse(code = 200, message = "Retorna a lista de livros"),
        @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
        @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
	@GetMapping
	public List<Livro> obterTodos(){		
		return livroRepository.findAll();
	}

	@ApiOperation(value = "Adiciona um novo livro")
	@PostMapping
	public void adicionarLivro(Livro livro) {
		livroRepository.save(livro);
	}
    
}
