import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Décrivez votre classe ManipulationFichiers ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class ManipulationFichiers {
    static String[] noms = new String[5];
    static String[] prenoms = new String[5];
    static String[] dates = new String[5];
    static int[][] datesDecoupes = new int[5][3];
    
    public static void main(String[] args){
        String nomFichier1 = "data\\fichier.txt";
        String contenu = "\tBonjour tout le monde et bienvenue dans le cours 420-111.\n"
                            + "Le cours d'introduction à la programmation va vous permettre d'apprendre les bases de la programmation.";
        String contenu2 = "Pitre-Vincent 20/11/2001\n" + 
                        "Martale-Alain 14/05/1999\n" +
                        "Pourtre-Nissa 08/04/2004\n";
        File fichier = creerFichier2(nomFichier1);
        ecrireDansFichier(nomFichier1, contenu2);
        lireFichier(fichier);
        String contenuLu = lireFichier2(fichier);
        for(int[] date : datesDecoupes){
            for(int val : date){
                System.out.println(val);
            }
        }
        //creerFichier("dossier\\fichier.txt");
    }
    
    public static void creerFichier(String nomFichier){
        File fichier = new File(nomFichier);
        try {
            if(fichier.createNewFile()){
                // Le fichier a été créé
                System.out.println("Le fichier " + fichier.getName() + " a été créé avec succès!");
            } else {
                // Le fichier existe déjà
                System.out.println("Le fichier existe déjà");
            }
        } catch(IOException e){
            System.out.println("Une erreur s'est produite");
        }
    }
    
    public static File creerFichier2(String nomFichier){
        File fichier = new File(nomFichier);
        try {
            
            if(!fichier.exists() && fichier.createNewFile()){
                // Le fichier a été créé
                System.out.println("Le fichier " + fichier.getName() + " a été créé avec succès!");
            } else {
                // Le fichier existe déjà
                System.out.println("Le fichier existe déjà");
            }
        } catch(IOException e){
            System.out.println("Une erreur s'est produite");
        }
        
        return fichier;
    }
    
    public static void ecrireDansFichier(String nomFichier, String contenu){
        try{
            FileWriter monWriter = new FileWriter(nomFichier);
            monWriter.write(contenu);
            monWriter.close();
        } catch(IOException e){
            System.out.println("Une erreur s'est produite");
        }
    }
    
    public static void lireFichier(File fichier){
        String ligne;
        int compteur = 0;
        
        try{
            Scanner sc = new Scanner(fichier);
            while(sc.hasNextLine()){
                 ligne = sc.nextLine();
                 String[] parties = ligne.split(" ");
                 String[] nomComplets = parties[0].split("-");
                 noms[compteur] = nomComplets[0];
                 prenoms[compteur] = nomComplets[1];
                 dates[compteur] = parties[1];
                 datesDecoupes[compteur] = spliterDate(parties[1]);
                 System.out.println(ligne);
                 compteur++;
            }
        }catch(IOException e){
            System.out.println("Une erreur s'est produite");
        }
    }
    
    public static String lireFichier2(File fichier){
        String ligne = "";
        
        try{
            Scanner sc = new Scanner(fichier);
            while(sc.hasNextLine()){
                 ligne += sc.nextLine();
            }
        }catch(IOException e){
            System.out.println("Une erreur s'est produite");
        }
        
        return ligne;
    }
    
    public static int[] spliterDate(String dateChaine){
        String[] parties = dateChaine.split("/");
        int[] date = new int[3];
        
        for(int i = 0; i < parties.length; i++){
            try{
                date[i] = Integer.parseInt(parties[i]);
            }catch(NumberFormatException e){
                System.out.println("Erreur! Date invalide!");
            }
        }
        
        return date;
    }
}
