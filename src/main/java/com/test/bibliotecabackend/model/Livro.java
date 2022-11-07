package com.test.bibliotecabackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "tb_livros")
public class Livro {
    
    @ApiModelProperty(value = "Id do livro")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ApiModelProperty(value = "Titulo do livro")
    @Column(length = 100, nullable = false)
    private String titulo;

    @ApiModelProperty(value = "Número de paginas")
    private Integer numeroPaginas;

    @ApiModelProperty(value = "Resumo do livro")
    @Column(length = 100, nullable = false)
    private String resumo;

    @ApiModelProperty(value = "Código ISBN")
    @Column(length = 10, nullable = false)
    private String isbn;
}
