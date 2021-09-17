package com.user;

import org.hibernate.annotations.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_data")
public class User {
    @Id
    private String Id ;
    private String email;
    private String name ;
    private int number ;
//
//    public User(String email, String name, int number) {
//        this.email = email;
//        this.name = name;
//        this.number = number;
//    }
//
//    public User(String id, String email, String name, int number) {
//        Id = id;
//        this.email = email;
//        this.name = name;
//        this.number = number;
//    }

    public String getId() {
        return Id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
