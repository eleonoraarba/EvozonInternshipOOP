package org.example;

public class Duck extends Animal{

    public Duck(String name, int age, int healthStatus, int moodLevel, String favoriteFoodName, String favoriteRecreationalActivityName, int weight, String color, boolean isAdopted, boolean isHungry, String breed) {
        super(name, age, healthStatus, moodLevel, favoriteFoodName, favoriteRecreationalActivityName, weight, color, isAdopted, isHungry, breed);
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

    @Override
    public void feedCorrectly(AnimalFood animalFood) {
        if(this.age <= 8 && animalFood instanceof JuniorAnimalFood){
            this.setHungry(false);
            System.out.println("Duck ate good.");
        }
        else if(this.age >= 8 && animalFood instanceof  SeniorAnimalFood){
            this.setHungry(false);
            System.out.println("Duck ate good.");
        }
        else{
            System.out.println("Food is not ok for this duck.");
        }
    }
}
