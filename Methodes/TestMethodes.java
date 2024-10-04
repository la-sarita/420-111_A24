
/**
 * Décrivez votre classe TestMethodes ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TestMethodes
{
    public static void main(String[] args){
        //System.out.println("Premier argument : " + args[0]);
        afficherMessage();
        AppelMethodes.saluer("Alain");
        //AppelMethodes.methodePrivee();
        int somme = addition(4, 5);
        System.out.println(somme);
        System.out.println(soustraction(9, 4));
    }
    
    public static void afficherMessage(){
        System.out.println("Bonjour tout le monde!");
    }
    
    public static int addition(int a, int b){
        return a + b;
    }
    
    public static int soustraction(int a, int b){
        return a - b;
    }
}
