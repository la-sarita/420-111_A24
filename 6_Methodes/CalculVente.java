
/**
 * Décrivez votre classe CalculVente ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class CalculVente
{
    public static void main(String[] args){
        afficherDescriptionProgramme();
        String nom = saisirNomProduit();
        double prix = saisirPrixUnitaireProduit();
        int quantite = saisirNombreProduitsVendus();
        double total = calculerTotal(prix, quantite);
        afficherInfosProduits(nom, prix, quantite, total);
    }
    
    public static void afficherDescriptionProgramme(){
        System.out.println("Ce programme calcule le total des ventes.");
    }
    
    public static String saisirNomProduit(){
        System.out.println("Veuillez entrer le nom du produit : ");
        String nomProduit = Clavier.lireString();
        
        return nomProduit;
    }
    
    public static double saisirPrixUnitaireProduit(){
        System.out.println("Veuillez entrer le prix du produit : ");
        // TODO: valider le prix unitaire et accepter valeurs positives
        // avant de le retourner
        return Clavier.lireDouble();
    }
    
    public static int saisirNombreProduitsVendus(){
        System.out.println("Veuillez entrer la quantité vendue du produit : ");
        // TODO: valider le nombre de produits et accepter valeurs positives
        // avant de le retourner
        return Clavier.lireInteger();
    }
    
    public static double calculerTotal(double prix, int quantite){
        return prix * quantite;
    }
    
    public static void afficherInfosProduits(String nom, double prixUnitaire, 
                                            int quantite, double total) {
        System.out.println("Produit : " + nom);
        System.out.println("Prix unitaire : " + prixUnitaire);
        System.out.println("Quantité : " + quantite);
        System.out.println("Total : " + total);
    }
}
