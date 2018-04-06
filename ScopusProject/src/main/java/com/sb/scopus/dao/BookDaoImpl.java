package com.sb.scopus.dao;

import com.sb.scopus.model.Book;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addBook(Book book) {
        sessionFactory.getCurrentSession().saveOrUpdate(book);
    }

    @Override
    public List<Book> getAllBooks() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Book.class);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return criteria.list();
    }

    @Override
    public void deleteBook(Integer bookId) {

    }

    @Override
    public Book getBook(Integer bookId) {
        return (Book) sessionFactory.getCurrentSession().get(Book.class,bookId);
    }

    @Override
    public Book updateBook(Book book) {
        return null;
    }
}
