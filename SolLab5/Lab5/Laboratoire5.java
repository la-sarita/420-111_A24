import java.util.Scanner;

/**
 * Décrivez votre classe Laboratoire5 ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Laboratoire5
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        exo1();
    }

    public static void exo1(){
        int mois;
        int jours;

        do{
            System.out.println("Veuillez saisir un chiffre entre 1 et 12");

            // tester si l'entrée est de type entier ou non
            if(scanner.hasNextInt()){ // cas d'entrée de type entier
                mois = scanner.nextInt();
                if(mois < 1 || mois > 12){
                    System.out.println("entrée invalide!");
                }
            } else { // cas d'entrée pas de type entier
                scanner.nextLine(); // vider le tompon
                System.out.println("entrée invalide!");
                mois = 0; // mettre une valeur invalide pour que le code compile et je passe à la prochaine tentative (itération)
            }

        }while(mois < 1 || mois > 12);

        jours = trouverJours(mois);
        //System.out.println("Le mois " + mois + " contient " + jours + " jours.");
        System.out.printf("Le mois %d contient %d jours.\n", mois, jours);
    }

    public static int trouverJours(int mois){
        int jours;

        switch(mois){
            case 2:
                jours = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                jours = 30;
                break;
            default: 
                jours = 31;
                break;
        }

        return jours;
    }
}
