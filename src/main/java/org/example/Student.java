package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {
@Id
    private int rollNo;
    private String sname;
    private int age;
    Laptop laptop;
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

    public Laptop getLaptop(){
        return laptop;
    }
    public void setLaptop(Laptop laptop){
        this.laptop=laptop;
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
                ", laptop=" + laptop +
                '}';
    }
}


