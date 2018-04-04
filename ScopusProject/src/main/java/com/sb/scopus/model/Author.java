package com.sb.scopus.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "author")
public class Author {
    public Author() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "fName")
    private String firstName;

    @Column(name = "lName")
    private String lastName;

    @Column (name = "gender")
    private String gender;

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

   /* @Override
    public String toString() {
        return firstName+lastName;
    }*/

    @OneToMany(mappedBy = "author")
    private List<Book> book ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Signature getSign() {
        return sign;
    }

    public void setSign(Signature sign) {
        this.sign = sign;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sign_id")
    private Signature sign;

    public Set<Award> getAwards() {
        return awards;
    }

    public void setAwards(Set<Award> awards) {
        this.awards = awards;
    }

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "author_awards",
            joinColumns = { @JoinColumn(name = "author_id") },
            inverseJoinColumns = { @JoinColumn(name = "award_id") }
    )
    Set<Award> awards = new HashSet<>();



}
