import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Décrivez votre classe GestionExceptions ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class GestionExceptions
{
    public static void main(String args[]) {
        exceptionDemo();
        arithmeticExceptionDemo();
        arrayIndexOutOfBoundExceptionDemo();
        classNotFoundExceptionDemo();
        nullPointerExceptionDemo();
        fileNotFoundExceptionDemo();
        numberFormatExceptionDemo();
        stringIndexOutOfBoundExceptionDemo();
        try{
            propagerFileNotFoundExceptionDemo();
        }catch(FileNotFoundException e){
            System.out.println("Fichier n'existe pas!");
        }
    }

    public static void exceptionNonGereeDemo() {
        int[] tableau = {1, 2, 3};
        System.out.println(tableau[5]); // Génère ArrayIndexOutOfBoundsException
        System.out.println("Cette ligne ne s'exécutera pas");

        System.out.println("On continue");
    }

    public static void exceptionDemo() {
        int[] tableau = {1, 2, 3};
        
        try {
            System.out.println(tableau[5]); // Génère ArrayIndexOutOfBoundsException
            System.out.println("Cette ligne ne s'exécutera pas");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : Index hors limites.");
        } finally {
            System.out.println("Bloc finally exécuté.");
        }
        System.out.println("On continue");
    }

    public static void arithmeticExceptionDemo(){
        int a = 30;
        int b = 0;

        try {
            int c = a / b; // cdivision par zero impossible
            System.out.println ("Result = " + c);
        } catch(ArithmeticException e) {
            System.out.println ("Impossible de diviser un nombre par 0");
        } 
    }

    public static void arrayIndexOutOfBoundExceptionDemo() {
        int a[] = new int[5];

        try {
            a[6] = 9; // acces 7eme element d'un tableau de taille 5
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Erreur : Index hors limites.");
        }
    }

    public static void classNotFoundExceptionDemo() {
        try{
            String chemin="/Un/chemin/vers/une/classe/qui/n'existe/pas";
            Class.forName(chemin);//levée d'une ClassNotFoundException
            System.out.println("fin du programme");
        }catch(ClassNotFoundException ex){
            System.out.println("Une exception est survenue");
        }
    }

    public static void nullPointerExceptionDemo() {
        String a = null; //null value

        try {
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }
    }

    public static void fileNotFoundExceptionDemo(){
        // Following file does not exist
        File file = new File("E://file.txt");
        try{
            FileReader fr = new FileReader(file);
        } catch(FileNotFoundException ex){
            System.out.println("Le fichier n'exist pas!");
        }
    }

    public static void numberFormatExceptionDemo() {
        try {
            // "allo" n'est pas un nombre
            int num = Integer.parseInt ("allo") ;
            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }

    public static void stringIndexOutOfBoundExceptionDemo() {
        String a = "This is like chipping "; // length est 22

        try {
            char c = a.charAt(24); // acces au 25eme element
            System.out.println(c);
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("Pas de caractère à cette position");
        }
    }

    public static void propagerFileNotFoundExceptionDemo() throws FileNotFoundException {
        // Following file does not exist
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);

    }
}
