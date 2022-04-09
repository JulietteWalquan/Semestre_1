package SAE;

import java.util.ArrayList;
import java.util.List;

public class Tri {

    public void triSelection() {
        /*int i, j, imin, temporaire;

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
        }*/
    }


    public void fusion(List<Film> tab, int debut, int milieu, int fin) {
        /*int n1 = milieu - debut + 1;
        int n2 = fin - milieu;

        ArrayList[] G = new ArrayList[n1];
        int D[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            G[i] = tab.get(debut + i);
        }

        for (int j = 0; j < n2; j++) {
            D[j] = tab[milieu + 1 + j];
        }

        //Maintienr trois pointeurs, un pour chacun des deux tableaux et un pour
        //Maintenir l'index actuel du tableau trié final
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
        }*/
    }

    // Tri par fusion
    public void triFusion(List<Film> tab, int debut, int fin) {
        if (debut < fin) {
            //Trouvez le point milieu pour diviser le tableau en deux moitiés
            int m = (debut + fin) / 2;

            triFusion(tab, debut, m);
            triFusion(tab, (m+1), fin);

            //Fusionnez les deux moitiés triées
            fusion(tab, debut, m, fin);
        }
    }
}
