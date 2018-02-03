package com.sda.bookstore.model;

import javax.persistence.*;

@Entity
@Table(name="authors")
public class Author {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
