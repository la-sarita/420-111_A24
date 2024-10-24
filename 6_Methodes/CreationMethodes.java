
/**
 * Décrivez votre classe CreationMethodes ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class CreationMethodes
{
    public static void main(String[] args){
        afficherMessage();
        MaClasse2.saluer("Alex");
        int resultat = addition(5, 3);
        System.out.println(resultat);
        System.out.println(soustraction(8, 3));
    }
    
    // Visibilité de la méthode est partout dans le programme
    public static void afficherMessage(){
        System.out.println("Bonjour tout le monde!");
    }
    
    // Visibilité de la méthode est au niveau du la même classe
    private static int addition(int a, int b){
        return a + b;
    }
    
    // Visibilité de la méthode est au niveau du même package
    static int soustraction(int a, int b){
        return a - b;
    }
    
    // Surcharge : (nombre de paramètres) Méthode qui additionne trois entiers
    public static int addition(int a, int b, int c) {
        return a + b + c;
    }
    
    // Surcharge : (type des paramètres) Méthode qui additionne trois entiers
    private static double addition(double a, double b){
        return a + b;
    }
}
