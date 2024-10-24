
/**
 * Décrivez votre classe Lab2Exo9 ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Lab2Exo9
{
    public static void main(String[] args){
        // Déclaration des constantes
        final String MSG_SAISI_NBR = "Veuillez saisir un nombre entier positif :";
        final String MSG_ERR = "Le nombre saisi n’est pas positif";
        // Déclaration des variables
        int nombre;
        int somme = 0;
        
        // Validation du nombre saisi
        System.out.println(MSG_SAISI_NBR);
        nombre = Clavier.lireInteger();
        
        while(nombre <= 0){
            System.out.println(MSG_ERR);
            System.out.println(MSG_SAISI_NBR);
            nombre = Clavier.lireInteger();
        }
        
        // Calcul de la somme
        for(int i = 1; i <= nombre; i++){
            somme = somme + i;
        }
        
        // Affichage de la somme
        System.out.println(somme);
    }
}
