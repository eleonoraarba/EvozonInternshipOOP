package org.example;

public class VeteranianAssistent {
    public String name;
    public Veterinarian veteranianSupervisor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Veterinarian getVeteranianSupervisor() {
        return veteranianSupervisor;
    }

    public void setVeteranianSupervisor(Veterinarian veteranianSupervisor) {
        this.veteranianSupervisor = veteranianSupervisor;
    }

    public VeteranianAssistent(String name, Veterinarian veteranianSupervisor) {
        this.name = name;
        this.veteranianSupervisor = veteranianSupervisor;
    }

    public VeteranianAssistent() {
    }

    public void petAnimal(Animal animal){
        int moodLevelAfterPetting = animal.getMoodLevel() + 1;
        animal.setMoodLevel(moodLevelAfterPetting);
        System.out.println("Animal petted!!");
    }
}
