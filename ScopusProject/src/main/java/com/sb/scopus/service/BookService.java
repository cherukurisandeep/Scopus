package com.sb.scopus.service;

import com.sb.scopus.model.Book;

import java.util.List;

public interface BookService {

    public void addBook(Book book);

    public List<Book> getAllBooks();

    public void deleteBook(Integer bookId);

    public Book getBook(Integer bookId);

    public Book updateBook(Book book);

}
