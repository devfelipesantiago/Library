package com.br.library.service.exception;

public class PublisherNotFoundException extends NotFoundException {

  public PublisherNotFoundException() {
    super("Editora não encontrada!");
  }
}