package SAEmoi;

import java.io.Serializable;
import java.util.Comparator;

public class Film implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String titre;
    private final int annee_realisation;
    private final String genre;
    private final int duree;
    private final String pays_production;
    private final String langue;
    private final String realisateur;
    private final String scenariste;
    private final String liste_acteur;
    private final String description;
    private final int nbr_votes_spectateurs;
    private final float moyenne_votes;

    public Film(String titre, int annee_realisation, String genre, int duree, String pays_production, String langue, String realisateur, String scenariste, String liste_acteur, String description, int nbr_votes_spectateurs, float moyenne_votes) {
        this.titre = titre;
        this.annee_realisation = annee_realisation;
        this.genre = genre;
        this.duree = duree;
        this.pays_production = pays_production;
        this.langue = langue;
        this.realisateur = realisateur;
        this.scenariste = scenariste;
        this.liste_acteur = liste_acteur;
        this.description = description;
        this.nbr_votes_spectateurs = nbr_votes_spectateurs;
        this.moyenne_votes = moyenne_votes;
    }

    // Affichage du film
    @Override
    public String toString() {
        return ("\n- Titre du film : " + titre + "\t\t- Année de réalisation du film : " + annee_realisation +
                "\n- Genre du film : " + genre + "\t\t- Durée du film : " + duree + "\n- Pays de production : " +
                pays_production + "\t\t- Langue du film : " + langue + "\n- Réalisateur du film : " + realisateur +
                "\t\t- Scénariste du film : " + scenariste + "\n- Liste des acteurs du film : " + liste_acteur +
                "\n- Description du film : " + description + "\n- Nombre de votes des spectateurs : " +
                nbr_votes_spectateurs + "\t\t- Moyenne des votes : " + moyenne_votes);
    }


    // Comparaisons des films

    // par titre
    static public Comparator<Film> compareTitre = (f1, f2) -> f1.titre.compareToIgnoreCase(f2.titre);

    // par année
    static public Comparator<Film> compareAnnee = new Comparator<Film>() {

        public int compare(Film f1, Film f2) {
            return Integer.compare(f1.annee_realisation,f2.annee_realisation);
        }
    };

    // par genre
    static public Comparator<Film> compareGenre = new Comparator<Film>() {

        public int compare(Film f1, Film f2) {
            return f1.genre.compareToIgnoreCase(f2.genre);
        }
    };

    // par durée
    static public Comparator<Film> compareDuree = new Comparator<Film>() {

        public int compare(Film f1, Film f2) {
            return Integer.compare(f1.duree,f2.duree);
        }
    };

    // par pays
    static public Comparator<Film> comparePays = new Comparator<Film>() {

        public int compare(Film f1, Film f2) {
            return f1.pays_production.compareToIgnoreCase(f2.pays_production);
        }
    };

    // par langue
    static public Comparator<Film> compareLangue = new Comparator<Film>() {

        public int compare(Film f1, Film f2) {
            return f1.langue.compareToIgnoreCase(f2.langue);
        }
    };

    // par réalisateur
    static public Comparator<Film> compareRealisateur = new Comparator<Film>() {

        public int compare(Film f1, Film f2) {
            return f1.realisateur.compareToIgnoreCase(f2.realisateur);
        }
    };

    // par scénariste
    static public Comparator<Film> compareScenariste = new Comparator<Film>() {

        public int compare(Film f1, Film f2) {
            return f1.scenariste.compareToIgnoreCase(f2.scenariste);
        }
    };

    // par acteurs
    static public Comparator<Film> compareActeurs = new Comparator<Film>() {

        public int compare(Film f1, Film f2) {
            return f1.liste_acteur.compareToIgnoreCase(f2.liste_acteur);
        }
    };

    // par description
    static public Comparator<Film> compareDescription = new Comparator<Film>() {

        public int compare(Film f1, Film f2) {
            return f1.description.compareToIgnoreCase(f2.description);
        }
    };

    // par nombre de votes
    static public Comparator<Film> compareNbVotes = new Comparator<Film>() {

        public int compare(Film f1, Film f2) {
            return Integer.compare(f1.nbr_votes_spectateurs,f2.nbr_votes_spectateurs);
        }
    };

    // par note
    static public Comparator<Film> compareNote = new Comparator<Film>() {

        public int compare(Film f1, Film f2) {
            return Float.compare(f1.moyenne_votes,f2.moyenne_votes);
        }
    };

}
