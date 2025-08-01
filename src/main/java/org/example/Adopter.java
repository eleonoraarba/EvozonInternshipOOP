package org.example;

public class Adopter {

    public String name;
    public int availableMoney;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(int availableMoney) {
        this.availableMoney = availableMoney;
    }

    public Adopter(String name, int availableMoney) {
        this.name = name;
        this.availableMoney = availableMoney;
    }
}
