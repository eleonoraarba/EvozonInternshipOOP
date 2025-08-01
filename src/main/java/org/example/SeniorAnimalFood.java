package org.example;

import java.util.Date;

public class SeniorAnimalFood extends AnimalFood{

    private boolean isForJointSupport;


    public SeniorAnimalFood(String name, int price, Date expirationDate, int stock, boolean isForJointSupport) {
        super(name, price, expirationDate, stock);
        this.isForJointSupport = isForJointSupport;
    }

    public SeniorAnimalFood() {

    }

    public boolean isForJointSupport() {
        return isForJointSupport;
    }

    public void setForJointSupport(boolean forJointSupport) {
        isForJointSupport = forJointSupport;
    }

    @Override
    public void isBeingEatten(){
        System.out.println("Niooom nioom old");
    }
}
