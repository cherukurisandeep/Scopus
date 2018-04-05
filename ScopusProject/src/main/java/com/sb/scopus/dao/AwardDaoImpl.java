package com.sb.scopus.dao;

import com.sb.scopus.model.Author;
import com.sb.scopus.model.Award;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AwardDaoImpl implements AwardDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void addAward(Award award) {
        sessionFactory.getCurrentSession().saveOrUpdate(award);
    }

    @Override
    @Transactional
    public List<Award> getAllAwards() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Award.class);
        return criteria.list();
    }

    @Override
    @Transactional
    public void deleteAward(Integer awardId) {

    }

    @Override
    @Transactional
    public Award getAward(Integer awardId) {
        return (Award) sessionFactory.getCurrentSession().get(Award.class, awardId);
    }

    @Override
    @Transactional
    public Award updateAward(Award award) {
        return null;
    }
}
