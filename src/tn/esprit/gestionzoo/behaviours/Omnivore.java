package tn.esprit.gestionzoo.behaviours;

public interface Omnivore<T> extends Carnivore<T>, Herbivore<T> {
    void eatPlantAndMeat(T food);
}
