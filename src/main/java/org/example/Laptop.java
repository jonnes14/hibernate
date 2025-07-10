package org.example;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Embeddable
@Entity
public class Laptop {
    @Id
    private int lid;
    private int ram;
    private String brand;
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

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", lname='"  + '\'' +
                ", ram='" + ram + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
