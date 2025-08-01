package org.example;

import java.util.Date;

public class AnimalFood {
    public String name;
    public int price;
    public Date expirationDate;
    public int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public AnimalFood(String name, int price, Date expirationDate, int stock) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.stock = stock;
    }
}
