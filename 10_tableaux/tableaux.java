import java.util.Scanner;
import java.util.Arrays;

/**
 * Décrivez votre classe tableaux ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class tableaux{
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("#############   Tableau   ###############");
        System.out.println("## DECLARATION ##");
        int[] tableau;
        System.out.println("## ASSIGNATIONS ##");
        // Créez un tableau 
        tableau = new int[5];
        String[] villes = new String[3]; // déclaration et initialisation en une seule ligne
        int[] nombres = {1, 2, 3, 4, 5}; // Déclaration et initialisation avec des valeurs spécifiques
        
        System.out.println("## UTILISATIONS ##");
        int premierElement = tableau[0]; // Accès au premier élément 
        int dernierElement = nombres[nombres.length - 1]; // Accès au premier élément 
        System.out.println("Le premier élément de tableau est : " + premierElement);
        System.out.println("Le dernier élément de nombres est : " + dernierElement);
        System.out.println("Le premier élément de villes est : " + villes[0]);
        System.out.println("La valeur de l'élément à la position 2 de tableau avant modification est : "
                            + tableau[2]);
        tableau[2] = 10; // Modification du troisième élément
        System.out.println("La valeur de l'élément à la position 2 de tableau après modification est : "
                            + tableau[2]);
        nombres[1] = 25;  // Modifie le deuxième élément du tableau
        System.out.println(nombres[1]);  // Affiche 25
        
        int [] t7;
        // t7 = {2, 3, 7}; // ne compile pas
        t7 = new int[3];
        t7[0] = 2;
        t7[1] = 3;
        t7[2] = 7;
        
        // Afficher la taille d'un tableau        
        System.out.println("Taille du tableau nombres : " + nombres.length);  // Affiche 5
        System.out.println("Taille du tableau tableau: " + tableau.length);  // Affiche 5
        System.out.println("Taille du tableau villes : " + villes.length);  // Affiche 3

        // Afficher les éléments d'un tableau
        System.out.println("## BOUCLES FOR ##");
        for (int i = 0; i < tableau.length; i++) { 
            System.out.println(tableau[i]); 
        } 

        System.out.println("## BOUCLES FOREACH ##");
        for (int nombre : nombres) {
            System.out.println("Nombre : " + nombre);
        }
        
        for (String ville : villes) {
            System.out.println("Ville : " + ville);
        }
        
        villes[2] = "Quebec";
        
        System.out.println("## TABLEAU 2 DIMENSIONS (MATRICE) ##");
        int[][] matriceVide = new int[3][3]; // Tableau de 3x3 
        int[][] matrice = { 
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9} 
        };
        System.out.println(matrice[1][2]);
        
        int[][] tableau2D = new int[3][];
        tableau2D[0] = new int[2];
        tableau2D[2] = new int[3];
        tableau2D[2][2] = 5;
        System.out.println(tableau2D[0][0]);
        System.out.println(tableau2D[1]);
        System.out.println(tableau2D[2][2]);
        System.out.println(tableau2D[0].length);
        //System.out.println(tableau2D[1].length); // lève une exception (NullPointerException) 
        //car on ne peut par appeler des méthodes ou accèder à des attributs d'un objet null
        // Cela s'applique sur tous les types références (String par exemple)
        if(tableau2D[1] != null){
            System.out.println(tableau2D[1].length);
        }
        System.out.println(tableau2D[2].length);
        
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        double[] notes = {60, 55.5, 73.8};
        GestionNotes.afficherNotes(notes);
        System.out.println("Veuillez entrer une note : ");
        double note = sc.nextDouble();
        notes = GestionNotes.redimentionner(notes, note);
        GestionNotes.afficherNotes(notes);
        double[] notesTriees = GestionNotes.trierTableauCroissant(notes);
        System.out.println("Tableau trié croissant");
        GestionNotes.afficherNotes(notesTriees);
        System.out.println("Tableau trié décroissant");
        double[] notesTrieesDecroissant = GestionNotes.trierTableauDecroissant(notes);
        GestionNotes.afficherNotes(notesTrieesDecroissant);
        // Affiche l'adresse en mémoire du tableau notes
        System.out.println(notes);
        System.out.println(Arrays.toString(notes));
        
        double[] copieNotes = Arrays.copyOf(notes, notes.length);
        double[] autreCopie = copieNotes;
        System.out.println(Arrays.toString(copieNotes));
        Arrays.sort(copieNotes);
        System.out.println(Arrays.toString(copieNotes));
        System.out.println(Arrays.toString(autreCopie));
        System.out.println(Arrays.toString(notes));
    }
    
    public static void revision(){
        String[] villes = {"Montreal", "New York", "Paris"};
        double[] revenus = {1400065, 1455566, 200514};
        
        // trouver la position du max de revenus 
        int posMaxRevenu = trouverPosMaxRevenu(revenus);
        System.out.println("La ville qui a le plus grand revenu est : "
                    + villes[posMaxRevenu]);
        int posNomVille = trouverVilleCommenceParNom(villes, "New");
        System.out.println(posNomVille != -1 ? villes[posNomVille] : "Aucune ville");
    }
    
    public static int trouverPosMaxRevenu(double[] revenus){
        // TODO : implémenter la comparaison des éléments à l'aide de la boucle for
        return 1;
    }
    
    public static int trouverVilleCommenceParNom(String[] villes, String nom){
        for(int i = 0; i < villes.length; i++){
            if(villes[i].startsWith(nom)){
                return i;
            }
        }
        return -1;
    }
}
