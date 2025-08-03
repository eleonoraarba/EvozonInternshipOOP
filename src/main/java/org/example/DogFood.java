package org.example;

import java.util.Date;

public class DogFood extends AnimalFood{
    public DogFood(String name, int price, Date expirationDate, int stock) {
        super(name, price, expirationDate, stock);
    }

    public DogFood() {
    }
}
