package org.example;

public class Duck extends Animal{

    public Duck(String name, int age, int healthStatus, int moodLevel, String favoriteFoodName, String favoriteRecreationalActivityName) {
        super(name, age, healthStatus, moodLevel, favoriteFoodName, favoriteRecreationalActivityName);
    }

    public Duck() {
    }

    @Override
    public void eat() {
        System.out.println("Duck eats");
    }

    @Override
    public void speak() {
        System.out.println("mac-mac");
    }
}
