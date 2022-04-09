package SAEmoi;

import java.util.Random;

public class Tri_Fusion {

    static int[] tableau;
    static int[] copieTab;
    static int n = 1000;
    static boolean AFFICHAGE = true;

    public int getN() {
        return n;
    }

    public  static void main(String[] args){
        long start, stop;  //sert pour calculer le temps des tris
        tableau = new int[n];

        Random r = new Random();
        for (int i = 0; i <= n - 1; i++)
            tableau[i] = r.nextInt(1000);    //on remplit le tableau aléatoirement

        copieTab = (int[]) tableau.clone(); // on garde une copie pour pouvoir appliquer différentes méthodes de tri sur le même jeu de données

        if (AFFICHAGE) afficherTableau();
        System.out.println();

        tableau = (int[]) copieTab.clone(); // on remet le tableau dans l'état initial

        start = System.nanoTime();
        triFusion(tableau, 0, n-1);
        stop = System.nanoTime();

        if (AFFICHAGE) afficherTableau();
        System.out.println("temps de tri fusion : " + (float) (stop - start) / 1000000 + " ms\n");

    }

    public static void afficherTableau() {
        System.out.print("Tableau :");
        for (int i = 0; i <= n - 1; i++){
            System.out.print(" " + tableau[i]);
        }
        System.out.println(".");

    }

    public static void fusion(int tab[], int debut, int milieu, int fin) {
        int n1 = milieu - debut + 1;
        int n2 = fin - milieu;

        int G[] = new int[n1];
        int D[] = new int[n2];

        for (int i = 0; i < n1; i++)
            G[i] = tab[debut + i];
        for (int j = 0; j < n2; j++)
            D[j] = tab[milieu + 1 + j];

        // maintient trois pointeurs, un pour chacun des deux tableaux et un pour
        // maintenir l'index actuel du tableau trié final
        int i, j, k;
        i = 0;
        j = 0;
        k = debut;

        while (i < n1 && j < n2) {
            if (G[i] <= D[j]) {
                tab[k] = G[i];
                i++;
            } else {
                tab[k] = D[j];
                j++;
            }
            k++;
        }

        // Copiez tous les éléments restants du tableau non vide
        while (i < n1) {
            tab[k] = G[i];
            i++;
            k++;
        }

        while (j < n2) {
            tab[k] = D[j];
            j++;
            k++;
        }
    }

    // Tri par fusion
    private static void triFusion(int tab[], int debut, int fin) {
        if (debut < fin) {

            // Trouvez le point milieu pour diviser le tableau en deux moitiés
            int m = (debut + fin) / 2;

            triFusion(tab, debut, m);
            triFusion(tab, (m+1), fin);

            // Fusionnez les deux moitiés triées
            fusion(tab, debut, m, fin);
        }
    }

}

