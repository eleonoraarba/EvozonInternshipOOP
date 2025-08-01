package org.example;

public class Veterinarian {

    public String name;
    public String specialization;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Veterinarian(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
}
