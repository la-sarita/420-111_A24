
/**
 * Décrivez votre classe Sudoku ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Sudoku
{
    public static void main(String[] args){
        final int NB_LIGNE = 11;
        final int NB_COLONNE = 22;
        
        for(int i = 0; i < NB_LIGNE; i++){
            for(int j = 0; j < NB_COLONNE; j++){
                if(i % 4 == 3){
                    System.out.print('-');
                } else {
                    if(j % 8 == 7){
                        System.out.print('|');
                    } else if (j % 2 == 0){
                        System.out.print(' ');
                    } else {
                        System.out.print('0');
                    }
                }
            }
            System.out.println();
        }
    }
}
