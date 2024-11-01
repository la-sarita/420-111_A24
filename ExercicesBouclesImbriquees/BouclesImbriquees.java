import java.util.Scanner;

/**
 * Décrivez votre classe Sudoku ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class BouclesImbriquees
{
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){        
        dessinerSudoku('0');
        exo4();
    }
    
    public static void dessinerSudoku(char caract){
        final int NB_COL = 22;
        final int NB_LIGNE = 11;
        final char ESPACE = ' ';
        final char BARRE = '|';
        final char TIRET = '-';
        
        for(int i = 0; i < NB_LIGNE; i++){
            for(int j = 0; j < NB_COL; j++){
                if(i % 4 == 3){ // cas 2
                    System.out.print(TIRET);
                } else {
                    if(j % 8 == 7){
                        System.out.print(BARRE);
                    } else {
                        if(j % 2 == 0){
                           System.out.print(ESPACE); 
                        } else {
                            System.out.print(caract);
                        }
                    }
                }
            }
            System.out.println();
        }
    }
    
    public static void exo4(){
        int taille = validerTaille(true);
        dessinerLosange(taille);
    }
    
    public static void dessinerLosange(int taille){
        int milieu = taille / 2;
        int debut;
        int fin;
        
        for(int i = 0; i < taille; i++){
            for(int j = 0; j < taille; j++){
                debut = milieu - i;
                if(i > milieu){
                    debut = -debut;
                }
                fin = taille - debut;
                if(j >= debut && j < fin){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static int validerTaille(boolean doitEtreImpair){
        int taille = 0;
        boolean estValide = false;
        
        do{
            System.out.println("\nVeuillez saisir taille : un chiffre entier positif " 
                                + (doitEtreImpair ? "impair" : ""));

            // tester si l'entrée est de type entier ou non
            if(sc.hasNextInt()){ // cas d'entrée de type entier
                taille = sc.nextInt();
                
                if(doitEtreImpair && taille % 2 == 0 || taille < 0){
                    System.out.println("entrée invalide!");
                } else {
                    estValide = true;
                }
            } else { // cas d'entrée pas de type entier
                sc.nextLine(); // vider le tompon
                System.out.println("entrée invalide!");
                taille = 0; // mettre une valeur invalide pour que le code compile et je passe à la prochaine tentative (itération)
            }

        }while(!estValide);
        
        return taille;
    }
}
