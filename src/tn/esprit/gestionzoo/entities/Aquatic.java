package tn.esprit.gestionzoo.entities;

import model.Food;
import tn.esprit.gestionzoo.behaviours.Carnivore;

public abstract class Aquatic extends Animal implements Carnivore<Food> {
    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public abstract void swim();

    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println(getName() + " (Aquatic) is eating: " + meat);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aquatic aquatic = (Aquatic) obj;
        return getAge() == aquatic.getAge() &&
                getName().equals(aquatic.getName()) &&
                habitat.equals(aquatic.habitat);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
