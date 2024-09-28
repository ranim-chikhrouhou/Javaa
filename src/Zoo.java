public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int animalCount;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
    }

    public boolean addAnimal(Animal animal) {
        if (animalCount >= nbrCages) {
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

    @Override
    public String toString() {
        return "Zoo: " + name + ", Ville: " + city + ", Nombre de cages: " + nbrCages;
    }
}
