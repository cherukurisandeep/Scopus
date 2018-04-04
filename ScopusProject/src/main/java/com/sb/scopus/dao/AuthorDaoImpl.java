package com.sb.scopus.dao;

import com.sb.scopus.model.Author;
import com.sb.scopus.model.Signature;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthorDaoImpl implements AuthorDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addAuthor(Author author) {
        sessionFactory.getCurrentSession().saveOrUpdate(author);
    }

    @Override
    public List<Author> getAllAuthor() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Author.class);
        return criteria.list();
    }

    @Override
    public void deleteAuthor(Integer authorId) {

    }

    @Override
    public Author getAuthor(Integer authorId) {
        return (Author) sessionFactory.getCurrentSession().get(Author.class,authorId);
    }

    @Override
    public Author updateAuthor(Author author) {
        return null;
    }
}
