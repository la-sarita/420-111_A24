import java.util.Scanner;

/**
 * Décrivez votre classe Laboratoire2 ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Laboratoire2
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        exo1();
        //exo2();
        
        scanner.close();
    }

    public static void exo1(){
        int nbrVoyelles;
        System.out.println("Veuillez entrer une phrase");
        String phrase = scanner.nextLine(); 
        
        // Ces versiuons ne prènent pas en compte les voyelles accentuées
        // Vous pouvez améliorer cette version si vous voulez
        //nbrVoyelles = calculNbrVoyelles(phrase);
        //nbrVoyelles = calculNbrVoyellesV2(phrase);
        nbrVoyelles = calculNbrVoyellesV2IgnoreCasse(phrase);
        System.out.println(nbrVoyelles);
    }

    public static void exo2(){
        System.out.println("Veuillez entrer une phrase");
        String phrase = scanner.nextLine(); 

        System.out.println("Veuillez entrer le mot");
        String mot = scanner.next();

        trouverMot(phrase, mot);
        trouverMotEnIgnoreLaCasse(phrase, mot);
    }
    
    public static void trouverMot(String phrase, String mot){
        // en respectant la casse
        boolean estPresent = phrase.contains(mot);
        System.out.println("Le mot \"" + mot + (estPresent ? "\" a été" : "\" n'a pas été") + " trouvé");
    }
    
    public static void trouverMotEnIgnoreLaCasse(String phrase, String mot){
        // en ignore la casse on convertit la phrase et le mot en majuscule (toUpperCase)
        // ou les deux en miniscule (toLowerCase). Dans la solution proposée pn les a convertit en majuscule 
        boolean estPresent = phrase.toUpperCase().contains(mot.toUpperCase());
        System.out.println("Le mot \"" + mot + (estPresent ? "\" a été" : "\" n'a pas été") + " trouvé");
    }

    public static int calculNbrVoyelles(String phrase){
        int nbrVoyelles = 0;
        String voyelles = "aeiouy";

        for(int i = 0; i < phrase.length(); i++){
            char caract = Character.toLowerCase(phrase.charAt(i)); // récupérer le caractère courant et le met en miniscule
            String caractEnString = String.valueOf(caract); // si caract est 'a' caractEnString serait "a"

            if(voyelles.contains(caractEnString)){  // vérifie si le caractère courant est contenu dans la chaines des voyelles
                nbrVoyelles++;
            }
        }

        return nbrVoyelles;
    }

    public static int calculNbrVoyellesV2(String phrase){
        int nbrVoyelles = 0;

        for(int i = 0; i < phrase.length(); i++){
            char caract = phrase.charAt(i);

            switch(caract){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    nbrVoyelles++;
                    break;
                default:
                    break;
            }
        }

        return nbrVoyelles;
    }
    
    public static int calculNbrVoyellesV2IgnoreCasse(String phrase){
        int nbrVoyelles = 0;

        for(int i = 0; i < phrase.length(); i++){
            char caract = Character.toLowerCase(phrase.charAt(i));

            switch(caract){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    nbrVoyelles++;
                    break;
                default:
                    //break; // le break ici est facultatif
            }
        }

        return nbrVoyelles;
    }
}
