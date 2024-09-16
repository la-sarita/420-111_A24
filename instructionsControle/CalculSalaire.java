
/**
 * Décrivez votre classe CalculSalaire ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class CalculSalaire
{
    public static void main(String[] args){
        // Déclaration des constantes 
        final float TAUX_HORAIRE = 45f;
        final float TAUX_HOR_SURPLUS = 1.5f;
        final float NB_HEURES_REG_MAX = 40f;
        final float NB_HEURES_MIN = 0f;
        final float NB_HEURES_MAX = 60f;
        final char PETIT_O = 'o';
        final char GRAND_O = 'O';
        final char PETIT_N = 'n';
        final char GRAND_N = 'N';
        final String MSG_REP_CALC_SALAIRE = "Désirez-vous calculer un salaire?(O ou o = OUI, N ou n = NON) : ";
        
        // Déclaration des variables 
        float nbHeuresSaisi;
        float nbHeuresReg;
        float nbHeuresSuppl;
        float salaireReg;
        float salaireSuppl;
        float salaireTotal;
        char reponse;
        
        do {
            // Demander à l’utilisateur s’il désire calculer un autre salaire
            System.out.println(MSG_REP_CALC_SALAIRE);
            reponse = Clavier.lireCharacter();
            
            // Boucle while
            
            // if
            //// boucle while
            
            // if - else
            
            // Bloc d’affichage
            
        }while(reponse == PETIT_O || reponse == GRAND_O);
    }
}
