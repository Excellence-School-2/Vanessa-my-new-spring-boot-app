package it.ntt.hellospringboot.Repository;

import org.springframework.data.repository.CrudRepository;

import it.ntt.hellospringboot.model.Author;

public interface AuthorRespository extends CrudRepository<Author, Long>{}
