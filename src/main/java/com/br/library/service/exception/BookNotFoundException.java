package com.br.library.service.exception;

public class BookNotFoundException extends NotFoundException {

  public BookNotFoundException() {
    super("Livro não encontrado!");
  }
}
