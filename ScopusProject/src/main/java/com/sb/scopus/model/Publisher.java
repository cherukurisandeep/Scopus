package com.sb.scopus.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "book_publisher")
public class Publisher implements Serializable {
    public Publisher() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "publisher_name")
    private String publisherName;

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    /*@Override*/
    /*public String toString() {
        return publisherName;
    }*/

    @OneToMany(mappedBy = "publish")
    private List<Book> book;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getNoofBooksPublished() {
        return noofBooksPublished;
    }

    public void setNoofBooksPublished(int noofBooksPublished) {
        this.noofBooksPublished = noofBooksPublished;
    }

    @Column (name = "no_of_books_published")
    private int noofBooksPublished;

}
