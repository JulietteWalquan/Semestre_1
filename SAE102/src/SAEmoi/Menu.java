package SAEmoi;

import java.io.*;
import java.util.*;

public class Menu {
    List<Film> films = new LinkedList<>();

    public File menu_Fichiers(int a) throws FileNotFoundException {
        int reponse = 0;
        String pathname;
        int x = 0;

        switch (x) {
            case 1:
                System.out.println("Vous avez sélectionné‚ le choix " + x);
                File file1 = new File("D:\\BUT Informatique\\Semestre 1\\SAE 1.02\\IMDbmoviesFULL.tsv");
                return file1;

            case 2:
                System.out.println("vous avez selectionné‚ le choix " + x);
                File file2 = new File("D:\\BUT Informatique\\Semestre 1\\SAE 1.02\\IMDbmoviesCUT40000.tsv");
                return file2;

            case 3:
                System.out.println("vous avez selectionné‚ le choix " + x);
                File file3 = new File("D:\\BUT Informatique\\Semestre 1\\SAE 1.02\\IMDbmoviesCUT10000.tsv");
                return file3;

            case 4:
                System.out.println("vous avez selectionné‚ le choix " + x);
                File file4 = new File("D:\\BUT Informatique\\Semestre 1\\SAE 1.02\\IMDbmoviesCUT1000.tsv");
                return file4;


            case 5:
                System.out.println("vous avez selectionné‚ le choix " + x);
                File file5 = new File("D:\\BUT Informatique\\Semestre 1\\SAE 1.02\\IMDbmoviesCUT100.tsv");
                return file5;


            default:
                File file6 = new File("D:\\BUT Informatique\\Semestre 1\\SAE 1.02\\IMDbmoviesCUT100.tsv");
                return file6;

        }
    }

    public int menu_Action(int y, File file1) throws FileNotFoundException {
        int c = 0;
        int rep3;

        Scanner scanner = new Scanner(file1, "UTF-8");

        switch (y) {
            case 1://Afficher les données
                System.out.println("vous avez selectionné le choix " + y);

                List listeFilm = Cinematheque.List(file1);
                int k;
                for (k = 0; k < listeFilm.size(); k++) {
                    System.out.println(listeFilm.get(k));
                }
                break;

            case 2://Trie des données
                System.out.println("vous avez selectionné‚ le choix " + y);

                listeFilm = Cinematheque.List(file1);

                System.out.println("Quelle donnée souhaitez-vous trier ?");
                System.out.println("1- Titre du film");
                System.out.println("2- Année de réalisation");
                System.out.println("3- Moyenne des votes des spectateurs");
                System.out.println("Entrez le numéro correspondant à votre choix");
                c = SAEmoi.scanner.lireInt();
                menu_Tri(c, listeFilm);
                break;

            case 3:
                System.out.println("vous avez selectionné‚ le choix " + y);
                break;
            case 4:
                System.out.println("vous avez selectionné‚ le choix " + y);
                break;
            case 5:
                System.out.println("vous avez selectionné‚ le choix " + y);
                listeFilm = Cinematheque.List(file1);
                suppression(listeFilm);
                break;
            case 6:
                System.out.print("vous avez sélectionné le choix"+y);
            default: {
                System.out.println("vous n'avez selectionné‚ aucun choix ");
            }
        }
        return y;
    }

    public void suppression(List listeFilm) {

        do {
            listeFilm.remove(0);
        } while (!listeFilm.isEmpty());

        System.out.println("La liste a été vidée de toutes ses donées.");
    }


    public int menu_Tri(int z, List listeFilm) {
        int m = 0;

        switch (z) {
            case 1:
                System.out.println("vous avez selectionné‚ le choix " + z); // Titre du film

                //menu pour choisir le type de tri
                System.out.println("Quel type de tri souhaitez vous effectuer?");
                System.out.println("1- Tri Sélection");
                System.out.println("2- Tri Fusion");
                System.out.println("3- Tri Java");
                System.out.println("Entrer le numéro correspondant à votre choix");
                m = SAEmoi.scanner.lireInt();

                if (m == 1) {
                    // tri sélection

                    SAEmoi.Tri_Selection.triSelectionTitre(listeFilm);
                    for (int i = 0; i < listeFilm.size(); i++) {
                        System.out.println(listeFilm.get(i).toString());
                    }
                } else if (m == 2) {
                    // tri fusion

                } else if (m == 3) {
                    // tri java
                    Collections.sort(listeFilm, Film.compareTitre);
                    for (int i = 0; i < listeFilm.size(); i++) {
                        System.out.println(listeFilm.get(i).toString());
                    }
                }

                break;


            case 2:
                System.out.println("vous avez selectionné‚ le choix " + z); // Année de réalisation

                //menu pour choisir le type de tri
                System.out.println("Quel type de tri souhaitez vous effectuer?");
                System.out.println("1- Tri Sélection");
                System.out.println("2- Tri Fusion");
                System.out.println("3- Tri Java");
                System.out.println("Entrer le numéro correspondant à votre choix");
                m = SAEmoi.scanner.lireInt();

                if (m == 1) {
                    // tri sélection

                    SAEmoi.Tri_Selection.triSelectionAnnee(listeFilm);
                    for (int i = 0; i < listeFilm.size(); i++) {
                        System.out.println(listeFilm.get(i).toString());
                    }
                } else if (m == 2) {
                    // tri fusion

                } else if (m == 3) {
                    // tri java
                    Collections.sort(listeFilm, Film.compareTitre);
                    for (int i = 0; i < listeFilm.size(); i++) {
                        System.out.println(listeFilm.get(i).toString());
                    }
                }
                break;


            case 3:
                System.out.println("vous avez selectionné‚ le choix " + z); // Moyenne des votes des spectateurs

                //menu pour choisir le type de tri
                System.out.println("Quel type de tri souhaitez vous effectuer?");
                System.out.println("1- Tri Sélection");
                System.out.println("2- Tri Fusion");
                System.out.println("3- Tri Java");
                System.out.println("Entrer le numéro correspondant à votre choix");
                m = SAEmoi.scanner.lireInt();

                if (m == 1) {
                    // tri sélection

                    SAEmoi.Tri_Selection.triSelectionNote(listeFilm);
                    for (int i = 0; i < listeFilm.size(); i++) {
                        System.out.println(listeFilm.get(i).toString());
                    }
                } else if (m == 2) {
                    // tri fusion

                } else if (m == 3) {
                    // tri java
                    Collections.sort(listeFilm, Film.compareTitre);
                    for (int i = 0; i < listeFilm.size(); i++) {
                        System.out.println(listeFilm.get(i).toString());
                    }
                }
                break;

            default: {
                System.out.println("vous n'avez selectionné‚ aucun choix ");
            }
        }
        return z;
    }


}

