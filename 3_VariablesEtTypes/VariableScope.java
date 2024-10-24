
/**
 * Décrivez votre classe VariableScope ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class VariableScope {
    // Variable statique (de classe)
    static int globalVar = 10;
    
    public static void myMethod() {
        // Variable locale
        int localVar = 5;
        System.out.println("Local variable: " + localVar);
        System.out.println("Global (static) variable: " + globalVar);
    }
    
    public static void anotherMethod() {
        // Accès à la variable statique
        System.out.println("Global (static) variable from another method: " + globalVar);
    }
    
    public static void main(String[] args) {
        myMethod();
        anotherMethod();

        // Accès à la variable statique sans créer d'instance
        System.out.println("Accessing static variable without an instance: " + globalVar);
    }
}

