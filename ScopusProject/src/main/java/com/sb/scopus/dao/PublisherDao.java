package com.sb.scopus.dao;

import com.sb.scopus.model.Publisher;

import java.util.List;

public interface PublisherDao {

    public void addPublisher(Publisher publisher);

    public List<Publisher> getAllPublishers();

    public void deletePublisher(Integer publisherId);

    public Publisher getPublisher(int publisherId);

    public Publisher updatePublisher(Publisher publisher);
}
