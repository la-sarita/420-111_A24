
/**
 * Décrivez votre classe TypesPrimitifs ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TypesPrimitifs
{
    public static void main(String[] args) {
        /* * * * * * * * * * *
         * Les types entiers *
         * * * * * * * * * * */
        // Déclaration des variables
        byte age;
        short annee;
        int nbrHabitPays;
        long numTelephone;
        
        // Initialisation des valeurs des variables
        age = 30;
        annee = 2024;
        nbrHabitPays = 15_650_000;
        numTelephone = 514_123_1234L;
        
        // Déclaration et initialisation de variable
        byte mois = 9;
        int numDa = 1234567;
        
        /* * * * * * * * * * *
         *  Les types réels  *
         * * * * * * * * * * */
        float note = 78.5F; 
        double montant = 586025.50;
        
        System.out.print("L'age est : ");
        System.out.println(age);
        System.out.println(annee);
        System.out.println(nbrHabitPays);
        System.out.println(numTelephone);
        System.out.println(mois);
        System.out.println(numDa);
        System.out.println(montant);
    }
}
