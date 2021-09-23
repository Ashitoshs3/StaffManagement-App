package com.relations.tc;

import javax.persistence.*;

@Entity
//@Table(name = "LaptopR")
public class LaptopR {
        @Id
        @Column(name = "lid")
        @GeneratedValue(strategy=GenerationType.TABLE)
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
