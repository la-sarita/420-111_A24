
/**
 * Décrivez votre classe BouclesImbriquees ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class BouclesImbriquees
{
    public static void main(String[] agrs){
        for (int i = 0; i < 10; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.printf( "%4d", i * j);
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
