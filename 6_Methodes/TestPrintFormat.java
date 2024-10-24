
/**
 * Décrivez votre classe TestPrintFormat ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TestPrintFormat
{
    public static void main(String[] args){
        int age = 25;
        System.out.printf("J'ai %d ans.\n", age);   
        
        double prix = 25.6789;
        System.out.printf("Le prix est %.2f $.\n", prix);
        
        String nom = "Alice";
        System.out.printf("\tBonjour, %s !\n", nom);
        
        double taille = 1.75;
        System.out.printf("%s a %d ans et mesure %.2f mètres.\n\n", 
                          nom, age, taille);
                          
        double reduction = 0.05;
        System.out.printf("Réduction : %.2f%%\n", reduction * 100);
    }
}
