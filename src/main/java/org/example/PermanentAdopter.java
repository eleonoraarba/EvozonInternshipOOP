package org.example;

public class PermanentAdopter extends Adopter{
    public PermanentAdopter(String name, int availableMoney) {
        super(name, availableMoney);
    }

    public PermanentAdopter() {
    }

    @Override
    public void isForeverAdopter(){
        System.out.println("This is a forever home");
    }
}
