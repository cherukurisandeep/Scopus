package com.sb.scopus.dao;

import com.sb.scopus.model.Publisher;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PublisherDaoImpl implements PublisherDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addPublisher(Publisher publisher) {
        sessionFactory.getCurrentSession().saveOrUpdate(publisher);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Publisher> getAllPublishers() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Publisher.class);
        return criteria.list();
    }

    @Override
    public void deletePublisher(Integer publilsherId) {

    }

    @Override
    public Publisher getPublisher(int publisherId) {
        return (Publisher) sessionFactory.getCurrentSession().get(
          Publisher.class,publisherId);
    }

    @Override
    public Publisher updatePublisher(Publisher publisher) {
        return null;
    }
}
