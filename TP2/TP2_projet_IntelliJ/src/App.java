
/**
 * TP2 - 420-111 (A24)
 * Classe principale qui gère le flux du programme de gestion de scolarité, incluant la navigation dans le menu
 * et l'exécution des différentes fonctionnalités.
 *
 * @author Sara Boumehraz
 * @version 18/11/2024
 * <p>
 * [Votre nom et prénom]
 * [Votre numDA]
 */
public class App {
    // Les variables de classe (statiques)
    private static int nbrEtudiants;
    private static float[][] notes;
    private static int nbrEvals;
    private static String[][] etudiants;
    private static String[] evals;
    private static int[] ponderations;
    private static float[] moyenneEvals;
    private static float[] moyenneEtudiants;
    private static float moyenneClasse;
    private static float[] notesPlusFortesEtudiants;
    private static float[] notesPlusFaiblesEtudiants;
    private static float[] notesPlusFortesEvals;
    private static float[] notesPlusFaiblesEvals;
    private static String stats;
    private static int nbrEtudiantsSucces;

    // Les méthodes de classe (statiques)
    public static void main(String[] args) {
        try {
            demarrerProgramme();
        } catch (NombreEtudiantsDepasseCapaciteException e) {
            System.out.println(e.getMessage());
        } catch (SommePonderationsInvalideException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(Utilitaire.MSG_QUITTER_PROGRAMME);
        }
    }

    /**
     * Démarre le programme et gère le menu principal.
     *
     * @throws NombreEtudiantsDepasseCapaciteException Si le nombre d'étudiants dépasse la capacité.
     * @throws SommePonderationsInvalideException      Si une exception liée à la somme des évaluations est levée.
     */
    public static void demarrerProgramme() throws NombreEtudiantsDepasseCapaciteException, SommePonderationsInvalideException {
        int option;

        System.out.println(Utilitaire.DESCRIPTION_PROGRAMME);
        do {
            option = Validations.validerNombre(Utilitaire.MENU_PRINCIPAL, Utilitaire.PERMIERE_OPTION,
                    Utilitaire.DERNIERE_OPTION);
            appliquerOption(option);
        } while (option != Utilitaire.DERNIERE_OPTION);
    }

    /**
     * Applique l'option sélectionnée par l'utilisateur dans le menu.
     *
     * @param option Numéro de l'option choisie.
     * @throws NombreEtudiantsDepasseCapaciteException Si une exception liée au nombre d'étudiants est levée.
     * @throws SommePonderationsInvalideException      Si une exception liée à la somme des évaluations est levée.
     */
    public static void appliquerOption(int option) throws NombreEtudiantsDepasseCapaciteException, SommePonderationsInvalideException {
        // TODO : à implémenter
        // Ajouter un switch case pour les 11 options
    }

    /////////////////////////////////////////////////////////////
    //   Méthodes pour appliquer les options du menu pricipal //
    /////////////////////////////////////////////////////////////

    /**
     * Crée une classe d'étudiants et initialise leurs données.
     * (Option 1)
     *
     * @throws NombreEtudiantsDepasseCapaciteException Si le nombre d'étudiants dépasse la capacité.
     */
    public static void creerClasseEtudiants() throws NombreEtudiantsDepasseCapaciteException {
        nbrEtudiants = Validations.validerNbrEtudiants();
        etudiants = new String[3][nbrEtudiants];
        entrerNomsEtudiants();
    }

    /**
     * Crée une grille d'évaluations pour les étudiants.
     * (Option 2)
     *
     * @throws SommePonderationsInvalideException Si une exception liée à la somme des évaluations est levée.
     */
    private static void creerGrilleEvaluation() throws SommePonderationsInvalideException {
        // TODO : à implémenter
        // utiliser validerNombre() pour initialiser nbrEvals
        // initialiser le tableau evals et le tableau ponderations avec la taille nbrEvals
        // boucle avec nbrEval itérations qui appelle validerNomEval() pour insérer les noms des evals
        // et validerNombre() la ponderation
    }

    /**
     * Affiche la liste des étudiants dans un tableau formaté.
     * (Option 3)
     */
    private static void afficherListeEtudiants() {
        if (etudiants != null) {
            System.out.println(Utilitaire.MSG_AFFICHER_LISTE_ETUDIANTS + obtenirListeEtudiants());
        } else {
            System.out.println(Utilitaire.MSG_ERR_CLASSE_INEXISTANTE);
        }
    }

    /**
     * Affiche la liste des évaluations et leurs pondérations.
     * (Option 4)
     */
    private static void afficherListeEvals() {
        if (etudiants != null) {
            System.out.println(Utilitaire.MSG_AFFICHER_LISTE_EVALS + obtenirListeEvals());
        } else {
            System.out.println(Utilitaire.MSG_ERR_CLASSE_INEXISTANTE);
        }
    }

    /**
     * Gère l'entrée ou la modification des résultats selon les options disponibles.
     * (Option 5)
     */
    private static void entrerResultats() {
        // TODO : à implémenter
    }

    /**
     * Calcule les résultats des étudiants et des évaluations puis les sauvegarder.
     * (Option 6)
     */
    private static void calculerResultats() {
        // calculer et affecter les résultats des calculs des variables de classe :
        // moyenneEvals, moyenneEtudiants, moyenneClasse, notesPlusFortesEtudiants, notesPlusFaiblesEtudiants
        // notesPlusFortesEvals, notesPlusFaiblesEvals, nbrEtudiantsSucces, (nbrEtudiants - nbrEtudiantsSucces)
        // stats = String.format(RAPPORT_STATS,  ....)
        // TODO : à implémenter
    }

    /**
     * Affiche les résultats des étudiants sous forme de tableau.
     * (Option 7 est déjà implémentée)
     */
    private static void afficherResultats() {
        if (etudiants != null) {
            System.out.println(Utilitaire.MSG_AFFICHER_STATS + obtenirResultats());
        } else {
            System.out.println(Utilitaire.MSG_ERR_CLASSE_INEXISTANTE);
        }
    }

    /**
     * Affiche les statistiques calculées sous forme de tableau ou de résumé.
     * (Option 8 est déjà implémentée)
     */
    private static void afficherStatistiques() {
        if (etudiants != null) {
            System.out.println(stats != null ? stats : Utilitaire.AUCUNE_STATISTIQUE_CALCULEE);
        } else {
            System.out.println(Utilitaire.MSG_ERR_CLASSE_INEXISTANTE);
        }
    }

    /**
     * Trie les résultats selon des critères définis ('c' : croissant, 'd' : décroissant).
     * (Option 9 : bonus)
     */
    private static void trierResultats() {
        // TODO: trier les tableau selon la moyenne des étudiants ('c' : croissant, 'd' : décroissant)
    }

    /**
     * Crée les rapports des : liste des étudiants, liste des évaluations, des résultats et les statistiques,
     * puis l'enregistre dans des fichiers.
     * (Option 10)
     */
    private static void creerRapportResultats() {
        // TODO : à implémenter
    }

    /**
     * Ferme le scanner et affiche un message de sortie avant de quitter le programme.
     * (Option 11)
     */
    private static void quitterProgramme() {
        // TODO : à implémenter
    }

    ////////////////////////////////////////////////////////////////////////////
    //   Sous-méthodes appelées par les méthodes des options du menu pricipal //
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Permet de formater et retourner les informations des étudiants de la classe dans un tableau
     *
     * @return la liste des étudiants (leur code étudiant, nom et prénom)
     */
    private static String obtenirListeEtudiants() {
        // TODO : à implémenter
        // S'inspirer de l'exemple dans la méthode genererStatsEtudiants()
        return null;
    }

    /**
     * Permet de formater et retourner les informations des évaluations du cours dans un tableau
     *
     * @return la liste des évaluations (leur numéro, nom et pondération)
     */
    private static String obtenirListeEvals() {
        // TODO : à implémenter
        // S'inspirer de l'exemple dans la méthode genererStatsEtudiants()
        return null;
    }

    /**
     * Permet de formater et retourner les résultats de la classe dans un tableau
     *
     * @return les résultats de la classe
     */
    private static String obtenirResultats() {
        String entete = "\n|          Nom et prenom         |";

        for (String eval : evals) {
            entete += String.format(" %15s |", eval);
        }

        return Utilitaire.assemblerTableau(entete, construireContenuResultat());
    }

    /**
     * Demande à l'utilisateur de saisir les noms des étudiants et génère leurs codes uniques.
     */
    private static void entrerNomsEtudiants() {
        // TODO : à implémenter
        // boucle nbrEtudiants itérations
        // appeler validerNomEtudiant qui retourne un tableau de 2 dimensions
        // pos 0 est le nom
        // pos 1 est le prénom
    }

    /**
     * Option : 5 -> a
     * Gère l'entrée des notes pour tous les étudiants ou toutes les évaluations.
     */
    private static void saisirNotesEtudiants() {
        char choix = Validations.validerLettre(Utilitaire.MENU_ENTRER_NOTES_ETUDIANTS,
                Utilitaire.MSG_ERR_ENTRER_NOTES, Utilitaire.OPTIONS_ENTREE_NOTES_TOUS_ETUDIANTS);
        // TODO : à implémenter
    }

    /**
     * Construit un tableau formaté contenant les résultats des étudiants.
     *
     * @return Une chaîne représentant le tableau des résultats.
     */
    private static String construireContenuResultat() {
        String resultats = "";

        for (int i = 0; i < nbrEtudiants; i++) {
            resultats += String.format("\n| %-30s |", Utilitaire.recupererNomComplet(etudiants, i));
            for (int j = 0; j < nbrEvals; j++) {
                resultats += String.format(" %15.2f |", notes[i][j]);
            }
        }

        return resultats;
    }

    /**
     * Sauvegarde les statistiques calculées des résultats puis les afficher.
     *
     * @param moyenneEvals              Les moyennes des évaluations.
     * @param moyenneEtudiants          Les moyennes des étudiants.
     * @param moyenneClasse             La moyenne générale de la classe.
     * @param notesPlusFortesEtudiants  Les meilleures notes des étudiants.
     * @param notesPlusFaiblesEtudiants Les pires notes des étudiants.
     * @param notesPlusFortesEvals      Les meilleures notes des évaluations.
     * @param notesPlusFaiblesEvals     Les pires notes des évaluations.
     * @param nbrEtudiantsSucces
     */
    private static void sauvegarderStats(float[] moyenneEvals, float[] moyenneEtudiants, float moyenneClasse,
                                         float[] notesPlusFortesEtudiants, float[] notesPlusFaiblesEtudiants,
                                         float[] notesPlusFortesEvals, float[] notesPlusFaiblesEvals, int nbrEtudiantsSucces) {
        stats = String.format(Utilitaire.RAPPORT_STATS,
                genererStatsEtudiants(notesPlusFortesEtudiants, notesPlusFaiblesEtudiants, moyenneEtudiants),
                genererStatsEvals(notesPlusFortesEvals, notesPlusFaiblesEvals, moyenneEvals),
                moyenneClasse, nbrEtudiantsSucces, nbrEtudiants, (nbrEtudiants - nbrEtudiantsSucces), nbrEtudiants);
        System.out.println(Utilitaire.MSG_STATS_CALCULEES);
    }

    /**
     * Construit un tableau contenant les statistiques par étudiant.
     *
     * @param meilleuresNotes Les meilleures notes des étudiants.
     * @param pireNotes       Les pires notes des étudiants.
     * @param moyennes        Les moyennes des étudiants.
     * @return Une chaîne contenant les statistiques par étudiant.
     */
    private static String genererStatsEtudiants(float[] meilleuresNotes, float[] pireNotes, float[] moyennes) {
        String donnees = "";

        for (int i = 0; i < nbrEtudiants; i++) {
            donnees += String.format(Utilitaire.FORMAT_COLLONNES_STATS_ETUDIANTS,
                    Utilitaire.recupererNomComplet(etudiants, i), meilleuresNotes[i], pireNotes[i],
                    moyennes[i], (moyennes[i] >= Utilitaire.NOTE_PASSAGE ? Utilitaire.SUCCES : Utilitaire.ECHEC));
        }

        return Utilitaire.assemblerTableau(Utilitaire.ENTETE_STATS_ETUDIANTS, donnees);
    }

    /**
     * Construit un tableau contenant les statistiques par évaluation.
     *
     * @param meilleuresNotes Les meilleures notes des évaluations.
     * @param pireNotes       Les pires notes des évaluations.
     * @param moyennes        Les moyennes des évaluations.
     * @return Une chaîne contenant les statistiques par évaluation.
     */
    private static String genererStatsEvals(float[] meilleuresNotes, float[] pireNotes, float[] moyennes) {
        // TODO : à implémenter
        // S'inspirer de la méthode : genererStatsEtudiants()
        return null;
    }

    /**
     * Option : 5 -> v
     *
     * Permet de saisir les notes pour une évaluation spécifique.
     */
    private static void saisirNotesDuneEvaluation() {
        // TODO : à implémenter
    }

    /**
     * Option : 5 -> e
     * Permet de saisir les notes pour un étudiant spécifique.
     */
    private static void saisirNotesDunEtudiant() {
        int posEtudiant = Validations.validerCodeEtudiant(etudiants);
        notes[posEtudiant] = Validations.validerNotes(Utilitaire.MSG_ENTRER_NOTES, Utilitaire.ETUDIANT,
                Utilitaire.recupererNomComplet(etudiants, posEtudiant), Utilitaire.MSG_ERR_ENTRER_NOTES, nbrEvals);

    }

    /**
     * Option : 5 -> a -> v
     * Permet de saisir les notes pour une évaluation donnée en parcourant les étudiants.
     */
    private static void entrerNotesParEvaluation() {
        // TODO : à implémenter
    }

    /**
     * Option : 5 -> a -> e
     *
     * Permet de saisir les notes pour chaque étudiant en parcourant toutes les évaluations.
     */
    private static void entrerNotesParEtudiant() {
        // TODO : à implémenter
    }

    /**
     * Option : 5 -> n
     * Permet de saisir la note pour une évaluation spécifique d'un étudiant.
     */
    private static void saisirNotesDuneEvaluationDunEtudiant() {
        int posEtudiant = Validations.validerCodeEtudiant(etudiants);
        int posEval = Validations.validerNumEval(nbrEvals) - 1;
        float note = Validations.validerNote(evals[posEval]);

        notes[posEtudiant][posEval] = note;
    }

}
