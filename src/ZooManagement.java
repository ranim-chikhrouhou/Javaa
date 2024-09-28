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

        Zoo myZoo1 = new Zoo("Zahra", "Ariana",4);

        myZoo1.addAnimal(lion);
        myZoo1.addAnimal(tiger);
        myZoo1.addAnimal(elephant);
        myZoo1.addAnimal(giraffe);

        myZoo1.displayAnimals();

        System.out.println("\nSuppression de l'animal 'Simba' (Lion):");
        boolean removed = myZoo1.removeAnimal(lion);
        if (removed) {
            System.out.println("L'animal a été supprimé.");
        } else {
            System.out.println("Échec de la suppression de l'animal.");
        }
        myZoo1.displayAnimals();

        System.out.println("\nRecherche de l'animal 'Simba' (Lion) après suppression:");
        int foundIndex = myZoo1.searchAnimal(lion);
        if (foundIndex != -1) {
            System.out.println("Animal trouvé à l'indice " + foundIndex);
        } else {
            System.out.println("Animal non trouvé.");
        }

        Animal Panda = new Animal("pandas", "poupou", 5, true);
        Animal koala = new Animal("koalas", "koukou", 4, true);
        Animal snake = new Animal("Elephant", "Dumbo", 10, true);
        Animal turtle = new Animal("Giraffe", "Gigi", 7, true);
        Animal butterfly = new Animal("Butterflies", "Butter", 7, true);

        Zoo myZoo2 = new Zoo("Atlas", "Tunis",4);

        myZoo2.addAnimal(Panda);
        myZoo2.addAnimal(koala);
        myZoo2.addAnimal(snake);
        myZoo2.addAnimal(turtle);
        myZoo2.addAnimal(butterfly);

        myZoo2.displayAnimals();


        System.out.println("\nComparaison des zoos :");
        Zoo largerZoo = Zoo.comparerZoo(myZoo1, myZoo2);
        if (largerZoo != null) {
            System.out.println("Le zoo avec le plus d'animaux est : " + largerZoo.name);
        }

        zooManagement.updateZooInfo();
    }

    public void updateZooInfo() {
    }
}
