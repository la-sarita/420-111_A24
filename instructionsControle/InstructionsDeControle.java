public class InstructionsDeControle {
    public static void main(String[] args) {
        int nombre = 5;

        // Instruction conditionnelle if-else
        if (nombre > 0) {
            System.out.println("Le nombre est positif");
        } else if (nombre < 0) {
            System.out.println("Le nombre est négatif");
        } else {
            System.out.println("Le nombre est nul");
        }

        // Boucle for
        for (int i = 0; i < 3; i++) {
            System.out.println("Boucle for, i : " + i);
        }

        // Boucle while
        int j = 0;
        while (j < 3) {
            System.out.println("Boucle while, j : " + j);
            j++;
        }

        // Boucle do-while
        int k = 0;
        do {
            System.out.println("Boucle do-while, k : " + k);
            k++;
        } while (k < 3);

        // Instruction switch
        int jour = 2;
        switch (jour) {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            default:
                System.out.println("Jour inconnu");
                break;
        }

        // Utilisation de break et continue
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;  // Passe à l'itération suivante
            }
            if (i == 4) {
                break;  // Sort de la boucle
            }
            System.out.println("i : " + i);
        }
    }
}