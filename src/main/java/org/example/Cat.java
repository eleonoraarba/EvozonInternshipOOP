package org.example;

public class Cat extends Animal{

    public Cat(String name, int age, int healthStatus, int moodLevel, String favoriteFoodName, String favoriteRecreationalActivityName, int weight, String color, boolean isAdopted, boolean isHungry, String breed) {
        super(name, age, healthStatus, moodLevel, favoriteFoodName, favoriteRecreationalActivityName, weight, color, isAdopted, isHungry, breed);
    }

    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    @Override
    public void speak() {
        System.out.println("miu-miu");
    }

    @Override
    public void feedCorrectly(AnimalFood animalFood) {
        if(this.age <= 11 && animalFood instanceof JuniorAnimalFood){
                this.setHungry(false);
                System.out.println("Cat ate good.");
        }
        else if(this.age > 11 && animalFood instanceof  SeniorAnimalFood){
            this.setHungry(false);
            System.out.println("Cat ate good.");
        }
        else{
            System.out.println("Food is not ok for this cat.");
        }
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
