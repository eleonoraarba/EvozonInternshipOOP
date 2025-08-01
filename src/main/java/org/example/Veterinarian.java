package org.example;

public class Veterinarian {

    public String name;
    public String specialization;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Veterinarian(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public Veterinarian() {
    }

    public void vaccinateAnimal(Animal animal){
        int healthStatusAfterVaccin = animal.getHealthStatus() + 1;
        int moodLevelAfterVaccin = animal.getMoodLevel() -1;
        animal.setMoodLevel(moodLevelAfterVaccin);
        animal.setHealthStatus(healthStatusAfterVaccin);
        System.out.println("Vaccin done");
    }

    public void disinfestationAnimal(Animal animal){
        int healthStatusAfterDisinfestation = animal.getHealthStatus() + 1;
        int moodLevelAfterdisinfestation = animal.getMoodLevel() -1;
        animal.setMoodLevel(moodLevelAfterdisinfestation);
        animal.setHealthStatus(healthStatusAfterDisinfestation);
        System.out.println("Disinfestation done");
    }
}
