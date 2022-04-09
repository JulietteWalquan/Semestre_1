package jeu;

import java.io.Serializable;
import java.util.Comparator;

public class JeuVideo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nom;
	private String genre;
	private String editeur;
	private int annee;
	private int note;

	static public Comparator<JeuVideo> compareNom = new Comparator<JeuVideo>() {

		public int compare(JeuVideo jv1, JeuVideo jv2) {
			return jv1.nom.compareToIgnoreCase(jv2.nom);
		}
	};

	static public Comparator<JeuVideo> compareGenre = new Comparator<JeuVideo>() {

		public int compare(JeuVideo jv1, JeuVideo jv2) {
			return jv1.genre.compareToIgnoreCase(jv2.genre);
		}
	};
	
	static public Comparator<JeuVideo> compareEditeur = new Comparator<JeuVideo>() {
		
		public int compare(JeuVideo jv1, JeuVideo jv2) {
			return jv1.editeur.compareToIgnoreCase(jv2.editeur);
		}
	};
	
	static public Comparator<JeuVideo> compareAnnee = new Comparator<JeuVideo>() {
		
		public int compare(JeuVideo jv1, JeuVideo jv2) {
			Integer.compare(jv1.annee, jv2.annee);
			return jv1.annee - jv2.annee;
		}
	};
	
	static public Comparator<JeuVideo> compareNote = new Comparator<JeuVideo>() {
		
		public int compare(JeuVideo jv1, JeuVideo jv2) {
			return jv1.note - jv2.note;
		}
	};

	// un constructeur pour donner une valeur à chaque attribut de la classe
	public JeuVideo(String s, String g, String e, int a, int n) {
		nom = s;
		genre = g;
		editeur = e;
		annee = a;
		note = n;

	}

	// fonction utile pour l'affichage
	public String toString() {
		return ("Jeu : " + nom + " ; Genre : " + genre + " (" + editeur + ", " + annee + ")" + " ; Note : " + note);
	}
}
