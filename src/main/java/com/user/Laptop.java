package com.user;

import javax.persistence.*;

@Embeddable
public class Laptop {
    @Id
    @Column(name = "lid")
    private int lid ;
    @Column(name = "lname")
    private String lname ;
    @Column(name = "price")
    private double price ;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", lname='" + lname + '\'' +
                ", price=" + price +
                '}';
    }
}


