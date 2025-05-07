package com.br.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.library.entity.BookDetail;

@Repository
public interface BookDetailRepository extends JpaRepository<BookDetail, Long> {

}