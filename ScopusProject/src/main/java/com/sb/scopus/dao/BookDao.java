package com.sb.scopus.dao;

import com.sb.scopus.model.Book;

import java.util.List;

public interface BookDao {

    public void addBook(Book book);

    public List<Book> getAllBooks();

    public void deleteBook(Integer bookId);

    public Book getBook(Integer bookId);

    public Book updateBook(Book book);
}
