package com.sb.scopus.service;

import com.sb.scopus.dao.AuthorDao;
import com.sb.scopus.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorDao authorDao;

    @Override
    @Transactional
    public void addAuthor(Author author) {
        authorDao.addAuthor(author);
    }

    @Override
    @Transactional
    public List<Author> getAllAuthor() {
        return authorDao.getAllAuthor();
    }

    @Override
    public void deleteAuthor(Integer authorId) {

    }

    @Override
    public Author getAuthor(Integer authorId) {
        return authorDao.getAuthor(authorId);
    }

    @Override
    public Author updateAuthor(Author author) {
        return authorDao.updateAuthor(author);
    }
}
