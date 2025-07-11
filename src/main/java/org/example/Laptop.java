package org.example;

import jakarta.persistence.*;

import java.util.List;

//@Embeddable
@Entity
public class Laptop {
    @Id
    private int lid;
    private int ram;
    private String brand;
    @ManyToMany(mappedBy = "laptops")
   private List<Student> student;
    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", ram=" + ram +
                ", brand='" + brand + '\'' +
                ", student=" + student +
                '}';
    }
}
