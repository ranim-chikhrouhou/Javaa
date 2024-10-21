package tn.esprit.gestionzoo.entities;
public class Penguin extends Aquatic {
    private float swimmingDepth;

    // Constructeur avec swimmingDepth
    public Penguin(String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super("Bird", name, age, isMammal, habitat); // 'Bird' est un exemple de famille pour un pingouin
        this.swimmingDepth = swimmingDepth;
    }
    public float getSwimmingDepth() { // Méthode pour obtenir la profondeur de nage
        return swimmingDepth;
    }
    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth: " + swimmingDepth + " meters";
    }

    @Override
    public void swim() {
        System.out.println("Le penguin nage rapidement.");
    }
}
