package com.test.bibliotecabackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.bibliotecabackend.model.Livro;


@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}