package com.sb.scopus.model;

import javax.persistence.*;

@Entity
@Table(name = "author_signature")
public class Signature {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSignStmt() {
        return signStmt;
    }

    public void setSignStmt(String signStmt) {
        this.signStmt = signStmt;
    }

    @Column(name = "sign_stmt")
    private String signStmt;


}
