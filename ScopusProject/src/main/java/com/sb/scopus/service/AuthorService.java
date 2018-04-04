package com.sb.scopus.service;

import com.sb.scopus.model.Author;

import java.util.List;

public interface AuthorService {

    public void addAuthor(Author author);

    public List<Author> getAllAuthor();

    public void deleteAuthor(Integer authorId);

    public Author getAuthor(Integer authorId);

    public Author updateAuthor(Author author);

}
