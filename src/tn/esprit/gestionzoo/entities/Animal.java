package tn.esprit.gestionzoo.entities;

public class Animal {
   private  String family ;
   private String name ;
   private int age ;
   private boolean isMammal ;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal ;}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    int getAge(){ return age;}
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("L'âge ne peut pas être négatif.");
        }
    }
    public void displayAnimal() {
        System.out.println("Nom: " + name + ", Famille: " + family + ", Âge: " + age + ", Mammifère: " + isMammal);
    }
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal: " + name + ", Famille: " + family + ", Âge: " + age + ", Mammifère: " + isMammal;
    }
}
