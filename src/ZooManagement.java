import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        int nbrCages = 20 ;
        String zooname = "myzoo";
        System.out.println(zooname + " comporte " + nbrCages + " cages");
        zoo.displayZooInfo();
        zoo.updateZooInfo();
        System.out.println("Les informations du zoo ont été mises à jour.");
        zoo.displayZooInfo();

    }
    int nbrCages  ;
    String zooname ;
    public void displayZooInfo() {
        System.out.println( zooname + " comporte " + nbrCages + " cages.");
    }

    public void updateZooInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du zoo : ");
        String zooname = scanner.nextLine();
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Entrez le nombre de cages : ");
            if (scanner.hasNextInt()) {
                int nbrCages;
                nbrCages = scanner.nextInt();
                if (nbrCages > 0) {
                    validInput = true;
                } else {
                    System.out.println("Le nombre de cages doit être supérieur à 0.");
                }
            } else {
                System.out.println("Veuillez entrer un nombre valide.");
                scanner.next();
            }
        }
        scanner.close();
    }

}
