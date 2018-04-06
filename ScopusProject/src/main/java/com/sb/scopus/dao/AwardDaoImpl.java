package com.sb.scopus.dao;

import com.sb.scopus.model.Author;
import com.sb.scopus.model.Award;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AwardDaoImpl implements AwardDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addAward(Award award) {
        sessionFactory.getCurrentSession().saveOrUpdate(award);
    }

    @Override
    public List<Award> getAllAwards() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Award.class);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return criteria.list();
    }

    @Override
    public void deleteAward(Integer awardId) {

    }

    @Override
    public Award getAward(Integer awardId) {
        return (Award) sessionFactory.getCurrentSession().get(Award.class, awardId);
    }

    @Override
    public Award updateAward(Award award) {
        return null;
    }

    @Override
    public List<Award> getAwardsWithOutAuthorId(Integer authorId) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Author.class);
        criteria.add(Restrictions.ne("author_id",authorId));
        return criteria.list();
    }
}
