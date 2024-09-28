public class Zoo {
    Animal[] animals;
    String name;
    String city;
    public static final int MAX_ANIMALS = 25;
    int animalCount;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[MAX_ANIMALS];
        this.animalCount = 0;
    }

    public boolean addAnimal(Animal animal) {
        if (animalCount >= MAX_ANIMALS) {
            System.out.println("Le zoo est plein. Impossible d'ajouter plus d'animaux.");
            return false;
        }
        if (isZooFull()) {
            System.out.println("Le zoo est plein. Impossible d'ajouter plus d'animaux.");
            return false;
        }
        for (Animal existingAnimal : animals) {
            if (existingAnimal != null && existingAnimal.name.equals(animal.name)) {
                System.out.println("L'animal " + animal.name + " est déjà dans le zoo.");
                return false;
            }
        }
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                animalCount++;
                System.out.println("Animal " + animal.name + " ajouté au zoo.");
                return true;
            }
        }
        return false;
    }
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                animals[i] = null;
                animalCount--;
                System.out.println("Animal " + animal.name + " supprimé du zoo.");
                return true;
            }
        }
        System.out.println("Animal " + animal.name + " non trouvé dans le zoo.");
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
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }
    public boolean isZooFull() {
        return animalCount >= MAX_ANIMALS;
    }


    public String toString() {
        return "Zoo: " + name + ", Ville: " + city + ", Nombre de cages: " + MAX_ANIMALS;
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
