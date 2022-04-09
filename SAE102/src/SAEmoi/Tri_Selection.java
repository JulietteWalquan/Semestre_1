package SAEmoi;

import java.io.*;
import java.util.*;

public class Tri_Selection {
    static int[] tableau;
    static int[] copieTab;
    static int n = 1000;
    static boolean AFFICHAGE = true;

    public static void main(String[] args) throws FileNotFoundException {

        long start, stop;  //sert pour calculer le temps des tris
        tableau = new int[n];

        Random r = new Random();
        for (int i = 0; i <= n - 1; i++)
            tableau[i] = r.nextInt(1000);    //on remplit le tableau aléatoirement

        copieTab = (int[]) tableau.clone(); // on garde une copie pour pouvoir appliquer différentes méthodes de tri sur le même jeu de données

        if (AFFICHAGE) afficherTableau();
        System.out.println();

        start = System.nanoTime();
        triSelection();
        stop = System.nanoTime();

        if (AFFICHAGE) afficherTableau();


        System.out.println("temps de tri par sélection : " + (float) (stop - start) / 1000000 + " ms\n");

        tableau = (int[]) copieTab.clone(); // on remet le tableau dans l'état initial

    }

    public static void afficherTableau() {
        System.out.print("Tableau :");

        for (int i = 0; i <= n - 1; i++)
            System.out.print(" " + tableau[i]);

        System.out.println(".");

    }

    public static void triSelection() {

        int i, j, imin, temporaire;

        for (i = 0; i <= n - 2; i++) {
            imin = i;
            for (j = i + 1; j <= n - 1; j++) {
                if (tableau[j] < tableau[imin]) {
                    imin = j;
                }
            }
            temporaire = tableau[i];
            tableau[i] = tableau[imin];
            tableau[imin] = temporaire;
        }
    }

    public static List triSelectionTitre(List listeFilm) {
        int i, j, imin;

        for (i = 0; i <= listeFilm.size() - 2; i++) {
            imin = i;
            for (j = i; j <= listeFilm.size() - 1; j++) {
                if (Film.compareTitre.compare((Film) listeFilm.get(j), (Film) listeFilm.get(imin)) < 0) {
                    imin = j;
                }
            }
            Collections.swap(listeFilm, i, imin);
        }

        return listeFilm;
    }

    public static List triSelectionAnnee(List listeFilm) {
        int i, j, imin;

        for (i = 0; i <= listeFilm.size() - 2; i++) {
            imin = i;
            for (j = i; j <= listeFilm.size() - 1; j++) {
                if (Film.compareAnnee.compare((Film) listeFilm.get(j), (Film) listeFilm.get(imin)) < 0) {
                    imin = j;
                }
            }
            Collections.swap(listeFilm, i, imin);
        }

        return listeFilm;
    }

    public static List triSelectionNote(List listeFilm) {
        int i, j, imin;

        for (i = 0; i <= listeFilm.size() - 2; i++) {
            imin = i;
            for (j = i; j <= listeFilm.size() - 1; j++) {
                if (Film.compareNote.compare((Film) listeFilm.get(j), (Film) listeFilm.get(imin)) < 0) {
                    imin = j;
                }
            }
            Collections.swap(listeFilm, i, imin);
        }

        return listeFilm;
    }
}

