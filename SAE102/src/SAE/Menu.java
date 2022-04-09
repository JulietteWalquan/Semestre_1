package SAE;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Menu {
    Cinematheque cinematheque = new Cinematheque();
    Clavier clavier = new Clavier();
    Clavier clavierString = new Clavier();
    List<Film> listeFilm;
    public List<Film> listeFilmArray = new ArrayList<>();
    public List<Film> listeFilmLinked = new LinkedList<>();

    public File menu_Fichiers() {
        System.out.println("Quel fichier de données voulez-vous charger?");
        System.out.println("1 - Fichier avec 80 944 films");
        System.out.println("2 - Fichier avec 40 000 films");
        System.out.println("3 - Fichier avec 10 000 films");
        System.out.println("4 - Fichier avec 1 000 films");
        System.out.println("5 - Fichier avec 100 films");
        System.out.println();
        System.out.println("Votre choix ?");


        int a = clavier.lireInt();
        System.out.println();
        switch (a) {
            case 1 -> {
                return new File("D:\\BUT Informatique\\Semestre 1\\SAE 1.02\\IMDbmoviesFULL.tsv");
            }
            case 2 -> {
                return new File("D:\\BUT Informatique\\Semestre 1\\SAE 1.02\\IMDbmoviesCUT40000.tsv");
            }
            case 3 -> {
                return new File("D:\\BUT Informatique\\Semestre 1\\SAE 1.02\\IMDbmoviesCUT10000.tsv");
            }
            case 4 -> {
                return new File("D:\\BUT Informatique\\Semestre 1\\SAE 1.02\\IMDbmoviesCUT1000.tsv");
            }
            default -> {
                return new File("D:\\BUT Informatique\\Semestre 1\\SAE 1.02\\IMDbmoviesCUT100.tsv");
            }
        }
    }

    public void menu_Action(File file1) throws FileNotFoundException {
        menuList(file1);
        int b = 0;

        while (b != 7) {
            System.out.println("Que souhaitez vous faire?");
            System.out.println("1 - Afficher les données");
            System.out.println("2 - Trier les données");
            System.out.println("3 - Filtrer les données");
            System.out.println("4 - Rechercher un film");
            System.out.println("5 - Suppression des données");
            System.out.println("6 - Sauvegarder une requête dans un fichier");
            System.out.println("7 - Quitter l'application");
            System.out.println();
            System.out.println("Votre choix ?");
            b = clavier.lireInt();

            switch (b) {
                //Afficher les données
                case 1 -> affichage();

                //Tri des données
                case 2 -> menu_Tri();

                //Filtrer les données
                case 3 -> menu_Filtre();

                //Rechercher un film
                case 4 -> menu_Recherche();

                //Supprimer des données une à une
                case 5 -> suppression();

                //Sauvegarder une requête dans un fichier
                case 6 -> menu_Sauvegarde();
            }
        }
    }

    public void menuList(File path) throws FileNotFoundException {
        int a = 0;

        while (a != 1 && a != 2) {
            System.out.println("Quel type de liste utiliser? \n\t1 : ArrayList \n\t2 : LinkedList");
            a = clavier.lireInt();
            System.out.println();

            switch (a) {
                case 1 -> {
                    cinematheque.parseFilm(path, listeFilmArray);
                    listeFilm = listeFilmArray;
                }

                case 2 -> {
                    cinematheque.parseFilm(path, listeFilmLinked);
                    listeFilm = listeFilmLinked;
                }
            }
        }
    }

    public void menu_Tri() {
        long start, stop;
        Tri tri = new Tri();
        int a = 0;
        while (a != 1 && a != 2 && a != 3) {
            //Menu pour choisir le type de tri
            System.out.println("Quel type de tri souhaitez vous effectuer ?");
            System.out.println("1- Tri Sélection");
            System.out.println("2- Tri Fusion");
            System.out.println("3- Tri Java");
            System.out.println();
            System.out.println("Votre choix ?");
            a = clavier.lireInt();

            switch (a) {
                //Tri Sélection
                case 1 -> {
                    int b;
                    /*start = System.nanoTime();
                    tri.triSelection(listeFilm, 0, listeFilm.size() - 1);
                    stop = System.nanoTime();

                    System.out.println("Temps de tri fusion : " + (float) (stop - start) / 1000000 + " ms\n");*/

                    tri_Selection(menu_Sort());
                    affichage();
                }

                //tri Fusion
                case 2 -> {
                    start = System.nanoTime();
                    tri.triFusion(listeFilm, 0, listeFilm.size() - 1);
                    stop = System.nanoTime();

                    System.out.println("Temps de tri fusion : " + (float) (stop - start) / 1000000 + " ms\n");
                }

                //Tri Java
                case 3 -> {
                    listeFilm.sort(menu_Sort());
                    affichage();
                }
            }
        }
    }

    public void menu_Filtre() {
        int a = 0;
        while (a != 1 && a != 2) {
            System.out.println("Quel type de filtre appliquer ?");
            System.out.println("1- Filtre manuel");
            System.out.println("2- Filtre Java");
            System.out.println();
            System.out.println("Votre choix ?");
            a = clavier.lireInt();

            switch (a) {
                //Filtre manuel
                case 1 -> filtre_Manuel();

                //Filtre java
                case 2 -> filtre_Java();
            }
        }
    }

    public void menu_Recherche() {
        int a = 0;
        while (a != 1 && a != 2) {
            System.out.println("Quel type de recherche appliquer?");
            System.out.println("1- Recherche linéaire");
            System.out.println("2- Recherche dichotomique");
            System.out.println();
            System.out.println("Votre choix ?");
            a = clavier.lireInt();

            //TODO Faire les recherches
            switch (a) {
                //Recherche linéaire
                case 1 -> {
                    recherche_Lineaire();
                }

                //Recherche Dichotomique
                case 2 -> {
                    recherche_Dichotomique();
                }
            }
        }
    }

    public void menu_Sauvegarde() {
        int a = 0;
        while (a != 1 && a != 2) {
            System.out.println("Dans quel type de fichier enregistrer la requête?");
            System.out.println("1- Fichier TSV");
            System.out.println("2- Fichier Binaire");
            System.out.println();
            System.out.println("Votre choix ?");
            a = clavier.lireInt();

            switch (a) {
                //Sauvegarde fichier TSV
                case 1 -> sauvegarde_TSV();

                //Sauvegarde fichier binaire
                case 2 -> sauvegarde_Binaire();
            }
        }
    }

    public void sauvegarde_TSV() {
        try {
            PrintWriter writer = new PrintWriter("maListe.tsv", StandardCharsets.UTF_8);
            writer.println("titre\tannée\tgenre\tdurée\tpays\tlangue\tréalisateur\tscénariste\tliste acteurs\tdescription\tnombre de votes\tnote");
            int i;
            for (i = 0; i < listeFilm.size(); i++) {
                writer.println(listeFilm.get(i).getTitre() + "\t" + listeFilm.get(i).getAnnee_realisation() + "\t" + listeFilm.get(i).getGenre()
                        + "\t" + listeFilm.get(i).getDuree() + "\t" + listeFilm.get(i).getPays_production() + "\t" + listeFilm.get(i).getLangue() + "\t" + listeFilm.get(i).getRealisateur()
                        + "\t" + listeFilm.get(i).getScenariste() + "\t" + listeFilm.get(i).getListe_acteur() + "\t" + listeFilm.get(i).getDescription() + "\t" + listeFilm.get(i).getNbr_votes_spectateurs() + "\t" + listeFilm.get(i).getMoyenne_votes());
            }
            writer.close();
        } catch (IOException u) {
            u.printStackTrace();
        }
    }

    public void sauvegarde_Binaire() {
        try {
            FileOutputStream fos = new FileOutputStream("maListe.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(listeFilm);
            oos.close();
            fos.close();
        } catch (IOException u) {
            u.printStackTrace();
        }
    }

    public void filtre_Manuel() {
        int a = 0;
        long start, stop;
        while (a != 1 && a != 2 && a != 3) {
            start = System.nanoTime();
            a = filtreTexte();
            System.out.println("Fournissez le paramètre que vous voulez retenir");
            String reponse = clavierString.lireString();
            List<Film> toRemove = new ArrayList();

            switch (a) {
                case 1 -> {
                    for (Film film : listeFilm) {
                        if (film.getAnnee_realisation() != Integer.parseInt(reponse)) {
                            toRemove.add(film);
                        }
                    }

                    listeFilm.removeAll(toRemove);
                }

                case 2 -> {
                    for (Film film : listeFilm) {
                        if (!Objects.equals(film.getGenre(), reponse)) {
                            toRemove.add(film);
                        }
                    }

                    listeFilm.removeAll(toRemove);
                }

                case 3 -> {
                    for (Film film : listeFilm) {
                        if (!Objects.equals(film.getLangue(), reponse)) {
                            toRemove.add(film);
                        }
                    }

                    listeFilm.removeAll(toRemove);
                }
            }
            affichage();
            stop = System.nanoTime();
            System.out.println("Temps de filtre manuel : " + (float) (stop - start) / 1000000 + " ms\n");
        }
    }

    public void filtre_Java() {
        int a = 0;
        while (a != 1 && a != 2 && a != 3) {
            a = filtreTexte();

            System.out.println("Fournissez le paramètre que vous voulez retenir");
            String reponse = clavierString.lireString();


            switch (a) {
                case 1 -> listeFilm.removeIf(film -> !(film.getAnnee_realisation() == Integer.parseInt(reponse)));

                case 2 -> listeFilm.removeIf(film -> !film.getGenre().contains(reponse));

                case 3 -> listeFilm.removeIf(film -> !film.getLangue().contains(reponse));
            }
            affichage();
        }
    }

    public int filtreTexte() {
        System.out.println("Sur quel critère souhaitez-vous agir ?");
        System.out.println("1 - L'année de réalisation");
        System.out.println("2 - Le genre du film");
        System.out.println("3 - La langue");
        System.out.println();
        System.out.println("Votre choix ?");
        return clavier.lireInt();
    }

    public Comparator<Film> menu_Sort() {
        Comparator<Film> comparator;
        System.out.println("Quel critère de tri?");
        System.out.println("1 - Titre");
        System.out.println("2 - Année");
        System.out.println("3 - Genre");
        System.out.println("4 - Durée");
        System.out.println("5 - Pays");
        System.out.println("6 - Langue");
        System.out.println("7 - Réalisateur");
        System.out.println("8 - Scénariste");
        System.out.println("9 - Acteurs");
        System.out.println("10 - Description");
        System.out.println("11 - Nombre de votes");
        System.out.println("12 - Moyenne des votes");
        System.out.println();
        System.out.println("Votre choix ?");
        int a = clavier.lireInt();

        switch (a) {
            //Comparateur par titre
            case 1 -> comparator = cinematheque.compareTitre;

            //Comparateur par année
            case 2 -> comparator = cinematheque.compareAnnee;

            //Comparateur par genre
            case 3 -> comparator = cinematheque.compareGenre;

            //Comparateur par durée
            case 4 -> comparator = cinematheque.compareDuree;

            //Comparateur par pays
            case 5 -> comparator = cinematheque.comparePays;

            //Comparateur par langue
            case 6 -> comparator = cinematheque.compareLangue;

            //Comparateur par réalisateur
            case 7 -> comparator = cinematheque.compareRealisateur;

            //Comparateur par scénariste
            case 8 -> comparator = cinematheque.compareScenariste;

            //Comparateur par acteur
            case 9 -> comparator = cinematheque.compareActeurs;

            //Comparateur par Description
            case 10 -> comparator = cinematheque.compareDescription;

            //Comparateur par Nombre de votes
            case 11 -> comparator = cinematheque.compareNbVotes;

            //Comparateur par Moyenne des votes
            case 12 -> comparator = cinematheque.compareNote;
            default -> comparator = cinematheque.compareTitre;
        }
        return comparator;
    }

    public void affichage() {
        int i = 1;
        for (Film film : listeFilm) {
            System.out.println();
            System.out.println(i + ")");
            System.out.println(film);
            i++;
        }
        System.out.println();
    }

    public void suppression() {
        do {
            listeFilm.remove(0);
        } while (!listeFilm.isEmpty());

        System.out.println("La liste a été vidée de toutes ses donées.");
    }

    public void recherche_Lineaire() {
        String recherche;
        boolean film_trouve = false;
        long start, stop;
        start = System.nanoTime();

        System.out.println("Entrez le titre du film");
        recherche = clavierString.lireString();
        for (Film film : listeFilm) {
            if (recherche.compareToIgnoreCase(film.getTitre()) == 0) {
                System.out.println();
                System.out.println(film);
                System.out.println();
                film_trouve = true;
            }
        }
        if (!film_trouve) {
            System.out.println("Aucun film trouvé");
        }
        stop = System.nanoTime();
        System.out.println("Temps de recherche linéaire : " + (float) (stop - start) / 1000000 + " ms\n");
    }

    public void recherche_Dichotomique() {
        String recherche, titre;
        int debut = 0;
        int fin = listeFilm.size();
        int milieu = 0;
        boolean trouve = false;

        listeFilm.sort(cinematheque.compareTitre);

        System.out.println("Entrez le titre du film");
        recherche = clavierString.lireString();

        while (trouve == false && debut <= fin) {
            milieu = ((debut + fin) / 2);
            titre = listeFilm.get(milieu).getTitre();

            if (recherche.equals(titre)) {
                trouve = true;
            } else {
                if (recherche.compareToIgnoreCase(titre) > 0) {
                    debut = milieu + 1;
                } else {
                    fin = milieu - 1;
                }
            }
        }

        if (trouve) {
            System.out.println(listeFilm.get(milieu));
        } else {
            System.out.println("Le film n'est pas présent ou n'existe pas.");
        }
    }

    public void tri_Selection (Comparator < Film > comparator) {
            int i, j, imin;

            for (i = 0; i <= listeFilm.size() - 2; i++) {
                imin = i;
                for (j = i; j <= listeFilm.size() - 1; j++) {
                    if (comparator.compare(listeFilm.get(j), listeFilm.get(imin)) < 0) {
                        imin = j;
                    }
                }
                Collections.swap(listeFilm, i, imin);
            }
        }
}