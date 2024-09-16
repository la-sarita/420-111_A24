
/**
 * Décrivez votre classe InstructionsRepetitives ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class InstructionsRepetitives
{
    public static void main(String[] args){
        // Boucle for
        // for (int i = 0; i < 5; i++) {
            // System.out.println("i : " + i);
        // }
        
        int x = 0;
        
        while (x < 5) {
            System.out.println("i : " + x);
            x++;
        }
        
        // int i = -3;
        // int j = 1;
        // for (j = 2; j < 8 ; j = j + 1) { 
            // i = i + j;
        // }
        // System.out.println (i);
        
        for (int i = 0; i < 10; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.printf( "%4d", i* j);
            }
            System.out.println(); 
        }
        
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
