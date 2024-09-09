
/**
 * Décrivez votre classe ConvertionTypes ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class ConvertionTypes
{
    public static void main(String[] args){
        // Conversion implicite
        int x = 10; 
        double y = x; // Conversion implicite d'un int en double
        
        // Conversion explicite
        double pi = 3.14159; 
        int entier = (int) pi; // Conversion explicite, coupe la partie décimale
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(pi);
        System.out.println(entier);
    }
}
