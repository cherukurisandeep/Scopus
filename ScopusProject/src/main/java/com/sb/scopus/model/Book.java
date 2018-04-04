package com.sb.scopus.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "book_name")
    private String bookName;

    public Book() {
    }

    @Column(name = "released_date")

    private int releaseDate;

    @ManyToOne(targetEntity = Author.class)
    @JoinColumn(name = "author_id")
    private Author author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublish() {
        return publish;
    }

    public void setPublish(Publisher publish) {
        this.publish = publish;
    }

    @ManyToOne(targetEntity = Publisher.class)
    @JoinColumn(name = "publisher_id")
    private Publisher publish;

}
