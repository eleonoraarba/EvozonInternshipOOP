package org.example;

import java.util.Date;

public class App {
    public static void main(String[] args) {

        Adopter girl = new PermanentAdopter("Ana", 200, 7, "Red", "small");
        System.out.println(girl);

        Dog dog = new Dog("", 2, 1, 1,"", "", 5, "Yellow", false, false, "Labrador half-breed");
        girl.adopt(dog);
        girl.nameAnimal(dog, "Cutu");

        JuniorAnimalFood cutuFood = new JuniorAnimalFood("CutuFood", 40, new Date(2028, 11, 2), 5);
        dog.setFavoriteFoodName("CutuFood");

        WetDogFood wetDogFood = new WetDogFood("WetCutuFood", 50, new Date(2028,22,11), 10);
        SpecialDogFood specialDogFood = new SpecialDogFood("SpecialDogoFood", 90, new Date(2029,11,2), 14);


        girl.feedAnimal(dog,wetDogFood);
        girl.feedAnimal(dog,wetDogFood);
        System.out.println(dog.getWeight());

        girl.playWithAnimal(dog);
        girl.playWithAnimal(dog);

        Veterinarian veterinarian = new Veterinarian("Dr Ana", "General");
        veterinarian.vaccinateAnimal(dog);
        veterinarian.disinfestationAnimal(dog);

        VeteranianAssistent veteranianAssistent = new VeteranianAssistent("Asistenta Dana", veterinarian);

        veteranianAssistent.petAnimal(dog);

        girl.wakeUp();
        girl.feedAnimal(dog, specialDogFood);
        girl.walkAnimal(dog);
        dog.sleep();
        girl.doHomework();
        dog.wakeUp();
        girl.playWithAnimal(dog);
        girl.walkAnimal(dog);
        girl.feedAnimal(dog, specialDogFood);
        dog.sleep();

        System.out.println(dog.getWeight());
        System.out.println(dog.getMoodLevel());
    }
}