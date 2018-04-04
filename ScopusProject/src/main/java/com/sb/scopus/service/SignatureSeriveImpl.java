package com.sb.scopus.service;

import com.sb.scopus.dao.SignatureDao;
import com.sb.scopus.model.Signature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class SignatureSeriveImpl implements SignatureService {

    @Autowired
    private SignatureDao signatureDao;

    @Override
    @Transactional
    public void addSignature(Signature signature) {
        signatureDao.addSignature(signature);
    }

    @Override
    @Transactional
    public List<Signature> getAllSignatures() {
        return signatureDao.getAllSignatures();
    }

    @Override
    public void deleteSignature(Integer signatureId) {

    }

    @Override
    public Signature getSignature(Integer signatureId) {
        return signatureDao.getSignature(signatureId);
    }

    @Override
    public Signature updateSignature(Signature signature) {
        return signatureDao.updateSignature(signature);
    }

}
