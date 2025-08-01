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
    }
}