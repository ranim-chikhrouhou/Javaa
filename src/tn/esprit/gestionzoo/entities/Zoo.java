package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    public String name;
    private String city;
    private static final int MAX_ANIMALS = 25;
    private int animalCount;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[MAX_ANIMALS];
        this.animalCount = 0;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Le nom du zoo ne peut pas être vide.");
        }
    }

    public String getName() {
        return name;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein. Impossible d'ajouter plus d'animaux.");
            return false;
        }


        for (Animal existingAnimal : animals) {
            if (existingAnimal != null && existingAnimal.getName().equals(animal.getName())) {
                System.out.println("L'animal " + animal.getName() + " est déjà dans le zoo.");
                return false;
            }
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                animalCount++;
                System.out.println("tn.esprit.gestionzoo.entities.Animal " + animal.getName() + " ajouté au zoo.");
                return true;
            }
        }
        return false;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                animals[i] = null;
                animalCount--;
                System.out.println("tn.esprit.gestionzoo.entities.Animal " + animal.getName() + " supprimé du zoo.");
                return true;
            }
        }
        System.out.println("tn.esprit.gestionzoo.entities.Animal " + animal.getName() + " non trouvé dans le zoo.");
        return false;
    }

    public void displayAnimals() {
        System.out.println("Animaux dans le zoo " + name + " :");
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean isZooFull() {
        return animalCount >= MAX_ANIMALS;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z2.animalCount > z1.animalCount) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return null;
        }
    }
}