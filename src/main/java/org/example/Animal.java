package org.example;

public class Animal {

    public String name;
    public int age;
    public int healthStatus;
    public int moodLevel;
    public String favoriteFoodName;
    public String favoriteRecreationalActivityName;

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

    public Animal(String name, int age, int healthStatus, int moodLevel, String favoriteFoodName, String favoriteRecreationalActivityName) {
        this.name = name;
        this.age = age;
        this.healthStatus = healthStatus;
        this.moodLevel = moodLevel;
        this.favoriteFoodName = favoriteFoodName;
        this.favoriteRecreationalActivityName = favoriteRecreationalActivityName;
    }
}
