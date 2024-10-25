
/**
 * Décrivez votre classe ManipulationChainesDeCaracteres ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class ManipulationChainesDeCaracteres
{
    static String s1 = "Bonjour";
    
    public static void main(String[] args){
        int taille = s1.length();
        System.out.println(taille);
        
        // Si chaine vide ou conteint que des espaces
        System.out.println(s1.isBlank()); // false
        System.out.println("".isBlank()); // true
        System.out.println("    ".isBlank()); // true
        
        char premiereLetter = s1.charAt(0); // 'B'
        char derniereLettre = s1.charAt(taille - 1); // ou = s1.charAt(s1.length() - 1);
        
        // Itérer sur une chaine de caractères
        afficherCaracteresChaine(s1);
        
        // extraire une sous-chaine
        String sousChaine = s1.substring(0, 3); // Retourne "Bon"
        System.out.println(sousChaine);
        
        //remplacement de caractères
        String remplace1 = s1.replace('o', 'a'); // Retourne "Banjaur"
        String remplace2 = s1.replace("jour", "soir"); // Retourne "Bonsoir"
        System.out.println(remplace1);
        System.out.println(remplace2);
        
        // System.out.println('a' == 97);
        // System.out.println('A' == 65);
    }
    
    public static void exempleTransformationNomFichier(){
        String titre1 = "Introduction à la programmation Java";
        String extension = ".pdf";
        String nomFichier1 = remplacerCharacteres(titre1, extension);
        String nomFichier2 = remplacerCharacteres("Les méthodes", extension);
        
        System.out.println(nomFichier1);
        System.out.println(nomFichier2);
    }
    
    public static String remplacerCharacteres(String chaine, String extension){
        String chaineRemplacee = chaine.replace(' ', '_')
                                      .replace('à', 'a')
                                      .replace('é','e')
                                      .substring(1)
                                      .toLowerCase();
        String premiereLettre = chaine.substring(0,1).toUpperCase();
        
        return premiereLettre + chaineRemplacee + extension;
    }
    
    public static void afficherCaracteresChaine(String chaine){
        for(int i = 0; i < chaine.length(); i++){
            char caractCourant = chaine.charAt(i);
            System.out.println(caractCourant);
        }
    }
    
    public static void comparaisonChaines(){
        String s2 = "Bonjour";
        String s3 = "Hello!";
        String s4 = "bonjour";
        String s5 = new String("Bonjour");
        
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1 == s4); // false
        System.out.println(s1 == s5); // false
        
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false 
        System.out.println(s1.equals(s4)); // flase
        System.out.println(s1.equals(s5)); // true
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println(s1.equalsIgnoreCase(s4)); // true
        
        int compare = s1.compareTo(s2); // 0
        System.out.println(compare);
        // Utile dans les cas des tris
        System.out.println(s1.compareTo(s3)); // -6 != 0
        System.out.println(s1.compareTo(s4)); // -32 != 0
        System.out.println(s1.compareTo("Allo!")); // 1
        System.out.println(s1.compareTo("allo!")); // -31 ('B' - 'a')
        
        int compareIgnoreCase = s1.compareToIgnoreCase(s4);
        System.out.println(compareIgnoreCase);
        
        boolean estEgal = s1.equals(s2);
    }
    
    public static void rechercheDansChaine(){
        String chaineRech = "jour";
        int index = s1.indexOf(chaineRech);
        System.out.println(index);
        boolean trouve = index != -1;
        System.out.println(s1.indexOf("Jour")); // -1 ('j' != 'J')
        System.out.println(s1.indexOf("jour", 3));  // 3 à partir de la position 3 on cherche "jour" dans "jour"
        System.out.println(s1.indexOf("jour", 4));  // -1 à partir de la position 4 on cherche "jour" dans "our"
        System.out.println(trouve);
        
        System.out.println(s1.indexOf('o'));
        System.out.println(s1.lastIndexOf('o'));
        
        System.out.println("La chaine \"" + chaineRech + (trouve ? "\" existe" : "\" n'existe pas"));
        System.out.println(s1.contains(chaineRech));
        System.out.println();
    }
    
    // Exemples suggérés :
    // Trouver la première lettre dans une phrase
    // Trouver la dernière lettre dans une phrase
    // Méthode pour afficher uniquement les chiffres dans une chaine de caractère
    // Méthode pour afficher uniquement les lettres dans une chaine de caractère
}
