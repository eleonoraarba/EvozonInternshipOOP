package org.example;

public abstract class Animal {

    public String name;
    public int age;
    public int healthStatus;
    public int moodLevel;
    public String favoriteFoodName;
    public String favoriteRecreationalActivityName;
    private  int weight;
    private String color;
    private boolean isAdopted;

    private boolean isHungry;

    public Animal(String name, int age, int healthStatus, int moodLevel, String favoriteFoodName, String favoriteRecreationalActivityName, int weight, String color, boolean isAdopted, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.healthStatus = healthStatus;
        this.moodLevel = moodLevel;
        this.favoriteFoodName = favoriteFoodName;
        this.favoriteRecreationalActivityName = favoriteRecreationalActivityName;
        this.weight = weight;
        this.color = color;
        this.isAdopted = isAdopted;
        this.isHungry = isHungry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(int healthStatus) {
        this.healthStatus = healthStatus;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public String getFavoriteFoodName() {
        return favoriteFoodName;
    }

    public void setFavoriteFoodName(String favoriteFoodName) {
        this.favoriteFoodName = favoriteFoodName;
    }

    public String getFavoriteRecreationalActivityName() {
        return favoriteRecreationalActivityName;
    }

    public void setFavoriteRecreationalActivityName(String favoriteRecreationalActivityName) {
        this.favoriteRecreationalActivityName = favoriteRecreationalActivityName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public void setAdopted(boolean adopted) {
        isAdopted = adopted;
    }

    public Animal() {
    }

    public abstract void eat();
    public abstract void speak();

    public void increaseMoodLevel(RecreationalActivity activityDone, AnimalFood foodEatten){
        if(this.favoriteFoodName.equals(foodEatten.getName()) && this.favoriteRecreationalActivityName.equals(activityDone.getName())){

            System.out.println("Mood level before: " + this.getMoodLevel());
            this.moodLevel +=2;
            System.out.println("Mood level after: " + this.getMoodLevel());
        }
        else{
            System.out.println("No increase in the mood with this conditions.");
        }
    }

    public abstract void feedCorrectly(AnimalFood animalFood);
}
