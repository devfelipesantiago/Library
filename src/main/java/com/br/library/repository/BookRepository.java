package com.br.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.library.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
