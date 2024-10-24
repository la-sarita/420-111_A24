
/**
 * Décrivez votre classe InstructionsConditionnelles ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class InstructionsConditionnelles
{
    public static void main(String[] args) {
        // System.out.println("Entrez un entier : ");
        // int x = Clavier.lireInteger();
        // System.out.println("Vous avez rentrer : " + x);
        // if(x > 0){
            // System.out.println("C'est un nombre positif");
        // }
        
        // System.out.println("Etes-vous étudiant ? (entrez true si oui, false sinon)");
        // boolean estEtudiant = Clavier.lireBoolean();
        
        // if(estEtudiant) {
            // System.out.println("Vous etes étudiant");
        // } else {
            // System.out.println("Vous etes enseignant");
        // }
        
        // System.out.println("Entrez votre age : ");
        // byte age = Clavier.lireByte();
        // if(age < 12) {
            // System.out.println("Vous êtes tros jeune, c'est gratuit");
        // } else if(age > 12 && age < 18) {
            // System.out.println("Vous étudiant, vous avez un rabais de 30%");
        // } else if(age > 65) {
            // System.out.println("Vous un ainé, vous avez un rabais de 10%");
        // } else {
            // System.out.println("Désolé! Vous n'avez pas le droit à aucun rabais");
        // }
        
        System.out.println("Entrez un jour en nombre : ");
        short jour = Clavier.lireShort();
        
        switch(jour){
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("mardi");
                break;
            case 3:
                System.out.println("mercredi");
                break;
            case 4:
                System.out.println("jeudi");
                break;
            case 5:
                System.out.println("vendredi");
                break;
            default:
                System.out.println("C'est la fin de semaine");
        }  
    }
}
