package SAE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Cinematheque {

    public void parseFilm(File path, List<Film> filmList) throws FileNotFoundException {
        String titre, annee, genre, duree, pays, langue, real, scenariste, acteur, description, nb_votes, moyenne_votes;
        int anneeN, dureeN, nb_votesN;
        float moyenne_votesN;
        int indexD, indexF;
        Scanner scanner = new Scanner(path);
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String ligne = scanner.nextLine();
            indexD = ligne.indexOf("\t");
            indexD = ligne.indexOf("\t", indexD + 1);
            indexF = ligne.indexOf("\t", indexD + 1);
            titre = ligne.substring(indexD + 1, indexF);
            indexD = indexF;
            indexF = ligne.indexOf("\t", indexD + 1);
            annee = ligne.substring(indexD + 1, indexF);
            anneeN = Integer.parseInt(annee);
            indexD = ligne.indexOf("\t", indexF + 1);
            indexF = ligne.indexOf("\t", indexD + 1);
            genre = ligne.substring(indexD + 1, indexF);
            indexD = indexF;
            indexF = ligne.indexOf("\t", indexD + 1);
            duree = ligne.substring(indexD + 1, indexF);
            dureeN = Integer.parseInt(duree);
            indexD = indexF;
            indexF = ligne.indexOf("\t", indexD + 1);
            pays = ligne.substring(indexD + 1, indexF);
            indexD = indexF;
            indexF = ligne.indexOf("\t", indexD + 1);
            langue = ligne.substring(indexD + 1, indexF);
            indexD = indexF;
            indexF = ligne.indexOf("\t", indexD + 1);
            real = ligne.substring(indexD + 1, indexF);
            indexD = indexF;
            indexF = ligne.indexOf("\t", indexD + 1);
            scenariste = ligne.substring(indexD + 1, indexF);
            indexD = ligne.indexOf("\t", indexF + 1);
            indexF = ligne.indexOf("\t", indexD + 1);
            acteur = ligne.substring(indexD + 1, indexF);
            indexD = indexF;
            indexF = ligne.indexOf("\t", indexD + 1);
            description = ligne.substring(indexD + 1, indexF);
            indexD = indexF;
            indexF = ligne.indexOf("\t", indexD + 1);
            moyenne_votes = ligne.substring(indexD + 1, indexF);
            moyenne_votesN = Float.parseFloat(moyenne_votes);
            indexD = indexF;
            indexF = ligne.indexOf("\t", indexD + 1);
            nb_votes = ligne.substring(indexD + 1, indexF);
            nb_votesN = Integer.parseInt(nb_votes);

            Film film = new Film(titre, anneeN, genre, dureeN, pays, langue, real, scenariste, acteur, description, nb_votesN, moyenne_votesN);
            filmList.add(film);
        }
    }

    //Compare
    //Par titre
    public Comparator<Film> compareTitre = (f1, f2) -> f1.getTitre().compareToIgnoreCase(f2.getTitre());

    //Par année
    public Comparator<Film> compareAnnee = Comparator.comparingInt(Film::getAnnee_realisation);

    //Par genre
    public Comparator<Film> compareGenre = (f1, f2) -> f1.getGenre().compareToIgnoreCase(f2.getGenre());

    //Par durée
    public Comparator<Film> compareDuree = Comparator.comparingInt(Film::getDuree);

    //Par pays
    public Comparator<Film> comparePays = (f1, f2) -> f1.getPays_production().compareToIgnoreCase(f2.getPays_production());

    //Par langue
    public Comparator<Film> compareLangue = (f1, f2) -> f1.getLangue().compareToIgnoreCase(f2.getLangue());

    //Par réalisateur
    public Comparator<Film> compareRealisateur = (f1, f2) -> f1.getRealisateur().compareToIgnoreCase(f2.getRealisateur());

    //Par scénariste
    public Comparator<Film> compareScenariste = (f1, f2) -> f1.getScenariste().compareToIgnoreCase(f2.getScenariste());

    //Par acteurs
    public Comparator<Film> compareActeurs = (f1, f2) -> f1.getListe_acteur().compareToIgnoreCase(f2.getListe_acteur());

    //Par description
    public Comparator<Film> compareDescription = (f1, f2) -> f1.getDescription().compareToIgnoreCase(f2.getDescription());

    //Par nombre de votes
    public Comparator<Film> compareNbVotes = Comparator.comparingInt(Film::getNbr_votes_spectateurs);

    //Par note
    public Comparator<Film> compareNote = (f1, f2) -> Float.compare(f1.getMoyenne_votes(), f2.getMoyenne_votes());

}
