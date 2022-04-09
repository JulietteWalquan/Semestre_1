package file;

public class FileParChainage implements File {

	private Noeud tete;
	private Noeud queue;
	private int nbElem;

	// Constructeurs
	public FileParChainage() {
		nbElem = 0;
		tete = null;
		queue = null;
	}

	// Les 6 fonctions

	// Savoir si une file est vide
	public boolean fileVide() {
		return (tete == null);
	}

	// Obtenir la longueur d'une file
	public int longueur() {
		return (nbElem);
	}

	// Détermine la valeur de la tête d'une file
	public Object tete() throws FileVideException {
		if (!fileVide()) {
			return (tete.valeur);
		} else {
			throw new FileVideException();
		}
	}

	// Déterminer la valeur de la queue d'une file
	public Object queue() throws FileVideException {
		if (!fileVide()) {
			return (queue.valeur);
		} else {
			throw new FileVideException();
		}
	}

	// Enfiler une valeur à la queue d'une file
	public void enfiler(Object element) {

		Noeud n = new Noeud();

		n.valeur = element;
		n.suivant = null;

		if (fileVide()) {
			tete = n;
		} else {
			queue.suivant = n;
		}

		queue = n;
		nbElem++;
	}

	// Défiler la valeur au sommet d'une file
	public Object defiler() throws FileVideException {
		Object element;

		if (!fileVide()) {
			element = tete.valeur;
			tete = tete.suivant;
			nbElem--;
			return (element);
		} else {
			throw new FileVideException();
		}
	}
}
