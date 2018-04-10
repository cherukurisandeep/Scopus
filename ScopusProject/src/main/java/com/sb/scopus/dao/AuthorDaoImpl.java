package com.sb.scopus.dao;

import com.sb.scopus.model.Author;
import com.sb.scopus.model.Award;
import com.sb.scopus.model.Book;
import com.sb.scopus.model.Signature;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

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
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return criteria.list();
    }

    @Override
    public void deleteAuthor(Integer authorId) {
        Author author = (Author) sessionFactory.getCurrentSession()
                .load(Author.class,authorId);
        if(null != author){
            this.sessionFactory.getCurrentSession().delete(author);
        }

    }

    @Override
    public Author getAuthor(Integer authorId) {
        Author author = (Author) sessionFactory.getCurrentSession().get(Author.class,authorId);
        Hibernate.initialize(author.getBook());
        return author;
    }

    @Override
    public Author updateAuthor(Author author) {
        sessionFactory.getCurrentSession().update(author);
        return author;
    }

    @Override
    public void deleteAuthorAward(Integer authorId, Integer awardId) {
        Author author = (Author) sessionFactory.getCurrentSession()
                .load(Author.class,authorId);

        Award award = (Award) sessionFactory.getCurrentSession()
                .load(Award.class,awardId);
        Set<Award> awards = author.getAwards();
        if(awards.size()>1){
            awards.remove(award);
            sessionFactory.getCurrentSession().save(author);
        }
    }
}
