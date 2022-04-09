package SAEmoi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;


public class Cinematheque {
    public static File file1;
    public static List<Film> listeFilm = new LinkedList<Film>();


    //Fonction pour faire une liste de films en fonction de son type et du fichier choisi
    public static List List(File pathname) throws FileNotFoundException {
        int reponse = 0;
        while ((reponse != 1) && (reponse != 2)) {
            System.out.println("Quel type de liste utiliser? 1:ArrayList ou 2:LinkedList");
            reponse = scanner.lireInt();
        }
        if (reponse == 1) {
            listeFilm = new ArrayList<Film>();

            Scanner scanner = new Scanner(pathname,"UTF-8");
            String titre, annee, genre, duree, pays, langue, real, scenariste, acteur, description, nb_votes, moyenne_votes;
            int anneeN, dureeN, nb_votesN;
            float moyenne_votesN;
            int indexD, indexF;
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String ligne = scanner.nextLine();

                indexD = ligne.indexOf("\t");
                indexD = ligne.indexOf("\t",indexD+1);
                indexF = ligne.indexOf("\t", indexD+1);
                titre = ligne.substring(indexD+1,indexF);
                indexD = indexF;
                indexF = ligne.indexOf("\t",indexD+1);
                annee = ligne.substring(indexD+1,indexF);
                anneeN = Integer.parseInt(annee);
                indexD = ligne.indexOf("\t",indexF+1);
                indexF = ligne.indexOf("\t",indexD+1);
                genre = ligne.substring(indexD+1,indexF);
                indexD = indexF;
                indexF = ligne.indexOf("\t",indexD+1);
                duree = ligne.substring(indexD+1,indexF);
                dureeN = Integer.parseInt(duree);
                indexD = indexF;
                indexF = ligne.indexOf("\t",indexD+1);
                pays = ligne.substring(indexD+1,indexF);
                indexD = indexF;
                indexF = ligne.indexOf("\t",indexD+1);
                langue = ligne.substring(indexD+1,indexF);
                indexD = indexF;
                indexF = ligne.indexOf("\t",indexD+1);
                real = ligne.substring(indexD+1,indexF);
                indexD = indexF;
                indexF = ligne.indexOf("\t",indexD+1);
                scenariste = ligne.substring(indexD+1,indexF);
                indexD = ligne.indexOf("\t",indexF+1);
                indexF = ligne.indexOf("\t",indexD+1);
                acteur = ligne.substring(indexD+1,indexF);
                indexD = indexF;
                indexF = ligne.indexOf("\t",indexD+1);
                description = ligne.substring(indexD+1,indexF);
                indexD = indexF;
                indexF = ligne.indexOf("\t",indexD+1);
                moyenne_votes = ligne.substring(indexD+1,indexF);
                moyenne_votesN = Float.parseFloat(moyenne_votes);
                indexD = indexF;
                indexF = ligne.indexOf("\t",indexD+1);
                nb_votes = ligne.substring(indexD+1,indexF);
                nb_votesN = Integer.parseInt(nb_votes);

                //Film film = new Film(titre,anneeN,genre,dureeN,pays,langue,real,scenariste,acteur,description,nb_votesN,moyenne_votesN);

                listeFilm.add(new Film(titre,anneeN,genre,dureeN,pays,langue,real,scenariste,acteur,description,nb_votesN,moyenne_votesN));
            }
            scanner.close();

        } else if (reponse == 2) {
            listeFilm = new LinkedList<Film>();

            Scanner scanner = new Scanner(pathname,"ISO-8859-1");
            String titre, annee, genre, duree, pays, langue, real, scenariste, acteur, description, nb_votes, moyenne_votes;
            int anneeN, dureeN, nb_votesN;
            float moyenne_votesN;
            int indexD, indexF;
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String ligne = scanner.nextLine();

                indexD = ligne.indexOf("\t");
                indexD = ligne.indexOf("\t",indexD+1);
                indexF = ligne.indexOf("\t", indexD+1);
                titre = ligne.substring(indexD+1,indexF);
                indexD = indexF;
                indexF = ligne.indexOf("\t",indexD+1);
                annee = ligne.substring(indexD+1,indexF);
                anneeN = Integer.parseInt(annee);
                indexD = ligne.indexOf("\t",indexF+1);
                indexF = ligne.indexOf("\t",indexD+1);
                genre = ligne.substring(indexD+1,indexF);
                indexD = indexF;
                indexF = ligne.indexOf("\t",indexD+1);
                duree = ligne.substring(indexD+1,indexF);
                dureeN = Integer.parseInt(duree);
                indexD = indexF;
                indexF = ligne.indexOf("\t",indexD+1);
                pays = ligne.substring(indexD+1,indexF);
                indexD = indexF;
                indexF = ligne.indexOf("\t",indexD+1);
                langue = ligne.substring(indexD+1,indexF);
                indexD = indexF;
                indexF = ligne.indexOf("\t",indexD+1);
                real = ligne.substring(indexD+1,indexF);
                indexD = indexF;
                indexF = ligne.indexOf("\t",indexD+1);
                scenariste = ligne.substring(indexD+1,indexF);
                indexD = ligne.indexOf("\t",indexF+1);
                indexF = ligne.indexOf("\t",indexD+1);
                acteur = ligne.substring(indexD+1,indexF);
                indexD = indexF;
                indexF = ligne.indexOf("\t",indexD+1);
                description = ligne.substring(indexD+1,indexF);
                indexD = indexF;
                indexF = ligne.indexOf("\t",indexD+1);
                moyenne_votes = ligne.substring(indexD+1,indexF);
                moyenne_votesN = Float.parseFloat(moyenne_votes);
                indexD = indexF;
                indexF = ligne.indexOf("\t",indexD+1);
                nb_votes = ligne.substring(indexD+1,indexF);
                nb_votesN = Integer.parseInt(nb_votes);

                //Film film = new Film(titre,anneeN,genre,dureeN,pays,langue,real,scenariste,acteur,description,nb_votesN,moyenne_votesN);

                listeFilm.add(new Film(titre,anneeN,genre,dureeN,pays,langue,real,scenariste,acteur,description,nb_votesN,moyenne_votesN));
            }
            scanner.close();
        }
        return listeFilm;
    }
}

