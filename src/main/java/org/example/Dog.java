package org.example;

public class Dog extends Animal{

    public Dog(String name, int age, int healthStatus, int moodLevel, String favoriteFoodName, String favoriteRecreationalActivityName) {
        super(name, age, healthStatus, moodLevel, favoriteFoodName, favoriteRecreationalActivityName);
    }
    public Dog() {
    }

    public void eat(){
        System.out.println("Dog eats");
    }
}
