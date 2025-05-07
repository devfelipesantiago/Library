package com.br.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.library.entity.Author;
import com.br.library.repository.AuthorRepository;
import com.br.library.service.exception.AuthorNotFoundException;

// ... pacote e imports ...

@Service
public class AuthorService {

  private final AuthorRepository authorRepository;

  @Autowired
  public AuthorService(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
  }

  public Author findById(Long id) throws AuthorNotFoundException {
    return authorRepository.findById(id)
        .orElseThrow(AuthorNotFoundException::new);
  }

  public List<Author> findAll() {
    return authorRepository.findAll();
  }

  public Author create(Author author) {
    return authorRepository.save(author);
  }

  public Author update(Long id, Author author) throws AuthorNotFoundException {
    Author authorFromDb = findById(id);

    authorFromDb.setName(author.getName());
    authorFromDb.setNationality(author.getNationality());

    return authorRepository.save(authorFromDb);
  }

  public Author deleteById(Long id) throws AuthorNotFoundException {
    // Pegamos a entidade antes de apagar, para poder retorná-la
    Author author = findById(id);

    authorRepository.deleteById(id);

    return author;
  }
}
