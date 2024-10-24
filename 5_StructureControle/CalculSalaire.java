
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
        final String MSG_ERR_REPONSE = "***Réponse invalide !";
        final String MSG_SAIS_NBR_HEURES = "Entrez un nombre d’heures de travail: ";
        final String MSG_ERR_NBRE_HEURES = "***Nombre d’heures non valide";
        
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
            // Lecture de la réponse de l'utilisateur
            reponse = Clavier.lireCharacter();
            // Validation de la réponse
            while(reponse != PETIT_O && reponse != GRAND_O 
                        && reponse != PETIT_N && reponse != GRAND_N){
                System.out.println(MSG_ERR_REPONSE);
                System.out.println(MSG_REP_CALC_SALAIRE);
                reponse = Clavier.lireCharacter();
            }
            
            // Calcul du salaire si l'utilisateur avait saisi 'o' ou 'O'
            if(reponse == PETIT_O || reponse == GRAND_O){
                // Calculer le salaire
                // Demander à l’utilisateur de saisir le nombre d'heures travaillées
                System.out.println(MSG_SAIS_NBR_HEURES);
                // Lecture du nombre d'ehures saisi par l'utilisateur
                nbHeuresSaisi = Clavier.lireFloat();
                while(nbHeuresSaisi <= NB_HEURES_MIN || nbHeuresSaisi >= NB_HEURES_MAX){
                    System.out.println(MSG_ERR_NBRE_HEURES);
                    System.out.println(MSG_SAIS_NBR_HEURES);
                    nbHeuresSaisi = Clavier.lireFloat();
                }
            
                // Bloc de calcul ou de traitement
                if(nbHeuresSaisi <= NB_HEURES_REG_MAX){
                    nbHeuresSuppl = 0;
                    salaireSuppl = 0;
                    nbHeuresReg = nbHeuresSaisi;
                } else {
                    nbHeuresReg = NB_HEURES_REG_MAX;
                    nbHeuresSuppl = nbHeuresSaisi - NB_HEURES_REG_MAX;        
                    salaireSuppl = nbHeuresSuppl * TAUX_HORAIRE * TAUX_HOR_SURPLUS;
                }
                salaireReg = nbHeuresReg * TAUX_HORAIRE;
                salaireTotal = salaireReg + salaireSuppl;
                // Bloc d’affichage
                System.out.println("Le nombre d’heures de travail total: " + nbHeuresSaisi);
                System.out.println("Le nombre d’heures régulières de travail : " + nbHeuresReg);
                System.out.println("Le nombre d’heures supplémentaire de travail : " + nbHeuresSuppl);
                System.out.println("Le salaire régulier : " + salaireReg);
                System.out.println("Le salaire supplémentaire : " + salaireSuppl);
                System.out.println("Le salaire total : " + salaireTotal);
            }
            
        }while(reponse == PETIT_O || reponse == GRAND_O);
    }
}
