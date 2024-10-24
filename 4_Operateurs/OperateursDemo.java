
/**
 * Décrivez votre classe OperateursDemo ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class OperateursDemo
{
    public static void main(String[] args){
        // Opérateurs unaires
        int x = -5; // moins unaire
        int y = +6; // plus unaire : équivalent de : int y = 6;
        boolean estFaux = !true;
        // Opérateurs binaires
        int z = 14 + 10;
        boolean plusGrand = 8 > 6;
        // Opérateurs ternaires
        boolean estMatin = Clavier.lireBoolean();
        String salutation = estMatin ? "Bonjour!" : "Bonsoir!";
        System.out.println(salutation);
        // l'équivalent de l'expression ternaire en instruction conditionnelle
        // if .. else
        String salut;
        if(estMatin) {// équivalent de if(estMatin == true)
            salut = "Bonjour!";
        } else {
            salut = "Bonsoir!";
        }
        System.out.println(salut);
        //////////////////////////////
        // Opérateurs arithmitiques //
        //////////////////////////////
        
        // Addition
        int add = x + y;
        // Soustraction;
        int sub = x - y;
        // Multiplication
        double montant = y * 15.5;
        // Division
        int divEntiere = z / y;
        double div = 24 / 5.0;
        System.out.println(25 / y * 1.0);  // affiche 4.0
        System.out.println(25 / (y * 1.0)); // affiche 4.166666666666667
        System.out.println("Resultat de divition entière est : ");
        // modulo
        int modulo = 25 % 3; // 25 modulo 3 : donne 1
        
        /////////////////////////////
        // Opérateurs relationnels //
        /////////////////////////////
        // égalité
        boolean estEgal = x == y; // false
        // non égalité (différence)
        boolean estDifferent = x != y; // true
        // superieur à 
        boolean estPlusGrand = x > y; // false
        // inférieur à
        boolean estPlusPetit = x < y; // true
        // superieur à 
        boolean estPlusGrandOuEgal = x >= -5; // true
        // inférieur à
        boolean estPlusPetitOuEgal = x <= 8; // true
        
        
        /////////////////////////
        // Opérateurs logiques //
        /////////////////////////
        
        boolean est = (5 > 3) && (8 > 5); // donne true
        boolean ou = (5 > 3) || (8 > 5); // donne true
        boolean nonLogique = !(5 == 3); // donne true
        
        
    }
}
