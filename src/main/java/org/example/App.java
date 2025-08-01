package org.example;

import java.util.Date;

public class App {
    public static void main(String[] args) {

        Adopter adopter = new Adopter("Eli", 300);
        Animal animal = new Animal("Cutu", 6,10,8,"RoyalCanin", "Innot");
        Date expirationDate = new Date(2028, 8, 22);
        AnimalFood animalFood = new AnimalFood("Royal Canin", 50, expirationDate, 10);

        RecreationalActivity recreationalActivity = new RecreationalActivity("Innot");
        Veterinarian veterinarian = new Veterinarian("Dr Ana", "Pneumolog");
        Game game = new Game(adopter, animal, veterinarian);

        Adopter adopter1 = new Adopter();
        adopter1.setAvailableMoney(500);
        adopter1.setName("Ana");

        Animal animal1 = new Animal();
        animal1.setAge(15);
        animal1.setName("Pisi");
        animal1.setMoodLevel(5);
        animal1.setHealthStatus(3);
        animal1.setFavoriteFoodName("PisiFood");
        animal1.setFavoriteRecreationalActivityName("Somn");

        AnimalFood animalFood1 = new AnimalFood();
        animalFood1.setName("Wiskas");
        animalFood1.setPrice(50);
        animalFood1.setStock(15);
        animalFood1.setExpirationDate(new Date(2027, 7, 11));

        RecreationalActivity recreationalActivity1 = new RecreationalActivity();
        recreationalActivity1.setName("Somn");

        Veterinarian veterinarian1 = new Veterinarian();
        veterinarian1.setName("Dr Mara");
        veterinarian1.setSpecialization("Cardiolog");

        Game game1 = new Game();
        game1.setAdopter(adopter1);
        game1.setAnimal(animal1);
        game1.setVeterinarian(veterinarian1);
    }
}