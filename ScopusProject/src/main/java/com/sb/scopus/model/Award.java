package com.sb.scopus.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "award")
public class Award {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "award_name")
    private String awardName;

    @Column(name = "award_desc")
    private String awardDesc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getAwardDesc() {
        return awardDesc;
    }

    public void setAwardDesc(String awardDesc) {
        this.awardDesc = awardDesc;
    }

    public Set<Author> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Author> employees) {
        this.employees = employees;
    }

    @ManyToMany(mappedBy = "awards")
    private Set<Author> employees =new HashSet<>();
}
