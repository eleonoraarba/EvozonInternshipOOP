package org.example;

public class Cat extends Animal{

    public Cat(String name, int age, int healthStatus, int moodLevel, String favoriteFoodName, String favoriteRecreationalActivityName) {
        super(name, age, healthStatus, moodLevel, favoriteFoodName, favoriteRecreationalActivityName);
    }

    public Cat() {
    }

    public void eat(){
        System.out.println("Cat eats");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", healthStatus=" + healthStatus +
                ", moodLevel=" + moodLevel +
                ", favoriteFoodName='" + favoriteFoodName + '\'' +
                ", favoriteRecreationalActivityName='" + favoriteRecreationalActivityName + '\'' +
                '}';
    }
}
