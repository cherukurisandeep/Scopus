package com.sb.scopus.service;

import com.sb.scopus.model.Publisher;

import java.util.List;

public interface PublisherService {

    public void addPublisher(Publisher publisher);

    public List <Publisher> getAllPublishers();

    public void deletePublisher(Integer publilsherId);

    public Publisher getPublisher(int publisherId);

    public Publisher updatePublisher(Publisher publisher);
}
