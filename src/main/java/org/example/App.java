package org.example;

import java.util.Date;

public class App {
    public static void main(String[] args) {

        //Adopter adopter = new Adopter("Eli", 300);
        //Animal animal = new Animal("Cutu", 6,10,8,"RoyalCanin", "Innot");
        Date expirationDate = new Date(2028, 8, 22);
        //AnimalFood animalFood = new AnimalFood("Royal Canin", 50, expirationDate, 10);

        RecreationalActivity recreationalActivity = new RecreationalActivity("Innot");
        Veterinarian veterinarian = new Veterinarian("Dr Ana", "Pneumolog");
        //Game game = new Game(adopter, animal, veterinarian);

//        Adopter adopter1 = new Adopter();
//        adopter1.setAvailableMoney(500);
//        adopter1.setName("Ana");

//        Animal animal1 = new Animal();
//        animal1.setAge(15);
//        animal1.setName("Pisi");
//        animal1.setMoodLevel(5);
//        animal1.setHealthStatus(3);
//        animal1.setFavoriteFoodName("PisiFood");
//        animal1.setFavoriteRecreationalActivityName("SomnPufos");

//        AnimalFood animalFood1 = new AnimalFood();
//        animalFood1.setName("Wiskas");
//        animalFood1.setPrice(50);
//        animalFood1.setStock(15);
//        animalFood1.setExpirationDate(new Date(2027, 7, 11));

        RecreationalActivity recreationalActivity1 = new RecreationalActivity();
        recreationalActivity1.setName("Plimbare");

        Veterinarian veterinarian1 = new Veterinarian();
        veterinarian1.setName("Dr Mara");
        veterinarian1.setSpecialization("Cardiolog");

//        Game game1 = new Game();
//        game1.setAdopter(adopter1);
//        game1.setAnimal(animal1);
//        game1.setVeterinarian(veterinarian1);

        Cat cat1 = new Cat("MiuMiu", 12, 3, 7, "PisiFood", "Plimbare", 10, "Black", false, false);
        System.out.println(cat1);

        Dog dog1 = new Dog("Azorel", 13, 2, 7,"Treats", "Play", 11, "Brown",false, false);
        dog1.setName("Azor");

        TemporaryAdopter temporaryAdopter = new TemporaryAdopter();
        temporaryAdopter.setName("Mimi");
        temporaryAdopter.setAvailableMoney(200);
        temporaryAdopter.setAdoptionStartDate( new Date(2025,8,11));
        temporaryAdopter.setAdoptionEndDate( new Date(2025,12,1));
        System.out.println(temporaryAdopter);

        PermanentAdopter permanentAdopter = new PermanentAdopter();
        permanentAdopter.setName("Lili");
        permanentAdopter.setAvailableMoney(1000);

        SeniorAnimalFood seniorAnimalFood = new SeniorAnimalFood();
        seniorAnimalFood.setForJointSupport(true);
        seniorAnimalFood.setName("Jointi");
        seniorAnimalFood.setPrice(150);
        seniorAnimalFood.setStock(70);
        seniorAnimalFood.setExpirationDate(new Date(2030,11,2));

        cat1.eat();
        dog1.eat();
        permanentAdopter.isForeverAdopter();
        //adopter1.isForeverAdopter();


        System.out.println(seniorAnimalFood.isExpired());

        AnimalFood pisiFood = new SeniorAnimalFood("PisiFood", 200, new Date(2029,11,2), 2, true);

        cat1.increaseMoodLevel(recreationalActivity1, pisiFood);
        cat1.feedCorrectly(pisiFood);
    }
}