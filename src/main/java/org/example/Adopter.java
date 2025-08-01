package org.example;

public abstract class Adopter {

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

    public Adopter() {
    }

    public abstract void isForeverAdopter();

    public void adopt(Animal animal){
        if(!animal.isAdopted()){
            animal.setAdopted(true);
        }
        else{
            System.out.println("The animal is already adopted!");
        }
    }
}
