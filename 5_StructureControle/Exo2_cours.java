
/**
 * Décrivez votre classe Exo2_cours ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Exo2_cours
{
    public static void main(String[] args){
        // Déclaration des constantes
        final String MSG_SOLL = "Veuillez entrer le nombre de boites de chocolat que vous voulez acheter:";
        final String MSG_AUCUN_RABAIS = "Vous n'avez pas droit au rabais!";
        final String MSG_RABAIS = "Vous avez droit à un rabais de ";
        // Déclaration des variables
        int nbreBoites;
        int rabais;
        
        System.out.println(MSG_SOLL);
        nbreBoites = Clavier.lireInteger();
        
        if(nbreBoites > 50){
            rabais = 15;
            System.out.println(MSG_RABAIS + rabais + "%");
        } else if (nbreBoites > 5){
            rabais = 10;
            System.out.println(MSG_RABAIS + rabais + "%");
        } else {
            System.out.println(MSG_AUCUN_RABAIS);
        }
        
    }
}
