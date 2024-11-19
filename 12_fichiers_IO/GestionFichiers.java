import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Décrivez votre classe GestionFichiers ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class GestionFichiers{
    static String[] noms = new String[5];
    static String[] prenoms = new String[5];
    static String[] dates = new String[5];
    static int[][] datesDecoupees = new int[5][3];

    public static void main(String[] args){
        String nomFichier2 = "fichier2.txt";
        String contenu = "\tBonjour tout le monde et bienvenue dans le cours 420-111.\n"
            + "Le cours d'introduction à la programmation va vous permettre d'apprendre "
            + "les bases de la programmation en Java.";
        String contenu2 = "Pitre-Vincent 20/11/2001\n" + 
            "Martale-Alain 14/05/1999\n" +
            "Pourtre-Nissa 08/04/2004\n";
        creerFichier(nomFichier2);
        creerFichier("fichiers/fichier.txt");
        creerFichier("data/fichier2.pdf");
        ecrireDansFichier(nomFichier2, contenu2);
        lireFichier(nomFichier2);
        System.out.println(Arrays.toString(noms));
        System.out.println(Arrays.toString(prenoms));
        System.out.println(Arrays.toString(dates));
        for(int[] ligne : datesDecoupees){
            System.out.println(Arrays.toString(ligne));
        }
        
    }

    public static void creerFichier(String nomFichier){
        File fichier = new File(nomFichier);

        try{
            if(!fichier.exists() && fichier.createNewFile()){
                System.out.println("Le fichier " + fichier.getName() + " a été créé avec succès");
            } else {
                System.out.println("Le fichier " + fichier.getName() + " existe déjà");
            }
        } catch (IOException e){
            System.out.println("Une erreur est arrivée!");
        }
    }

    public static void ecrireDansFichier(String nomFichier, String contenu){
        try {
            FileWriter fluxEcriture = new FileWriter(nomFichier);
            fluxEcriture.write(contenu);
            fluxEcriture.close();
        } catch(IOException e){
            System.out.println("Une erreur est arrivée!");
        }
    }

    public static void lireFichier(String nomFichier){
        File fichier = new File(nomFichier);
        String ligne;
        int compteur = 0;

        try{
            Scanner fluxLecture = new Scanner(fichier);
            while(fluxLecture.hasNextLine()){
                ligne = fluxLecture.nextLine();
                String[] parties = ligne.split(" ");
                String[] nomsComplet = parties[0].split("-");
                noms[compteur] = nomsComplet[0];
                prenoms[compteur] = nomsComplet[1];
                dates[compteur] = parties[1];
                datesDecoupees[compteur] = spliterDate(parties[1]);
                System.out.println("Le contenu de la ligne " + (compteur + 1) + " est : " + ligne);
                compteur++;
            }
        } catch(IOException e){
            System.out.println("Une erreur est arrivée!");
        }
    }

    public static int[] spliterDate(String dateChaine){
        String[] parties = dateChaine.split("/");
        int[] date = new int[3];

        for(int i = 0; i < parties.length; i++){
            try{
                date[i] = Integer.parseInt(parties[i]);
            } catch(NumberFormatException e){
                System.out.println("Erreur! Date invalide!");
            }
        }

        return date;
    }
}
