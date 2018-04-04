package com.sb.scopus.service;

import com.sb.scopus.model.Publisher;
import com.sb.scopus.model.Signature;

import java.util.List;

public interface SignatureService {
    public void addSignature(Signature signature);

    public List<Signature> getAllSignatures();

    public void deleteSignature (Integer signatureId);

    public Signature getSignature(Integer signatureId);

    public Signature updateSignature(Signature signature);

}
