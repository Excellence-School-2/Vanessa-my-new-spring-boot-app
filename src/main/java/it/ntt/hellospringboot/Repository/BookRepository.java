package it.ntt.hellospringboot.Repository;

import org.springframework.data.repository.CrudRepository;

import it.ntt.hellospringboot.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{}
