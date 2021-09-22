package com.relations.tc;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "StudentR")
public class StudentR {

        @Id
//        @GeneratedValue(strategy=GenerationType.TABLE)
        private int Rollno ;
        private String Fname ;
        private int Marks ;

        @OneToMany
        @JoinColumn(name = "lid")
        private List<LaptopR> laptops ;

    public List<LaptopR> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<LaptopR> laptops) {
        this.laptops = laptops;
    }

//        @OneToOne
//        private LaptopR laptop ;
//
//    public LaptopR getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(LaptopR laptop) {
//        this.laptop = laptop;
//    }

    //        In this below mapping this we are mapping two tables students and laptop
//        @OneToMany(cascade = CascadeType.ALL)
//        @JoinColumn(name = "lid")
//        @OrderColumn(name = "type")
//        private List<LaptopR> Llap ;
//
//    public List<LaptopR> getLlap() {
//        return Llap;
//    }
//
//    public void setLlap(List<LaptopR> llap) {
//        Llap = llap;
//    }

    @Override
        public String toString() {
            return "student{" +
                    "Rollno=" + Rollno +
                    ", Fname='" + Fname + '\'' +
                    ", Marks=" + Marks +
                    '}';
        }

        public StudentR() {
        }

        public int getRollno() {
            return Rollno;
        }

        public void setRollno(int rollno) {
            Rollno = rollno;
        }

        public String getFname() {
            return Fname;
        }

        public void setFname(String fname) {
            Fname = fname;
        }

        public int getMarks() {
            return Marks;
        }

        public void setMarks(int marks) {
            Marks = marks;
        }


}
