package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
@Id
    private int rollNo;
    private String sname;
    private int age;
   // @OneToOne
    @ManyToMany
    private List<Laptop> laptops;
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", laptop=" + laptops +
                '}';
    }
}


