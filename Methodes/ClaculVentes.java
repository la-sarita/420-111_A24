
/**
 * Décrivez votre classe ClaculVentes ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class ClaculVentes
{
    public static void main(String[] args){
        afficherDescriptionProgramme();
        String nom = saisirNomProduit();
        double prix = saisirPrixUnitaireProduit();
        int quantite = saisirNombreProduitsVendus();
        double total = calculerTotal(prix, quantite);
        afficherInfosProduits(nom, prix, quantite, total);
    }

    public static void afficherDescriptionProgramme() {
        System.out.println("Ce programme calcule le total des ventes.");
    }
    
    public static String saisirNomProduit(){
        System.out.print("Veuilez entrer le nom du produit : ");
        
        return Clavier.lireString();
    }
    
    public static double saisirPrixUnitaireProduit(){
        System.out.print("Veuilez entrer le prix unitaire du produit : ");
        double prixUnitaire = Clavier.lireDouble();
        
        return prixUnitaire;
    }
    
    public static int saisirNombreProduitsVendus(){
        System.out.print("Veuilez entrer la quantité vendue du produit : ");
        int quantite = Clavier.lireInteger();
        
        return quantite;
    }

    public static double calculerTotal(double prixUnitaire, int quantite) {
        return prixUnitaire * quantite;
    }

    public static void afficherInfosProduits(String nom, double prixUnitaire, int quantite, double total) {
        System.out.println("Produit : " + nom);
        System.out.println("Prix unitaire : " + prixUnitaire);
        System.out.println("Quantité : " + quantite);
        System.out.println("Total : " + total);
    }
}
