package org.example;

public abstract class Adopter {

    public String name;
    public int availableMoney;

    public int age;
    public String hairColor;
    public String height;

    public Adopter(String name, int availableMoney, int age, String hairColor, String height) {
        this.name = name;
        this.availableMoney = availableMoney;
        this.age = age;
        this.hairColor = hairColor;
        this.height = height;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
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

    public void nameAnimal(Animal animal, String name){
        animal.setName(name);
    }

    @Override
    public String toString() {
        return "Adopter{" +
                "name='" + name + '\'' +
                ", availableMoney=" + availableMoney +
                ", age=" + age +
                ", hairColor='" + hairColor + '\'' +
                ", height='" + height + '\'' +
                '}';
    }

    public void feedAnimal(Animal animal){

        int weightAfterEating = animal.getWeight() + 1;
        animal.setWeight(weightAfterEating);
        int healthStatusAfterEating = animal.healthStatus + 1;
        animal.setHealthStatus(healthStatusAfterEating);
        int moodLevelAfterEating = animal.moodLevel + 1;
        animal.setMoodLevel(moodLevelAfterEating);

        System.out.println("Animal ate.");
    }

    public  void playWithAnimal(Animal animal){
        int weightAfterPlay = animal.getWeight() - 1;
        animal.setWeight(weightAfterPlay);
        int healthStatusAfterPlaying = animal.healthStatus + 1;
        animal.setHealthStatus(healthStatusAfterPlaying);
        int moodLevelAfterPlaying = animal.moodLevel + 1;
        animal.setMoodLevel(moodLevelAfterPlaying);
    }

    public void wakeUp(){
        System.out.println("Morning!");
    }

    public void doHomework(){
        System.out.println("Homework done.");
    }

    public void walkAnimal(Animal animal){

        int moodLevelAfterWalking = animal.getMoodLevel() + 1;
        animal.setMoodLevel(moodLevelAfterWalking);
    }
}
