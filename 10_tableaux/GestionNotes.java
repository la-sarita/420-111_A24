
/**
 * Décrivez votre classe GestionNotes ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class GestionNotes
{
    public static double[] redimentionner(double[] tab, double valeur){
        // 1. créer un tableau temporaire avec la taille du tableau + 1
        double[] temp = new double[tab.length + 1];
        // 2. Copier les éléments du tableau dans le tableau temporaire
        for(int i = 0; i < tab.length; i++){
            temp[i] = tab[i];
        }
        // 3. Ajouter la nouvelle valeur dans le tableau temporaire
        temp[temp.length - 1] = valeur;
        // 4. Faire pointer le tableau vers l'espace mémoire du tableau temporaire
        tab = temp;
        
        return tab;
    }
        
    public static double trouverMin(double[] notes){
        double min = Double.MAX_VALUE;
        
        for(double note : notes){
            if(note < min){
                min = note;
            }
        }
        
        return min;
    }
    
    public static double[] trierTableauCroissant(double[] tab){
        // Créer un tableau de la même taille que le tableau à trier
        double[] tabTrie = new double[tab.length];
        
        for(int i = 0; i < tabTrie.length; i++){
            double min = trouverMin(tab);
            tabTrie[i] = min;
            tab = exclureVal(tab, min);
        }
 
        return tabTrie;
    }
    
    public static double[] exclureVal(double[] tab, double val){
        double[] temp = new double[tab.length - 1];
        
        int pos = 0;
        
        for(int i = 0; i < tab.length; i++){
            if(tab[i] != val){
                temp[pos] = tab[i];
                pos++;
            }
        }
        
        return temp;
    }
    
    public static void afficherNotes(double[] notes){
        for(double note: notes){
            System.out.print(note + ", ");
        }
        System.out.println();
    }
    
    public static double[] trierTableauDecroissant(double[] tab){
        for(int j = 0; j < tab.length; j++){
            for(int i = 0; i < tab.length -1; i++){
                if(tab[i + 1] > tab[i]){
                    double temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                }
            }
        }
        
        return tab;
    }
}
