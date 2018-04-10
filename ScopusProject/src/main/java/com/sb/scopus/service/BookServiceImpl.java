package com.sb.scopus.service;

import com.sb.scopus.dao.BookDao;
import com.sb.scopus.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    @Transactional
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    @Transactional
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Override
    public void deleteBook(Integer bookId) {
        bookDao.deleteBook(bookId);
    }

    @Override
    public Book getBook(Integer bookId) {
        return bookDao.getBook(bookId);
    }

    @Override
    public Book updateBook(Book book) {
        return bookDao.updateBook(book);
    }
}
