package com.sb.scopus.dao;

import com.sb.scopus.model.Author;
import com.sb.scopus.model.Signature;

import java.util.List;

public interface AuthorDao {

    public void addAuthor(Author author);

    public List<Author> getAllAuthor();

    public void deleteAuthor(Integer authorId);

    public Author getAuthor(Integer authorId);

    public Author updateAuthor(Author author);

}
