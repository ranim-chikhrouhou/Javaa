public class Zoo {
    Animal []Animals ;
    String name ;
    String city ;
    int nbrCages ;

    public Zoo(String name, String city, int nbrCages, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.Animals = new Animal[25] ;

    }
    public void displayZoo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
        System.out.println("Animaux dans le zoo:");}

    public String toString() {
        return "Zoo: " + name + ", Ville: " + city + ", Nombre de cages: " + nbrCages;
    }
}
