package com.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Userdata")
public class  UserMain {
    @Id
    private String Id ;

    private UserName name ;

    private String email;

    private int number ;

    public UserMain() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public UserName getName() {
        return name;
    }

    public void setName(UserName name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "UserMain{" +
                "Id='" + Id + '\'' +
                ", name=" + name +
                ", email='" + email + '\'' +
                ", number=" + number +
                '}';
    }
}
