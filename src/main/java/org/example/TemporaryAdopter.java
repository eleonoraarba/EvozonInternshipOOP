package org.example;

import java.util.Date;

public class TemporaryAdopter extends Adopter{

    private Date adoptionStartDate;
    private Date adoptionEndDate;

    public TemporaryAdopter(String name, int availableMoney, Date adoptionStartDate, Date adoptionEndDate) {
        super(name, availableMoney);
        this.adoptionStartDate = adoptionStartDate;
        this.adoptionEndDate = adoptionEndDate;
    }

    public TemporaryAdopter() {

    }

    public Date getAdoptionStartDate() {
        return adoptionStartDate;
    }

    public void setAdoptionStartDate(Date adoptionStartDate) {
        this.adoptionStartDate = adoptionStartDate;
    }

    public Date getAdoptionEndDate() {
        return adoptionEndDate;
    }

    public void setAdoptionEndDate(Date adoptionEndDate) {
        this.adoptionEndDate = adoptionEndDate;
    }

    @Override
    public String toString() {
        return "TemporaryAdopter{" +
                "adoptionStartDate=" + adoptionStartDate +
                ", adoptionEndDate=" + adoptionEndDate +
                ", name='" + name + '\'' +
                ", availableMoney=" + availableMoney +
                '}';
    }

    public void isForeverAdopter(){
        System.out.println("This is not a forever home:(");
    }
}
