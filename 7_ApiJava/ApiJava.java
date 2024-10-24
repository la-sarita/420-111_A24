import java.util.Scanner;

/**
 * Décrivez votre classe ApiJava ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class ApiJava
{
    public static void main(String[] args){
        //testClasseMath();
        TypesEnveloppe.testClasseInteger();
        TypesEnveloppe.testClasseDouble();
        TypesEnveloppe.testClasseCharacter();
        //testClasseString();
        // Caractère d'échappement
        System.out.println("Bienvenue dans le cours 420-111 :" + 
            "\n\t1. Il ne faut pas utiliser votre téléphone pendant le cours." +
            "\n\t2. Il faut faire les exercices des laboratoire pour pratiquer." + 
            "\n\t3. Ne pas s'absenter pour ne pas manquer des notions importantes.");
        testClasseScanner();
    }

    public static void testClasseMath(){
        /////////////////
        // Classe Math //
        /////////////////
        System.out.println(Math.abs(-5));  // affiche 5
        System.out.println(Math.sqrt(16)); // affiche 4.0
        System.out.println(Math.pow(5, 2)); // affiche 25.0
        System.out.println(Math.max(5, 14)); // affiche 14
        System.out.println(Math.min(5, 14));  // affiche 5
        System.out.println(Math.ceil(5.2));  // affiche 6.0
        System.out.println(Math.floor(5.2)); // affiche 5.0
        System.out.println(Math.round(5.2));  // affiche 5
        System.out.println(Math.log(1));     // affiche 0.0
        double rand = Math.random();
        System.out.println(rand); // affiche un double entre 0.0 et 1.0
        System.out.println(Math.round(rand * 100));
        System.out.println(Math.round(Math.ceil(rand * 6)));
    }

    public static void testClasseString(){
        ///////////////////
        // Classe String //
        ///////////////////

        String chaine = "Bonjour tout le monde!";
        System.out.println(chaine.length()); 
        System.out.println(chaine.isBlank());
        System.out.println("   ".isBlank());
        System.out.println("".isBlank());

        System.out.println(String.valueOf(5.2) + 5);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
    
    public static void testClasseScanner(){
        ////////////////////
        // Classe Scanner //
        ////////////////////
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Veuillez entrer votre nom: ");
        String nom = scanner.next();
        
        System.out.println("Veuillez entrer votre prénom: ");
        //String prenom = scanner.next();   // lire un seul mot
        String prenom = scanner.nextLine(); // lire une phrase
        
        System.out.println("Veuillez entrer votre solde bancaire: ");
        double solde = scanner.nextDouble();
        
        System.out.println("Veuillez entrer votre age: ");
        int age = scanner.nextInt();
        
        System.out.println("Veuillez entrer si vous avez foid ou non: ");
        boolean froid = scanner.nextBoolean();
        
        System.out.println(nom + ", " + prenom +  " - " + solde +  " - " + age 
                            +  " - j'ai " + (froid ? "froid" : "chaud"));
        scanner.close();
    }
    
    
}
