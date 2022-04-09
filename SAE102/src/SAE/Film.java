package SAE;

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
        return ("- Titre : " + titre +
                "\n- Année de réalisation : " + annee_realisation +
                "\n- Genre  : " + genre +
                "\n- Durée : " + duree +
                "\n- Pays de production : " + pays_production +
                "\n- Langue : " + langue +
                "\n- Réalisateur : " + realisateur +
                "\n- Scénariste : " + scenariste +
                "\n- Liste des acteurs : " + liste_acteur +
                "\n- Description : " + description +
                "\n- Nombre de votes des spectateurs : " + nbr_votes_spectateurs +
                "\n- Moyenne des votes : " + moyenne_votes
        );
    }

    public String getTitre() {
        return titre;
    }

    public int getAnnee_realisation() {
        return annee_realisation;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuree() {
        return duree;
    }

    public String getPays_production() {
        return pays_production;
    }

    public String getLangue() {
        return langue;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public String getScenariste() {
        return scenariste;
    }

    public String getListe_acteur() {
        return liste_acteur;
    }

    public String getDescription() {
        return description;
    }

    public int getNbr_votes_spectateurs() {
        return nbr_votes_spectateurs;
    }

    public float getMoyenne_votes() {
        return moyenne_votes;
    }

}
