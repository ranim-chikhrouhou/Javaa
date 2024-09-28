public class ZooManagement {
    public static void main(String[] args) {
        ZooManagement zooManagement = new ZooManagement();
        int nbrCages = 4;
        String zooname = "myzoo";
        System.out.println(zooname + " comporte " + nbrCages + " cages");

        Animal lion = new Animal("LionKing", "Simba", 5, true);
        Animal tiger = new Animal("Tiger", "Shere Khan", 4, true);
        Animal elephant = new Animal("Elephant", "Dumbo", 10, true);
        Animal giraffe = new Animal("Giraffe", "Melman", 7, true);

        Zoo myZoo = new Zoo("Zahra", "Ariana", nbrCages);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(giraffe);

        myZoo.displayAnimals();

        System.out.println("\nSuppression de l'animal 'Simba' (Lion):");
        boolean removed = myZoo.removeAnimal(lion);
        if (removed) {
            System.out.println("L'animal a été supprimé.");
        } else {
            System.out.println("Échec de la suppression de l'animal.");
        }

        myZoo.displayAnimals();

        System.out.println("\nRecherche de l'animal 'Simba' (Lion) après suppression:");
        int foundIndex = myZoo.searchAnimal(lion);
        if (foundIndex != -1) {
            System.out.println("Animal trouvé à l'indice " + foundIndex);
        } else {
            System.out.println("Animal non trouvé.");
        }

        zooManagement.updateZooInfo();
    }

    public void updateZooInfo() {
    }
}
