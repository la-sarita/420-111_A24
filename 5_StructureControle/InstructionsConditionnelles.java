
/**
 * Décrivez votre classe InstructionsConditionnelles ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class InstructionsConditionnelles
{
    public static void main(String[] args){
        // Afficher un message de solicitation pour demander à l'utilisateur d'entrer un nombre entier
        System.out.println("Veuillez saisir un nombre entier :");
        int nombre = Clavier.lireInteger();
        
        if(nombre % 3 == 0) {
            System.out.println("Le nombre est un multiple de 3");
        }
        
        System.out.println("Etes-vous étudiant ? Entrez true si oui, false sinon");
        boolean estEtudiant = Clavier.lireBoolean();
        
        if(estEtudiant) {
            System.out.println("Vous êtes étudiant!");
        } else {
            System.out.println("Vous êtes enseignant!");
        }
        
        System.out.println("Entrez votre age : ");
        byte age = Clavier.lireByte();
        if(age < 12){
            System.out.println("Vous êtes trop petit! C'est gratuit.");
        } else if(age > 12 && age < 18){
            System.out.println("Veous êtes étudiant! Vous avez le droit à un rabait de 30%.");
        } else if(age > 65){
            System.out.println("Vous êtes un ainé! Vous avez le droit à un rabais de 10%.");
        } else {
            System.out.println("Malheureusement vous n'avez accès à aucun rabais.");
        }
        
        System.out.println("Entrez votre un jour en nombre entier : ");
        short jour = Clavier.lireShort();
        
        switch(jour){
            case 1:
                System.out.println("Lundi!");
                break;
            case 2:
                System.out.println("Mardi!");
                break;
            case 3: 
                System.out.println("mercredi!");
                break;
            case 4: 
                System.out.println("jeudi!");
                break;
            case 5: 
                System.out.println("vendredi!");
                break;
            case 6:
            case 7:
                System.out.println("C'est la fin de semaine");
                break;
            default:
                System.out.println("Jour invalide!");
        }
    }
}
