package com.sb.scopus.dao;

import com.sb.scopus.model.Publisher;
import com.sb.scopus.model.Signature;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SignatureDaoImpl implements SignatureDao {

    @Autowired
    public SessionFactory sessionFactory;

    @Override
    public void addSignature(Signature signature) {
        sessionFactory.getCurrentSession().saveOrUpdate(signature);
    }

    @Override
    public List<Signature> getAllSignatures()
    {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Signature.class);
        return criteria.list();
    }

    @Override
    public void deleteSignature(Integer signatureId) {

    }

    @Override
    public Signature getSignature(Integer signatureId)
    {
        return (Signature) sessionFactory.getCurrentSession().get(Signature.class,signatureId);
    }

    @Override
    public Signature updateSignature(Signature signature) {
        return null;
    }
}
