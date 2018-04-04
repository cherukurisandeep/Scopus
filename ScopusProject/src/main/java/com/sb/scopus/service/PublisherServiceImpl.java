package com.sb.scopus.service;

import com.sb.scopus.dao.PublisherDao;
import com.sb.scopus.model.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PublisherServiceImpl implements PublisherService {

    @Autowired
    private PublisherDao publisherDao;

    @Override
    @Transactional
    public void addPublisher(Publisher publisher) {
        publisherDao.addPublisher(publisher);
    }

    @Override
    @Transactional
    public List<Publisher> getAllPublishers() {
        return publisherDao.getAllPublishers();
    }

    @Override
    public void deletePublisher(Integer publilsherId) {

    }

    @Override
    public Publisher getPublisher(int publisherId) {
        return null;
    }

    @Override
    public Publisher updatePublisher(Publisher publisher) {
        return null;
    }
}
