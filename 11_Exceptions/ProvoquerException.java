import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Décrivez votre classe ProvoquerException ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class ProvoquerException{
    public static Scanner sc = new Scanner(System.in);
    public static final int AGE_LEGAL = 18;
    
    public static void main(String[] args) {
        try{
            int age = validerAgeLegal();
            System.out.println(age);
        } catch(AgeInvalideException ex){
            System.out.println(ex.getMessage());
        } finally{
            sc.close();
        }
    }
    
    public static int validerAgeLegal() throws AgeInvalideException {
        int age = 0;
        
        do{
            System.out.println("Veuillez entrer votre age");
            
            try{
                age = sc.nextInt();
                if(age < AGE_LEGAL){
                    throw new AgeInvalideException("Vous n'avez pas l'âge légal pour envoyer une soumission.");
                }
            } catch(InputMismatchException ex){
                System.out.println("Entrée invalide! un nombre est attendu.");
                sc.nextLine();
            }
        }while(age == 0);
        
        return age;
    }
}
