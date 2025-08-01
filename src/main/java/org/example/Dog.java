package org.example;

public class Dog extends Animal{

    public Dog(String name, int age, int healthStatus, int moodLevel, String favoriteFoodName, String favoriteRecreationalActivityName, int weight, String color, boolean isAdopted, boolean isHungry, String breed) {
        super(name, age, healthStatus, moodLevel, favoriteFoodName, favoriteRecreationalActivityName, weight, color, isAdopted, isHungry, breed);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void speak() {
        System.out.println("ham-ham");
    }

    @Override
    public void feedCorrectly(AnimalFood animalFood) {
        if(this.age <= 7 && animalFood instanceof JuniorAnimalFood){
            this.setHungry(false);
            int weightAfterEating = this.getWeight() + 1;
            this.setWeight(weightAfterEating);
            System.out.println("Dog ate good.");
        }
        else if(this.age > 7 && animalFood instanceof  SeniorAnimalFood){
            this.setHungry(false);
            int weightAfterEating = this.getWeight() + 1;
            this.setWeight(weightAfterEating);
            System.out.println("Dog ate good.");
        }
        else{
            System.out.println("Food is not ok for this dog.");
        }
    }

}
