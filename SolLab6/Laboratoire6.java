import java.util.Scanner;

/**
 * Décrivez votre classe Laboratoire6 ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Laboratoire6
{
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        exo6();
    }
    
    public static void exo6(){
        int[] nombres = stockerValeursDansTableau();
        int somme = sommeValeursTableau(nombres);
        //float moyenne = (float) somme / nombres.length; // ou
        float moyenne = Float.valueOf(somme) / nombres.length;
        int max = trouverMax(nombres);
        int min = trouverMin(nombres);
        
        System.out.printf("La somme des valeurs est : %d\n" +
                         "La moyenne des valeurs est : %.2f\n" + 
                         "Le plus grand nombre est : %d\n" + 
                         "Le plus petit nombre est : %d\n", 
                         somme, moyenne, max, min);
        
    }
    
    public static int[] stockerValeursDansTableau(){
        String entree = "";
        int nombre;
        int nbrValeurs = 0;
        int[] nombres = new int[5];
        
        do{
            System.out.println("Veuillez saisir un nombre ou fin pour s'arrêter");
            
            if(sc.hasNextInt()){
                nombre = sc.nextInt();
                
                if(nbrValeurs >= nombres.length){
                    nombres = redimentionner(nombres, 1);
                } 
                nombres[nbrValeurs] = nombre;
                nbrValeurs++;
            } else {
                entree = sc.next();
                
                if(!entree.toLowerCase().equals("fin")){
                    System.out.print("Erreur!");
                }
            }
        } while(!entree.toLowerCase().equals("fin"));
        
        return nombres;
    }
    
    public static int sommeValeursTableau(int[] nombres){
        int somme = 0;
        
        for(int nombre: nombres){
            somme += nombre; 
        }
        
        return somme;
    }
    
    public static int trouverMax(int[] tab){
       int max = Integer.MIN_VALUE;
       
       for(int nbre : tab){
           if(nbre > max){
               max = nbre;
           }
       }
       
       return max;
    }
    
    public static int trouverMin(int[] tab){
       int min = Integer.MAX_VALUE;
       
       for(int nbre : tab){
           if(nbre < min){
               min = nbre;
           }
       }
       
       return min;
    }
    
    public static int validerNombre(){
        int nombre;
        
        do{
            System.out.println("Veuillez saisir un nombre");

            // tester si l'entrée est de type entier ou non
            if(sc.hasNextInt()){ // cas d'entrée de type entier
                nombre = sc.nextInt();
            } else { // cas d'entrée pas de type entier
                sc.nextLine(); // vider le tompon
                System.out.println("entrée invalide!");
                nombre = Integer.MAX_VALUE; // mettre une valeur invalide pour que le code compile et je passe à la prochaine tentative (itération)
            }

        }while(nombre != Integer.MAX_VALUE);
        
        return nombre;
    }
    
    public static int[] redimentionner(int[] tab, int nbrCases){
        // 1. créer un tableau temporaire avec la taille du tableau + 1
        int[] temp = new int[tab.length + nbrCases];
        // 2. Copier les éléments du tableau dans le tableau temporaire
        for(int i = 0; i < tab.length; i++){
            temp[i] = tab[i];
        }

        return temp;
    }
}
