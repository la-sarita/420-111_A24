
/**
 * Décrivez votre classe TypesPrimitifs ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TypesPrimitifs
{
    static int unEntier = 25;
    // Constantes de classe (globale)
    public static final int AGE_MAX = 120; 
    public static final double PI = 3.14159; 
    public static final String MESSAGE_BIENVENUE = "Bienvenue!"; // Constante de type chaîne
    
    public static void main(String[] args) {
        // Constante locale 
        final double TAUX_TVA = 0.20;
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
                
        /* * * * * * * * * * * *
         *  Le type caractère  *
         * * * * * * * * * * * */
        char lettre1 = 'A';
        char lettre2 = 'a';
        char chiffre = '3';
        char symbole = '$';
        char space = ' ';
         
        /* * * * * * * * * * *
         *  Le type booléen  *
         * * * * * * * * * * */ 
        boolean estActive = true;
        boolean estAbsent = false;
        
        // Modification de variable
        age = 20;

        System.out.print("L'age est : ");
        System.out.println(age);
        System.out.println("L'annéée est : " + annee);
        System.out.println("Le nombre d'habitants du pays est : " + nbrHabitPays);
        System.out.println("Le numéro de téléphone est : " + numTelephone);
        System.out.println("Le mois : " + mois);
        System.out.println("Numéro de DA" + numDa);
        System.out.println("Le montant est : " + montant + '$');
        System.out.println("Une lettre majuscule : " + lettre1);
        System.out.println("Une lettre miniscule : " + lettre2);
        System.out.println("Le chiffre en caractère : " + chiffre);
        System.out.println("Un symbole : " + symbole);
        System.out.println("Un espace :|" + space + '|');
        System.out.println(unEntier);
        System.out.println(AGE_MAX);
        System.out.println(PI);
        System.out.println(MESSAGE_BIENVENUE);
        System.out.println(TAUX_TVA);
    }
}
