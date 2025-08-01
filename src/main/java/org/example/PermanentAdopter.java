package org.example;

public class PermanentAdopter extends Adopter{

    public PermanentAdopter(String name, int availableMoney, int age, String hairColor, String height) {
        super(name, availableMoney, age, hairColor, height);
    }

    @Override
    public void isForeverAdopter(){
        System.out.println("This is a forever home");
    }
}
