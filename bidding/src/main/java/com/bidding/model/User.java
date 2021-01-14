package com.bidding.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String value;

    public User() {
    }

    public User(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int itemId() {
        return id;
    }

    public String bidValue() {
        return value;
    }
}
