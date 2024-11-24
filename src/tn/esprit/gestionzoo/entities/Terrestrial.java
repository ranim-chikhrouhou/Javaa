package tn.esprit.gestionzoo.entities;

import model.Food;
import tn.esprit.gestionzoo.behaviours.Omnivore;

public abstract class Terrestrial extends Animal implements Omnivore<Food> {
    private String habitat;

    public Terrestrial(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public abstract void run();

    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println(getName() + " (Terrestrial) is eating meat: " + meat);
    }

    @Override
    public void eatPlant(Food plant) {
        System.out.println(getName() + " (Terrestrial) is eating plant: " + plant);
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Terrestrial terrestrial = (Terrestrial) obj;
        return getAge() == terrestrial.getAge() &&
                getName().equals(terrestrial.getName()) &&
                habitat.equals(terrestrial.habitat);
    }

    // Getter and Setter for habitat
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
